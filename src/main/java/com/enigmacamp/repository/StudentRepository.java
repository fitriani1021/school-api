package com.enigmacamp.repository;

import com.enigmacamp.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentRepository {
    List<Student> getAllStudent() throws Exception;
    Student createStudent(Student student) throws Exception;
    Optional<Student> getStudentById(String id) throws Exception;
    void updateStudent(Student student, String id) throws Exception;
    String deleteStudent(String id) throws Exception;
}
