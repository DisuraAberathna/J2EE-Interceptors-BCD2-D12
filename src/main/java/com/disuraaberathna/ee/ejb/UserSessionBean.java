package com.disuraaberathna.ee.ejb;

import com.disuraaberathna.ee.annotation.Loggin;
import com.disuraaberathna.ee.interceptor.AInterceptor;
import com.disuraaberathna.ee.interceptor.TestInterceptor;
import jakarta.ejb.Stateless;
import jakarta.interceptor.Interceptors;

@Stateless
//@Interceptors({TestInterceptor.class, AInterceptor.class})
@Loggin
public class UserSessionBean {
    public String doAction(String name, int age) {
        System.out.println("UserSessionBean - doAction : start");
        System.out.println("UserSessionBean - doAction : " + name + ", " + age);
        System.out.println("UserSessionBean - doAction : end");

        return "success";
    }
}
