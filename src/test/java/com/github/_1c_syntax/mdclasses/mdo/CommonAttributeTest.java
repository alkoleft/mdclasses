/*
 * This file is a part of MDClasses.
 *
 * Copyright © 2019 - 2020
 * Tymko Oleg <olegtymko@yandex.ru>, Maximov Valery <maximovvalery@gmail.com> and contributors
 *
 * SPDX-License-Identifier: LGPL-3.0-or-later
 *
 * MDClasses is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 *
 * MDClasses is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with MDClasses.
 */
package com.github._1c_syntax.mdclasses.mdo;

import com.github._1c_syntax.mdclasses.metadata.Configuration;
import com.github._1c_syntax.mdclasses.metadata.additional.MDOType;
import com.github._1c_syntax.mdclasses.metadata.additional.UseMode;
import io.vavr.control.Either;
import org.assertj.core.util.Streams;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;

class CommonAttributeTest extends AbstractMDOTest {
  CommonAttributeTest() {
    super(MDOType.COMMON_ATTRIBUTE);
  }

  @Override
  @Test
  void testEDT() {
    var mdo = getMDObjectEDT("CommonAttributes/ОбщийРеквизит1/ОбщийРеквизит1.mdo");
    checkAttribute(mdo);

    mdo = getMDObjectEDT("CommonAttributes/Автоиспользование/Автоиспользование.mdo");
    checkAutoUsedAttribute(mdo);
  }

  @Test
  void testEDTFull() {
    File srcPath = new File("src/test/resources/metadata/edt");
    Configuration configuration = Configuration.create(srcPath.toPath());

    checkConfiguration(configuration);
  }

  @Override
  @Test
  void testDesigner() {
    var mdo = getMDObjectDesigner("CommonAttributes/ОбщийРеквизит1.xml");
    checkAttribute(mdo);

    mdo = getMDObjectDesigner("CommonAttributes/Автоиспользование.xml");
    checkAutoUsedAttribute(mdo);
  }

  void checkConfiguration(Configuration configuration){
    assertThat(
      configuration.getChildren().stream()
        .filter(CommonAttribute.class::isInstance)
        .map(CommonAttribute.class::cast)
        .flatMap(c -> c.getContent().stream())
        .map(CommonAttributeContent::getMetadata)
        .filter(Either::isRight)
    ).hasSize(9);

    Set<String> objectNames = Set.copyOf(commonAttribute1Content());

    var objects = configuration.getChildren().stream()
      .filter(mdo -> objectNames.contains(mdo.getMdoReference().getMdoRef()))
      .map(MDObjectComplex.class::cast)
      .collect(Collectors.toList());

    assertThat(objects).hasSize(objectNames.size());
    assertThat(objects.stream()
      .flatMap(mdObjectComplex -> mdObjectComplex.getAttributes().stream())
      .filter(mdoAttribute -> mdoAttribute.getName().equals("ОбщийРеквизит1"))
    ).hasSize(objectNames.size() - 1);

  }
  @Test
  void testDesignerFull() {

    File srcPath = getMDOPathDesigner("").toFile();
    Configuration configuration = Configuration.create(srcPath.toPath());

    checkConfiguration(configuration);
  }

  <T> Stream<T> childrenOfClass(Configuration configuration, Class<T> clazz){
    return configuration.getChildren().stream()
      .filter(clazz::isInstance)
      .map(clazz::cast);
  }

  void checkAttribute(MDObjectBase mdo) {
    checkBaseField(mdo, CommonAttribute.class, "ОбщийРеквизит1",
      "d4f0c0ac-ed26-4085-a1b4-e52314b973ad");
    checkNoChildren(mdo);
    checkNoModules(mdo);

    CommonAttribute attribute = (CommonAttribute) mdo;

    assertThat(attribute).as("Check 'ОбщийРеквизит1'")
      .extracting("AutoUse")
      .contains(UseMode.DONT_USE);

    assertThat(attribute.getContent()).as("Check content of 'ОбщийРеквизит1'")
      .hasSize(commonAttribute1Content().size())
      .extracting(CommonAttributeContent::getUse)
      .as("Check content useMode of 'ОбщийРеквизит1'")
      .contains(UseMode.USE, UseMode.DONT_USE)
      .filteredOn(useMode -> useMode.equals(UseMode.USE))
      .hasSize(commonAttribute1Content().size() - 1);

    assertThat(attribute.getContent()).as("Check content metadata of 'ОбщийРеквизит1'")
      .extracting(CommonAttributeContent::getMetadata)
      .extracting(Either::getLeft)
      .containsAll(commonAttribute1Content());
  }

  void checkAutoUsedAttribute(MDObjectBase mdo) {
    checkBaseField(mdo, CommonAttribute.class, "Автоиспользование",
      "0d367c16-880a-4ecf-bb9a-b98438fead9a");
    checkNoChildren(mdo);
    checkNoModules(mdo);

    CommonAttribute attribute = (CommonAttribute) mdo;

    assertThat(attribute).as("Check 'Автоиспользование'")
      .extracting("AutoUse")
      .contains(UseMode.USE);

    assertThat(attribute.getContent()).as("Check content of 'Автоиспользование'")
      .hasSize(1)
      .extracting(CommonAttributeContent::getMetadata, CommonAttributeContent::getUse)
      .contains(tuple(Either.left("ChartOfCharacteristicTypes.ПланВидовХарактеристик1"), UseMode.DONT_USE));
  }

  private static List<String> commonAttribute1Content() {
    return List.of("ExchangePlan.ПланОбмена1"
      , "Catalog.Справочник1"
      , "Document.Документ1"
      , "ChartOfAccounts.ПланСчетов1"
      , "CalculationRegister.РегистрРасчета1"
      , "Task.Задача1"
      , "AccumulationRegister.РегистрНакопления1"
      , "ChartOfCharacteristicTypes.ПланВидовХарактеристик1");
  }

}
