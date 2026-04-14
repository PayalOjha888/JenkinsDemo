package com.demo.JenkinsTutorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping("/")
    public String greet(){
        return "Hello, this is demo project for jenkins and github actions learning.";
    }

}
