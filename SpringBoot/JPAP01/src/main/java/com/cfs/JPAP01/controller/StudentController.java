package com.cfs.JPAP01.controller;

import com.cfs.JPAP01.entity.Student;
import com.cfs.JPAP01.repo.StudentRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentRepo studentRepo;
    public StudentController(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentRepo.save(student);
    }
    @GetMapping
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }


    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
        Student updateStudent = studentRepo.findById(id).orElseThrow(()-> new RuntimeException("student not found"));
        updateStudent.setName(student.getName());
        updateStudent.setEmail(student.getEmail());
        return studentRepo.save(updateStudent);
    }



    @PatchMapping
    public Student PatchStudent(@RequestParam Long id, @RequestParam String name) {
        Student patchStudent = studentRepo.findById(id).orElseThrow(()-> new RuntimeException("student not found"));

        patchStudent.setName(name);
        return patchStudent;
    }
}
