package com.springbootdocssourcecodes.springboot;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class CricketCoach implements Coach{
    @PostConstruct
    public void init() {
        System.out.println("CricketCoach: inside init method" + getClass().getSimpleName());
    }
    @PreDestroy
    public void destroy() {
        System.out.println("CricketCoach: inside destroy method" + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return ("Practice fast bowling for 15 minutes");
    }

}
