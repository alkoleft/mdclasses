package com.github._1c_syntax.mdclasses.mdo.wrapper;

import com.github._1c_syntax.mdclasses.metadata.additional.UseMode;
import com.github._1c_syntax.mdclasses.unmarshal.ContentConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@XStreamConverter(value = ContentConverter.class)
@NoArgsConstructor
public class DesignerXRItem {

  private String value;

  @XStreamAlias("xr:Metadata")
  private String metadata;

  @XStreamAlias("xr:Use")
  private UseMode use;

}