package com.example.action.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TodoController {

    @Value("${app.version:1.0.0}")
    private String version ;
    @GetMapping("/list")
    public String home() {
        System.out.println(">>> ctrl list ");
        return "git action : app version = "+version ;
    }
}

