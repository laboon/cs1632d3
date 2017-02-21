package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

@Controller
@SpringBootApplication
public class DemoApplication {

    // @RequestMapping("/")
    // @ResponseBody
    // String home() {
    //   return "Hello World!";
    // }

    @RequestMapping("/bill")
    @ResponseBody
    String billHome() {
      return "Hello Bill!";
    }

    @GetMapping("/")
    public String home(Map<String, Object> model) {
	model.put("message", "Hello World");
	model.put("title", "Hello Home");
	model.put("date", new Date());
	return "home";
    }
    
    
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
