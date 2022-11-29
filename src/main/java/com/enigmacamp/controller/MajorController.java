package com.enigmacamp.controller;

import com.enigmacamp.model.Major;
import com.enigmacamp.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/majors")
public class MajorController {
    @Autowired
    private MajorService majorService;
    
    @GetMapping
    public List<Major> getAllMajor() {
        return majorService.listMajor();
    }
    
    @PostMapping
    public Major createMajor(@RequestBody Major major) {
        return majorService.CreateMajor(major);
    }
    
    @GetMapping("/{id}")
    public Optional<Major> getById(@PathVariable("id") String id) {
        return majorService.getMajorById(id);
    }
}