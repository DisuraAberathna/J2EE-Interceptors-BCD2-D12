package com.disuraaberathna.ee.interceptor;

import com.disuraaberathna.ee.annotation.Loggin;
import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

import java.util.Map;

@Interceptor
@Loggin
@Priority(2)
public class AInterceptor {
    @AroundInvoke
    public Object aroundInvoke(InvocationContext ctx) throws Exception {
//        System.out.println("AInterceptor - intercept : " + ctx.getMethod().getName());
        System.out.println("AInterceptor - intercept : start");
//        Map<String, Object> map = ctx.getContextData();
//        System.out.println("context data : " + map);
        Object proceed = ctx.proceed();
        System.out.println("AInterceptor - intercept : proceed / " + proceed);

        System.out.println("AInterceptor - intercept : end");
        return "A";
    }
}
