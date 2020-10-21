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

import com.github._1c_syntax.mdclasses.mdo.wrapper.DesignerMDO;
import com.github._1c_syntax.mdclasses.metadata.additional.CompatibilityMode;
import com.github._1c_syntax.mdclasses.metadata.additional.ConfigurationExtensionPurpose;
import com.github._1c_syntax.mdclasses.metadata.additional.MDOType;
import com.github._1c_syntax.mdclasses.metadata.additional.ObjectBelonging;
import com.github._1c_syntax.mdclasses.metadata.additional.ScriptVariant;
import com.github._1c_syntax.mdclasses.metadata.additional.UseMode;
import com.github._1c_syntax.mdclasses.unmarshal.Group;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import io.vavr.control.Either;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Collections;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true, onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class MDOConfiguration extends MDObjectBSL {

  /**
   * Вариант языка исходного кода
   */
  @Group("Properties")
  @XStreamAlias("ScriptVariant")
  private ScriptVariant scriptVariant = ScriptVariant.ENGLISH;

  /**
   * Режим совместимости конфигурации
   */
  @Group("Properties")
  @XStreamAlias("CompatibilityMode")
  private CompatibilityMode compatibilityMode = new CompatibilityMode();

  /**
   * Режим совместимости расширений конфигурации
   */
  @Group("Properties")
  @XStreamAlias("ConfigurationExtensionCompatibilityMode")
  private CompatibilityMode configurationExtensionCompatibilityMode = new CompatibilityMode();

  /**
   * Использование модального режима
   */
  @Group("Properties")
  @XStreamAlias("ModalityUseMode")
  private UseMode modalityUseMode = UseMode.USE;

  /**
   * Использование синхронных вызовов расширений и внешних компонент
   */
  @Group("Properties")
  @XStreamAlias("SynchronousExtensionAndAddInCallUseMode")
  private UseMode synchronousExtensionAndAddInCallUseMode = UseMode.USE;

  /**
   * Использования синхронных вызовов расширений платформы и внешних компонент
   */
  @Group("Properties")
  @XStreamAlias("SynchronousPlatformExtensionAndAddInCallUseMode")
  private UseMode synchronousPlatformExtensionAndAddInCallUseMode = UseMode.USE;

  /**
   * Режим запуска клиента по умолчанию
   */
  @Group("Properties")
  @XStreamAlias("DefaultRunMode")
  private String defaultRunMode = "";

  /**
   * Язык приложения по умолчанию
   */
  @Group("Properties")
  @XStreamAlias("DefaultLanguage")
  private Either<String, Language> defaultLanguage;

  /**
   * Режим управления блокировками
   */
  @Group("Properties")
  @XStreamAlias("DataLockControlMode")
  private String dataLockControlMode = "";

  /**
   * Режим автонумерации объектов
   */
  @Group("Properties")
  @XStreamAlias("ObjectAutonumerationMode")
  private String objectAutonumerationMode = "";

  @Override
  public ObjectBelonging getObjectBelonging() {
    return super.getObjectBelonging();
  }

  /**
   * Все объекты конфигурации первого уровня
   */
  @Group("ChildObjects")
  @XStreamImplicit
  private List<Either<String, MDObjectBase>> children = Collections.emptyList();

  /**
   * Назначение расширения конфигурации
   */
  @Group("Properties")
  @XStreamAlias("ConfigurationExtensionPurpose")
  private ConfigurationExtensionPurpose configurationExtensionPurpose = ConfigurationExtensionPurpose.PATCH;

  /**
   * Префикс собственных объектов расширения
   */
  @Group("Properties")
  @XStreamAlias("NamePrefix")
  private String namePrefix = "";

  @Override
  public MDOType getType() {
    return MDOType.CONFIGURATION;
  }

}
