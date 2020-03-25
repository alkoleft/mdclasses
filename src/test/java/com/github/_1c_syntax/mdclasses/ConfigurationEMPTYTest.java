package com.github._1c_syntax.mdclasses;

import com.github._1c_syntax.mdclasses.mdo.CommonModule;
import com.github._1c_syntax.mdclasses.metadata.Configuration;
import com.github._1c_syntax.mdclasses.metadata.additional.ConfigurationSource;
import com.github._1c_syntax.mdclasses.metadata.additional.ModuleType;
import com.github._1c_syntax.utils.Absolute;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;

public class ConfigurationEMPTYTest {
  @Test
  void testBuilder() {

    Configuration configuration = Configuration.create(null);

    assertThat(configuration).isNotNull();
    assertThat(configuration.getConfigurationSource()).isEqualTo(ConfigurationSource.EMPTY);

    File file = new File("src/test/resources/metadata/edt/src/Constants/Константа1/ManagerModule.bsl");
    assertThat(configuration.getModuleType(Absolute.uri(file))).isEqualTo(ModuleType.Unknown);

    Configuration configuration2 = Configuration.create();

    assertThat(configuration2).isNotNull();
    assertThat(configuration2.getConfigurationSource()).isEqualTo(ConfigurationSource.EMPTY);
    assertThat(configuration2.getChildren().stream().filter(mdObject ->
      mdObject instanceof CommonModule && mdObject.getName().equals("НесуществущийМодуль"))
      .findFirst().isPresent()).isFalse();
  }
}
