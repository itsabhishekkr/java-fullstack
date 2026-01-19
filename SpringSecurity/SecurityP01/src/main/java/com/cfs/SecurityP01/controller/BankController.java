package com.cfs.SecurityP01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
    int bal=1000;
    @GetMapping("/bal")
    public int gotBalance(){
        return bal;
    }
    @GetMapping("/add")
    public String updateBalance(@RequestParam String AcctNo, @RequestParam int num){
        return "updated Balance is "+AcctNo+" and "+num;
    }
    @GetMapping("/contect")
    private String contect(){
        return "contect";
    }
}
