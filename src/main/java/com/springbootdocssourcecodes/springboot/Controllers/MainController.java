package com.springbootdocssourcecodes.springboot.Controllers;

import com.springbootdocssourcecodes.springboot.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MainController {
    private Coach coach;
    @Autowired
    public MainController(@Qualifier("footballCoach") Coach coach) {
        this.coach = coach;
    }
    @GetMapping("/getDailyWorkout")
    public String index() {
        return coach.getDailyWorkout();
    }
}
