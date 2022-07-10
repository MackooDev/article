package com.example.article.adapters.restApi;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Service
public class ArticleController {

    @GetMapping("/hello")
    public String hello(){
        return "hello maciek";
    }
}
