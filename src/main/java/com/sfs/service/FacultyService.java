package com.sfs.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sfs.entity.Faculty;
import com.sfs.repository.FacultyRepository;

@Service
public class FacultyService {

    @Autowired
    private FacultyRepository facultyRepository;

    public Faculty addFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }
}
