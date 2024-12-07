package com.technicalshool.utilities;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class BeanLifeCycleTest {



    @PostConstruct
    public void init(){
        System.out.println("called after creating bean of BeanLifeCycleTest");
    }

    BeanLifeCycleTest(){
        System.out.println("bean life cycle test");
    }
}
