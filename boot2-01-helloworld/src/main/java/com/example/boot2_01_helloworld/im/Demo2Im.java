package com.example.boot2_01_helloworld.im;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * class description<br>
 *
 * @author wangguocheng
 * @version 1.0
 * @date 2021/6/30 17:08
 * @since JDK 1.8+
 */
public class Demo2Im implements ImportSelector {
  @Override
  public String[] selectImports(AnnotationMetadata importingClassMetadata) {
    return new String[] {"com.example.boot2_01_helloworld.im.demo2"};
  }
}
