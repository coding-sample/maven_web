package com.example.maven_web.controller;

import com.example.maven_logic.Logic; // 追加
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private Logic logic; // 修正

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
    
    @GetMapping("/api/hello")
    public String hello() {
        // 既存の処理
        String message = "Hello, World!";
        
        // maven_logicの処理を追加
        String logicResult = logic.processData("sample input"); // 修正
        
        return message + " " + logicResult;
    }
}