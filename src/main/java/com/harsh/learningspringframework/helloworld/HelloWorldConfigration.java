package com.harsh.learningspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address) {};
record Address (String firstLine, String city) {};

@Configuration
public class HelloWorldConfigration 
{
    @Bean
    public String name()
    {
        return "Harsh";
    }
    
    @Bean
    public int age()
    {
        return 20;
    }

    @Bean
    public Person person()
    {
        var person = new Person("Arpit", 21, new Address("Down Hill", "California"));
        return person;
    }

    @Bean
    public Person person2MethodCall()
    {
        return new Person(name(), age(), address());   //name, age
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address2)
    {
        return new Person(name, age, address2);   //name, age
    }

    @Bean(name = "address2")
    @Primary
    public Address address()
    {
        return new Address("Baker Street", "London");
    }

    @Bean(name = "address3")
    @Qualifier("address3qualifier")
    public Address address3()
    {
        return new Address("Madhav Gang", "Gwalior");
    }

    @Bean(name = "address4")
    public Address address4()
    {
        return new Address("Indraprasth", "Khurai");
    }
}