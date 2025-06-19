package com.disuraaberathna.ee.interceptor;

import com.disuraaberathna.ee.annotation.TimeoutLogger;
import jakarta.annotation.Priority;
import jakarta.interceptor.AroundTimeout;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

import java.util.Timer;

@TimeoutLogger
@Interceptor
@Priority(1)
public class TimeInterceptor {
    @AroundTimeout
    public Object aroundTimeout(InvocationContext ic) throws Exception {
        System.out.println("TimerInterceptor - aroundTimeout...");
//        Timer timer = (Timer) ic.getTimer();
//        timer.cancel();

        Object proceed = ic.proceed();


        return proceed;
    }
}
