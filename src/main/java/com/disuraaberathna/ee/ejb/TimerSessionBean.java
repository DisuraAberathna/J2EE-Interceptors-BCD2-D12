package com.disuraaberathna.ee.ejb;

import jakarta.ejb.Schedule;
import jakarta.ejb.Stateless;

@Stateless
public class TimerSessionBean {
    @Schedule(hour = "*", minute = "*", second = "*/10", persistent = false)
    public void doAction() {
        System.out.println("TimerSessionBean doAction");
    }
}
