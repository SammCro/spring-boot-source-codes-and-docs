package com.springbootdocssourcecodes.springboot.Part1.Config;

import com.springbootdocssourcecodes.springboot.Part1.Entities.Coach;
import com.springbootdocssourcecodes.springboot.Part1.Entities.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoachConfig {
    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
