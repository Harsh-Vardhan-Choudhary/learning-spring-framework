package com.harsh.learningspringframework.examples.g1;

import java.text.Annotation;
import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
//@Component
class BusinessService
{
	private DataService dataService;

	@Inject
	//@Autowired
	public void setDataService(DataService dataService) {
		System.out.println("Setter injection is performed");
		this.dataService = dataService;
	}

	public DataService getDataService() {
		return dataService;
	}
}

@Named
//@Component
class DataService
{

}

@Configuration
@ComponentScan
public class cdiContextLauncherApplication 
{
	public static void main(String[] args)
	{
		try (var context = new AnnotationConfigApplicationContext(cdiContextLauncherApplication.class)) 
		{
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(BusinessService.class).getDataService());
		} 
	}
}