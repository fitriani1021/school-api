package com.enigmacamp.repository;

import com.enigmacamp.model.Major;
import com.enigmacamp.model.Student;
import com.enigmacamp.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class StudentRepositoryImpl implements StudentRepository{
    private final List<Student> students = new ArrayList<>();
    
    @Override
    public List<Student> getAllStudent() throws Exception {
        return students;
    }
    
    @Override
    public Student createStudent(Student student) throws Exception {
        students.add(student);
        return student;
    }
    
    @Override
    public Optional<Student> getStudentById(String id) throws Exception {
        for (Student student :students){
            if (student.getId().equals(id)){
                return Optional.of(student);
            }
        }
        return Optional.empty();
    }
    
    @Override
    public void updateStudent(Student student, String id) throws Exception {
        for(Student existingStudent : students){
            if(existingStudent.getId().equals(id)){
                existingStudent.setFirstName(student.getFirstName());
                existingStudent.setLastName(student.getLastName());
                existingStudent.setEmail(student.getEmail());
                existingStudent.getMajor().setMajorName(student.getMajor().getMajorName());
                break;
            }
        }
    }
    
    @Override
    public String deleteStudent(String id) throws Exception {
        for(Student student :students){
            if(student.getId().equals(id)){
                students.remove(student);
                break;
            }
        }
        return "Successfully deleted";
    }
}
