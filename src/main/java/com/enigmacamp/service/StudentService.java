package com.enigmacamp.service;

import com.enigmacamp.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> listStudent();
    Student createStudent(Student student);
    Optional<Student> getStudentById(String id);
    Student updateStudent(Student student, String id);
    String deleteStudent(String id);
}
