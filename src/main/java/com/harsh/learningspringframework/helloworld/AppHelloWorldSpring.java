package com.harsh.learningspringframework.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppHelloWorldSpring
{
    public static void main(String args[])
    {

    //1. Launch a Spring Context

    var context = new AnnotationConfigApplicationContext(HelloWorldConfigration.class);

    //2. Configure the things that we want Spring to manage - @Configration  
    //HelloWorldConfiguration - @Configration
    //name - @Bean

    //3. Retrieving Beans managed by Spring
    
    System.out.println(context.getBean("name"));

    System.out.println(context.getBean("age"));

    System.out.println(context.getBean("person"));

    System.out.println(context.getBean("person2MethodCall"));

    System.out.println(context.getBean("person3Parameters"));

    System.out.println(context.getBean("person"));

    System.out.println(context.getBean("address2"));

    System.out.println(context.getBean(Address.class));

    //listing all bean managed vy spring framework
    Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);   //functional programming

    }
}