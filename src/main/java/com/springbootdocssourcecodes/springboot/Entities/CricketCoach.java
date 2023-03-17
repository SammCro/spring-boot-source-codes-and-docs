package com.springbootdocssourcecodes.springboot.Entities;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class CricketCoach implements Coach{
    @PostConstruct
    public void init() {

    }
    @PreDestroy
    public void destroy() {

    }
    @Override
    public String getDailyWorkout() {
        return ("Practice fast bowling for 15 minutes");
    }

}
