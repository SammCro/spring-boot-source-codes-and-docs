package com.springbootdocssourcecodes.springboot.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.springbootdocssourcecodes.springboot.Coach;
import com.springbootdocssourcecodes.springboot.SwimCoach;
@Configuration
public class CoachConfig {
    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
