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

import com.github._1c_syntax.mdclasses.metadata.additional.MDOType;
import com.github._1c_syntax.mdclasses.metadata.additional.UseMode;
import io.vavr.control.Either;
import org.junit.jupiter.api.Test;

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

  @Override
  @Test
  void testDesigner() {
    var mdo = getMDObjectDesigner("CommonAttributes/ОбщийРеквизит1.xml");
    checkAttribute(mdo);

    mdo = getMDObjectDesigner("CommonAttributes/Автоиспользование.xml");
    checkAutoUsedAttribute(mdo);
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
      .hasSize(8)
      .extracting(CommonAttributeContent::getUse)
      .as("Check content useMode of 'ОбщийРеквизит1'")
      .contains(UseMode.USE, UseMode.DONT_USE)
      .filteredOn(useMode -> useMode.equals(UseMode.USE))
      .hasSize(7);

    assertThat(attribute.getContent()).as("Check content metadata of 'ОбщийРеквизит1'")
      .extracting(CommonAttributeContent::getMetadata)
      .extracting(Either::getLeft)
      .contains("ExchangePlan.ПланОбмена1"
        , "ChartOfAccounts.ПланСчетов1"
        , "AccumulationRegister.РегистрНакопления1"
        , "CalculationRegister.РегистрРасчета1"
        , "Task.Задача1"
        , "Document.Документ1"
        , "Catalog.Справочник1"
        , "ChartOfCharacteristicTypes.ПланВидовХарактеристик1"
      );
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

}
