package com.disuraaberathna.ee.interceptor;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.interceptor.AroundConstruct;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.InvocationContext;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;

public class TestInterceptor {

    @AroundConstruct
    public void aroundConstruct(InvocationContext ctx){
        System.out.println("TestInterceptor - aroundConstruct : " + ctx.getConstructor());
    }

    @PostConstruct
    public void init(InvocationContext ctx) {
        Constructor<?> constructor=ctx.getConstructor();

        System.out.println("TestInterceptor init");
    }

    @AroundInvoke
    public Object intercept(InvocationContext ctx) throws Exception {
//        System.out.println("TestInterceptor - intercept");
        System.out.println("TestInterceptor - intercept : start");

//        Method method = ctx.getMethod();
//        System.out.println("TestInterceptor - method" + method);

//        Object[] parameters = ctx.getParameters();
//        Arrays.stream(parameters).forEach(System.out::println);

//        ctx.setParameters(new Object[]{"A", 50});

//        Object target = ctx.getTarget();
//        System.out.println("Target : " + target);

//        Map<String, Object> map = ctx.getContextData();
//        System.out.println("contextData: " + map);
//        map.put("name", "ABC");

        // InvocationContext used for single scope like as a one context for a one single method call
        // InvocationContext works in a local scope

        // Can not inject InvocationContext

//        Constructor<?> constructor = ctx.getConstructor();
//        System.out.println(constructor);

        Object proceed = ctx.proceed();
        System.out.println("TestInterceptor - intercept : proceed / " + proceed);

        if (true)
            throw new Exception("TestInterceptor exception");

        System.out.println("TestInterceptor - intercept : end");

        return proceed;
    }

    @PreDestroy
    public void destroy(InvocationContext ctx) {
        System.out.println("TestInterceptor - destroy");
    }
}
