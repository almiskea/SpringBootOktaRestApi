package com.okta.springboot.simpleapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class Api {

    @GetMapping("name/{name}")
    public Name get(@PathVariable String name){
        return new Name(name);
    }
}
