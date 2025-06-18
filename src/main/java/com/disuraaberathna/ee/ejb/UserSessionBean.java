package com.disuraaberathna.ee.ejb;

import com.disuraaberathna.ee.interceptor.AInterceptor;
import com.disuraaberathna.ee.interceptor.TestInterceptor;
import jakarta.ejb.Stateless;
import jakarta.interceptor.Interceptors;

@Stateless
@Interceptors({TestInterceptor.class, AInterceptor.class})
public class UserSessionBean {
    public void doAction(String name, int age) {
        System.out.println("UserSessionBean - doAction : " + name + ", " + age);
    }
}
