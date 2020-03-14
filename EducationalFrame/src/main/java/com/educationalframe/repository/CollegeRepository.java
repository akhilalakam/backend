package com.educationalframe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educationalframe.entity.College;

public interface CollegeRepository extends JpaRepository<College,Long>{

}
