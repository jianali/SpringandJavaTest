package com.lj.test;


import java.lang.annotation.*;

//表示该注解在运行的时候也会生效
@Retention(RetentionPolicy.RUNTIME)
@Documented
//说明这个注解只能用在类型上（比如类、接口、枚举）
@Target(ElementType.TYPE)
//相当于被这个注解过的父类，小孩也能得到注解
@Inherited
//可以重复的注解
//@Repeatable()
public @interface TestAnnotation {
//    注解的属性
    int id() default -1;
    String msg() default "Hi";

}
