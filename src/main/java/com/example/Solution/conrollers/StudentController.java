package com.example.Solution.conrollers;

import com.example.Solution.model.Student;
import com.example.Solution.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class StudentController {
    private final StudentService studentService;
    List<Student> students;
    @GetMapping("/students")
    public String viewProducts(Model model) {
        students = studentService.findAll();
        model.addAttribute("students", students);
        return "students";
    }
    @PostMapping("/students")
    public String addProduct(Student p, Model model) {
        studentService.addStudent(p);
        students = studentService.findAll();
        model.addAttribute("students", students);
        return "students";
    }
    @GetMapping("/delete/{student}")
    public String deleteValue(@PathVariable("student") Student student) {
        students.remove(student);
        return "students";
    }
    @GetMapping("/list")
    public String showList(Model model) {
        model.addAttribute("students", students);
        return "list";
    }


}
