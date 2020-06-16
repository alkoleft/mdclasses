package com.github._1c_syntax.mdclasses.unmarshal;

import com.github._1c_syntax.mdclasses.mdo.wrapper.DesignerXRItems;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.reflection.ReflectionConverter;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.mapper.Mapper;

public class ContentConverter extends ReflectionConverter {
  public ContentConverter(Mapper mapper, ReflectionProvider reflectionProvider) {
    super(mapper, reflectionProvider);
  }

  public ContentConverter(Mapper mapper, ReflectionProvider reflectionProvider, Class type) {
    super(mapper, reflectionProvider, type);
  }

  @Override
  public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {

    if (reader.hasMoreChildren()) {
      return super.unmarshal(reader, context);
    } else {
      DesignerXRItems.DesignerXRItem item = new DesignerXRItems.DesignerXRItem();
      item.setValue(reader.getValue());
      return item;
    }
  }
}
