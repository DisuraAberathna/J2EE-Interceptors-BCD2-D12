package com.disuraaberathna.ee.interceptor;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.InvocationContext;

public class TestInterceptor {
    @AroundInvoke
    public Object intercept(InvocationContext ctx) throws Exception {
        System.out.println("TestInterceptor - intercept");
        return ctx.proceed();
    }
}
