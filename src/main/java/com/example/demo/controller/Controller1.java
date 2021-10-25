package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.vo1.EnumFoo;

@RestController
public class Controller1 {

    @GetMapping("/foo1")
    EnumFoo getFoo() {
        return EnumFoo.foo1;
    }
}
