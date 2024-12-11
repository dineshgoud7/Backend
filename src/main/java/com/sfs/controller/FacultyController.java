package com.sfs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FacultyController {

    @GetMapping("/faculty")
    public String facultyPage() {
        // Returns the faculty.jsp view
        return "faculty";
    }
}
