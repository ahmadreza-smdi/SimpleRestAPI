package com.myfirstwebservice.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloWorldController {

//    private static final String template = "Hello, %s!";
//    private static final String template2 = "Hello, %s!";
//    private final AtomicLong counter = new AtomicLong();
//
//    @GetMapping("/hello-world")
//    @ResponseBody
//    public Greeting sayHello(@RequestParam(name="name", required=false, defaultValue="Stranger") String name) {
//        return new Greeting(counter.incrementAndGet(), String.format(template, name));
//    }


    @PostMapping("/add-student")
    @ResponseBody
    public String add_student(@RequestBody Student student) {
        return student.Register();
    }

}