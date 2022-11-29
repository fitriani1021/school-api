package com.enigmacamp.service;

import com.enigmacamp.model.Major;
import com.enigmacamp.repository.MajorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MajorServiceImpl implements MajorService{
    @Autowired
    private MajorRepository majorRepository;
    
    @Override
    public List<Major> listMajor() {
        try {
            return majorRepository.getAllMajor();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    
    @Override
    public Major CreateMajor(Major major) {
        try{
            return majorRepository.createMajor(major);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    
    @Override
    public Optional<Major> getMajorById(String id) {
        try {
            return Optional.of(majorRepository.getMajorById(id));
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
