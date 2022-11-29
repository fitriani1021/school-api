package com.enigmacamp.service;

import com.enigmacamp.model.Major;

import java.util.List;
import java.util.Optional;

public interface MajorService {
    List<Major> listMajor();
    Major CreateMajor(Major major);
    Optional<Major> getMajorById(String name);
}
