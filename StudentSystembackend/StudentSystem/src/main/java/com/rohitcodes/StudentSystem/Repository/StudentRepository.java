package com.rohitcodes.StudentSystem.Repository;

import com.rohitcodes.StudentSystem.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository  extends JpaRepository<Student,Integer> {

}
