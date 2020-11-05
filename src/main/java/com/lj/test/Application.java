package com.lj.test;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 代码结构参考https://spring.io/guides/gs/spring-boot/
 * 文档参考：https://docs.spring.io/spring-boot/docs/current/reference/html/
 */

//本质上这个注解是一个组合注解，里面包含@Configure配置类 @EnableAutoConfiguration自动配置
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
