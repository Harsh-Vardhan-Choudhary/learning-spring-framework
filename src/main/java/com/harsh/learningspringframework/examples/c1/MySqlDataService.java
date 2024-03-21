package com.harsh.learningspringframework.examples.c1;

import org.springframework.stereotype.Component;

@Component
public class MySqlDataService implements DataService
{
    @Override
    public int[] retievalData() 
    {
        return new int [] {11,22,33,44,55};
    }

}
