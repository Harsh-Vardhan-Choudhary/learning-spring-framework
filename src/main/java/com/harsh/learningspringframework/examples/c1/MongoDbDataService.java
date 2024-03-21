package com.harsh.learningspringframework.examples.c1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbDataService implements DataService
{

    @Override
    public int[] retievalData() 
    {
        return new int [] {1,2,3,4,5};
    }
    
}
