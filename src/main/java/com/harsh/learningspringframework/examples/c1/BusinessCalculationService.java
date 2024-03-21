package com.harsh.learningspringframework.examples.c1;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationService 
{
    private DataService dataService;

    //constructor
    public BusinessCalculationService(DataService dataService)
    {
        super();
        this.dataService = dataService;
    }

    public int findMax()
    {
        return Arrays.stream(dataService.retievalData()).max().orElse(0);
    }
}
