/*
 * HelloController.java
 * Copyright (C) 2018 white <white@Whites-Mac-Air.local>
 *
 * Distributed under terms of the MIT license.
 */

package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.concurrent.atomic.AtomicLong;

import com.example.demo.entity.Greeting;

@RestController
@RequestMapping("/hello")
public class HelloController {
    private static final String template = "hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/")
    public String index(){
        return "Hello";
    }
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="world")String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}

