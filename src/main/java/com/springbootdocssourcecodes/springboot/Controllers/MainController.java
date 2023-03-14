package com.springbootdocssourcecodes.springboot.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MainController {
    @GetMapping("")
    public String index() {
        return "Hello World!";
    }
}
