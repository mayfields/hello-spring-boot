package com.mdsword.hello.spring.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String sayHi() {
        return "Hello Spring Boot";
    }

}