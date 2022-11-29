package com.enigmacamp.service;

import com.enigmacamp.model.Major;
import com.enigmacamp.model.Student;
import com.enigmacamp.repository.MajorRepository;
import com.enigmacamp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private MajorRepository majorRepository;

    @Override
    public List<Student> listStudent() {
        try{
            return studentRepository.getAllStudent();
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    
    @Override
    public Student createStudent(Student student) {
        try {
            Major major = majorRepository.getMajorById(student.getMajor().getMajorId());
            student.setMajor(major);
            return studentRepository.createStudent(student);
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    
    @Override
    public Optional<Student> getStudentById(String id) {
        try {
            return studentRepository.getStudentById(id);
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    
    @Override
    public Student updateStudent(Student student, String id) {
        try{
            Major major = majorRepository.getMajorById(student.getMajor().getMajorId());
            student.setMajor(major);
            studentRepository.updateStudent(student,id);
        }catch(Exception e){
            throw new RuntimeException(e);
        }
        return student;
    }
    
    @Override
    public String deleteStudent(String id) {
        try {
            studentRepository.deleteStudent(id);
        }catch(Exception e){
            throw new RuntimeException(e);
        }
        return "Successfully deleted";
    }
}
