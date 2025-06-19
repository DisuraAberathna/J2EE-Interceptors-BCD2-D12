package com.disuraaberathna.ee.ejb;

import com.disuraaberathna.ee.annotation.TimeoutLogger;
import jakarta.ejb.Schedule;
import jakarta.ejb.Stateless;
import jakarta.ejb.Timeout;

@Stateless
@TimeoutLogger
public class TimerSessionBean {
    @Schedule(hour = "*", minute = "*", second = "*/10", persistent = false)
    @Timeout
    public void doAction() {
        System.out.println("TimerSessionBean doAction");
    }
}
