package com.cfs.BootP02.controller;

import com.cfs.BootP02.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/welcome")
    public String dataFetchFromDb(){
        return studentService.getStudentData();
    }
    @PostMapping("/welcome/{id}")
    public String postStudentData(@PathVariable int id) {
        return "Hello product Number = " + id;
    }
}
