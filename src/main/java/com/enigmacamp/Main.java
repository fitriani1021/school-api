package com.enigmacamp;

import com.enigmacamp.model.Major;
import com.enigmacamp.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    
        List<Major> majors = new ArrayList<>();
        List<Student> students = new ArrayList<>();
    
        {
            Major major = new Major();
            major.setMajorName("TI");
            majors.add(major);
            Student student = new Student();
            student.setId("1");
            student.setFirstName("Jodie");
            student.setLastName("Villanelle");
            student.setEmail("jodie@gmail.com");
            student.setMajor(major);
            students.add(student);
        }
    }
}