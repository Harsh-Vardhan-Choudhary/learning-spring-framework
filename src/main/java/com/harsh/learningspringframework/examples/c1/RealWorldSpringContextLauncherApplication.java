package com.harsh.learningspringframework.examples.c1;

import java.text.Annotation;
import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class RealWorldSpringContextLauncherApplication 
{
	public static void main(String[] args)
	{
		try (var context = new AnnotationConfigApplicationContext(RealWorldSpringContextLauncherApplication.class)) 
		{
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		} 
	}
}