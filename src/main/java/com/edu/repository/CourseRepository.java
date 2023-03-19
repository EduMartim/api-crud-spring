package com.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.model.Course;
public interface CourseRepository extends JpaRepository<Course, Long> {
    
}
