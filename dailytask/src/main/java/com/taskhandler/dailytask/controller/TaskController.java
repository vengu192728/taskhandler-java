package com.taskhandler.dailytask.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskhandler.dailytask.model.FormRequest;

@RestController
@RequestMapping("/api")
public class TaskController {

    @PostMapping("/v1/formdata")
    public String handlePostRequests(@RequestBody FormRequest formRequest) {
        System.out.println("received data"+formRequest.getMessage());
        return "Data Received successfully";
    }
    
    
}
