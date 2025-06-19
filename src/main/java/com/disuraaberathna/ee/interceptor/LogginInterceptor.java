package com.disuraaberathna.ee.interceptor;

import com.disuraaberathna.ee.annotation.Loggin;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor
@Loggin
public class LogginInterceptor {
    @AroundInvoke
    public Object intercept(InvocationContext ic) throws Exception {
        return  ic.proceed();
    }
}
