package com.enigmacamp.repository;

import com.enigmacamp.model.Major;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class MajorRepositoryImpl implements MajorRepository{
    private final List<Major> majors = new ArrayList<>();
    
    @Override
    public List<Major> getAllMajor() throws Exception {
        return majors;
    }
    
    @Override
    public Major createMajor(Major major) throws Exception {
        majors.add(major);
        return major;
    }
    
    @Override
    public Major getMajorById(String id) throws Exception {
        for (Major major : majors) {
            if (major.getMajorId().equals(id)) {
                return major;
            }
        }
        return null;
    }
}
