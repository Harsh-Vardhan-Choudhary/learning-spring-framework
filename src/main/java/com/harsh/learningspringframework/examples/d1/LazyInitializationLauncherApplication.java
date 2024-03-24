package com.harsh.learningspringframework.examples.d1;

import java.text.Annotation;
import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA
{

}

@Component
@Lazy
class ClassB
{
	private ClassA classA;

	//constructor
	public ClassB(ClassA classA)
	{
		//Logic
		System.out.println("Some initatisation");
		this.classA = classA;
	}

	// public void doSomething()
	// {
	// 	System.out.println("Do Something");
	// }
}

@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication 
{
	public static void main(String[] args)
	{
		try (var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)) 
		{
			//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

			//System.out.println("Initialization of context is completed");
			//context.getBean(ClassB.class);
		} 
	}
}