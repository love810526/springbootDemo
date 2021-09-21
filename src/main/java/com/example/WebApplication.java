package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

//    @RestController
//    public class SimpleController {
//        @GetMapping
//        public Map<String, String> hello() {
//            Map<String, String> map = new HashMap<String, String>();
//            map.put("say", "hello");
//            return map;
//        }
//    }

}
