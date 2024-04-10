package com.harsh.learningspringframework.examples.f1;

import java.text.Annotation;
import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass
{
	private SomeDependency someDependency;
	
	public SomeClass(SomeDependency someDependency)
	{
		super();
		this.someDependency = someDependency;
		System.out.println("All dependency are ready!");
	}

	@PostConstruct
	public void initialize()
	{
		someDependency.getReady();
	}

	@PreDestroy
	public void cleanup()
	{
		System.out.println("Cleanup");
	}

}

@Component
class SomeDependency
{
	public void getReady()
	{
		System.out.println("Some logic using SomeDependency");
	}
}

@Configuration
@ComponentScan
public class PrePostAnnotationContextLauncherApplication 
{
	public static void main(String[] args)
	{
		try (var context = new AnnotationConfigApplicationContext(PrePostAnnotationContextLauncherApplication.class)) 
		{
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		} 
	}
}