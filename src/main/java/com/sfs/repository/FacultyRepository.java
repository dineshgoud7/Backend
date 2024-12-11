package com.sfs.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.sfs.entity.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
}
