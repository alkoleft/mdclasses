package com.github._1c_syntax.mdclasses.mdo;

import com.github._1c_syntax.mdclasses.mdo.wrapper.DesignerXRItem;
import com.github._1c_syntax.mdclasses.metadata.additional.UseMode;
import io.vavr.control.Either;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CommonAttributeContent {

  private Either<String, MDObjectComplex> metadata;
  private UseMode use;

  public CommonAttributeContent(DesignerXRItem designerMDO) {
    metadata = Either.left(designerMDO.getMetadata());
    use = designerMDO.getUse();
  }
}
