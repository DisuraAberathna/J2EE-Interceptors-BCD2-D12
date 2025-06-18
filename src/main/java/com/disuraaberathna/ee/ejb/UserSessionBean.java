package com.disuraaberathna.ee.ejb;

import com.disuraaberathna.ee.interceptor.TestInterceptor;
import jakarta.ejb.Stateless;
import jakarta.interceptor.Interceptors;

@Stateless
@Interceptors(TestInterceptor.class)
public class UserSessionBean {
    public void doAction(){
        System.out.println("UserSessionBean - doAction");
    }
}
