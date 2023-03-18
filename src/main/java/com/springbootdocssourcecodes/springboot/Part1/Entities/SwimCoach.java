package com.springbootdocssourcecodes.springboot.Part1.Entities;

public class SwimCoach implements Coach {
    public SwimCoach() {

    }
    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up.";
    }
}
