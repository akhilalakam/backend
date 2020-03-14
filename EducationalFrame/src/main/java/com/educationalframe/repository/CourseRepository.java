package com.educationalframe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educationalframe.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
