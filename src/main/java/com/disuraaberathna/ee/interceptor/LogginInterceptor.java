package com.disuraaberathna.ee.interceptor;

import com.disuraaberathna.ee.annotation.Loggin;
import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor
@Loggin
@Priority(1)
public class LogginInterceptor {
    @AroundInvoke
    public Object intercept(InvocationContext ic) throws Exception {
        return  ic.proceed();
    }
}
