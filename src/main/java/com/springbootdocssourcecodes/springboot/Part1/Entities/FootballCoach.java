package com.springbootdocssourcecodes.springboot.Part1.Entities;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return ("Practice free kicks for 15 minutes");
    }
}
