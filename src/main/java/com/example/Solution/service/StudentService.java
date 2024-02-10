package com.example.Solution.service;

import com.example.Solution.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student p) {
        students.add(p);
    }
    public List<Student> findAll() {
        return students;
    }
}
