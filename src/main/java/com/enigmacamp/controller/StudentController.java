package com.enigmacamp.controller;

import com.enigmacamp.model.Student;
import com.enigmacamp.repository.StudentRepository;
import com.enigmacamp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    
    @GetMapping
    public List<Student> getAllStudent(){
        return studentService.listStudent();
    }
    
    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }
    
    @GetMapping("/{id}")
    public Optional<Student> getStudentById(@PathVariable("id") String id){
        return studentService.getStudentById(id);
    }
    
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable("id") String id, @RequestBody Student student){
        return studentService.updateStudent(student, id);
    }
    
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable("id") String id){
        studentService.deleteStudent(id);
        return "Successfully deleted";
    }
}
