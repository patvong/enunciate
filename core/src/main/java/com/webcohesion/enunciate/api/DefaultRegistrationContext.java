package com.webcohesion.enunciate.api;

import com.webcohesion.enunciate.javac.javadoc.JavaDocTagHandler;
import com.webcohesion.enunciate.javac.javadoc.JavaDocTagHandlerFactory;

/**
 * @author Ryan Heaton
 */
public class DefaultRegistrationContext implements ApiRegistrationContext {

  @Override
  public JavaDocTagHandler getTagHandler() {
    return JavaDocTagHandlerFactory.getTagHandler();
  }
}
