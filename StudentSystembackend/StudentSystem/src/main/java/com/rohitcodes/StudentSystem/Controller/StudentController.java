package com.rohitcodes.StudentSystem.Controller;

import com.rohitcodes.StudentSystem.Model.Student;
import com.rohitcodes.StudentSystem.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student) {
        studentService.saveStudent(student);
        return "Added";
    }

    @GetMapping("/getAll")
    public List<Student> getAll() {
        return studentService.getStudents();
    }
}
