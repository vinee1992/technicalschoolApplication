package com.technicalshool.utilities;

import org.springframework.stereotype.Component;

@Component
public class BeanLifeCycleTest {

     BeanLifeCycleTest(){
        System.out.println("bean life cycle test");
    }
}
