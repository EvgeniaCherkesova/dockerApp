package ru.cherkesova;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpRequest;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String hello(){
        return "Hello";
    }
}
