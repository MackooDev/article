package com.example.article.adapters;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Service
public class B {
    @GetMapping("/hello")
    public String hello(){
        return "hello maciek";
    }
}
