package com.z.msbd.question.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/questionquery")
public class QuestionController {
    String s = "2";
    public String questionQuery(){
        System.out.println(s);
        return s;
    }
}
