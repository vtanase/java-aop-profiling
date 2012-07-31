package com.vlad;

import com.vlad.aspect.TimerAspect;
import com.vlad.bean.SimpleService;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main( String[] args ) {
        ConfigurableApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        SimpleService simpleService = (SimpleService) appContext.getBean("simpleServiceImpl");
        if (simpleService == null) {
            System.out.println("The service was null!");
        } else {
            try {
                simpleService.timedMethod();
                simpleService.otherTimedMethod();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
