package com.lj.test;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//表示该注解在运行的时候也会生效
@Retention(RetentionPolicy.RUNTIME)

public @interface TestAnnotation {

}
