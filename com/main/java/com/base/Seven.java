package com.base;

import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;


@Target({FIELD,METHOD})
@Retention(RUNTIME)
public @interface Seven {
  public String value () default "";
  public String  property() default "";
}
