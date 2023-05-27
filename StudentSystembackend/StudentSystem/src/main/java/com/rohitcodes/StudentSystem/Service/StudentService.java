package com.rohitcodes.StudentSystem.Service;

import com.rohitcodes.StudentSystem.Model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getStudents();
}
