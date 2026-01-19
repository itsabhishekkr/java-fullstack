package com.cfs.SecurityP02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

    @GetMapping("/contect")
    public String contect(){
        return "contect";
    }

    @GetMapping("/transfer")
    public String transfer(){
        return "your money transfer";
    }
    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }


    @GetMapping("/bal")
    public String bal(){
        return "your money balance";
    }
    @GetMapping("/acc")
    public String acc(){
        return "account number";
    }

    @PostMapping("/city")
    public String citys(@RequestParam String citys){
        return "this is my citys "+citys;
    }

    @PostMapping("/town")
    public String getTowns(@RequestParam String towns){
        return "this is my citys "+ towns;
    }
}
