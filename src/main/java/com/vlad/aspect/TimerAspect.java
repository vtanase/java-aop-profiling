package com.vlad.aspect;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.util.StopWatch;

@Aspect
public class TimerAspect {

    @Around("within(@org.springframework.stereotype.Service *)")
    public void methodTimer(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Before " + joinPoint.getSignature().getName());
        StopWatch timer = new StopWatch();
        timer.start(joinPoint.getSignature().getName());
        joinPoint.proceed();
        timer.stop();
        System.out.println("After " + joinPoint.getSignature().getName());
        System.out.println(timer.prettyPrint());
    }
}