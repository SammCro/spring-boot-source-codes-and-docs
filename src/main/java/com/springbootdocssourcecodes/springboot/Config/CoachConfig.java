package com.springbootdocssourcecodes.springboot.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.springbootdocssourcecodes.springboot.Entities.Coach;
import com.springbootdocssourcecodes.springboot.Entities.SwimCoach;
@Configuration
public class CoachConfig {
    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
