package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.vo2.EnumFoo;

@RestController
public class Controller2 {
    @GetMapping("/foo2")
    EnumFoo getFoo() {
        return EnumFoo.foo2;
    }
}
