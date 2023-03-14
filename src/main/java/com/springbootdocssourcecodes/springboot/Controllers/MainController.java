package com.springbootdocssourcecodes.springboot.Controllers;

import com.springbootdocssourcecodes.springboot.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MainController {

    @Autowired
    private Coach coach;
    @GetMapping("/getDailyWorkout")
    public String index() {
        return coach.getDailyWorkout();
    }
}
