package com.example.deploy1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @Autowired
    Environment environment;

    @GetMapping("/name")
    public String myName(){
        return environment.getProperty("devName");
    }

    /*
    @Value("${devName}")
    String nome;

    @GetMapping("/opt2")
    public String myName2(){
        return nome;
    }
     */
}
