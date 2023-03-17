package com.springbootdocssourcecodes.springboot.Entities;

import com.springbootdocssourcecodes.springboot.Entities.Coach;

public class SwimCoach implements Coach {
    public SwimCoach() {

    }
    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up.";
    }
}
