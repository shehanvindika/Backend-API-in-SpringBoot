package com.example.assignment1.service;

import com.example.assignment1.model.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    Student insertStudent(Student student);
}
