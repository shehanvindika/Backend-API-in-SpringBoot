package com.example.assignment1.controller;

import com.example.assignment1.model.Student;
import com.example.assignment1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackEndAPI {

    @Autowired
    private StudentService studentService;

    @PostMapping("/create")
    public ResponseEntity<Student> insertStudent(@RequestBody Student student){
         return new ResponseEntity<>(studentService.insertStudent(student),HttpStatus.OK);
    }
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

}
