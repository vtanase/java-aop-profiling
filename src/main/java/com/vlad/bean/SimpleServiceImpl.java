package com.vlad.bean;

import org.springframework.stereotype.Service;

@Service
public class SimpleServiceImpl implements SimpleService {

    public void timedMethod() throws InterruptedException {
        System.out.println("In timed method");
        Thread.sleep(3000);
    }

    public void otherTimedMethod() throws InterruptedException {
        System.out.println("In other timed method");
        Thread.sleep(2000);
    }
}