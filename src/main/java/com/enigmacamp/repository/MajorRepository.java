package com.enigmacamp.repository;

import com.enigmacamp.model.Major;

import java.util.List;

public interface MajorRepository {
    List<Major> getAllMajor() throws Exception;
    Major createMajor(Major major) throws Exception;
    Major getMajorById(String id) throws Exception;
}
