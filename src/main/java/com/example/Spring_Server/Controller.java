package com.example.Spring_Server;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Arun Gupta
 */
@RestController
public class Controller {

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }
}
