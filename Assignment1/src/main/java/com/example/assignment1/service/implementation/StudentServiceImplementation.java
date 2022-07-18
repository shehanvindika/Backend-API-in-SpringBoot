package com.example.assignment1.service.implementation;
import com.example.assignment1.model.Student;
import com.example.assignment1.repository.StudentRepository;
import com.example.assignment1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImplementation implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public  Student insertStudent(Student student) {
        return studentRepository.save(student);
    }
}
