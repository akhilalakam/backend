package com.educationalframe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educationalframe.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department,Long> {

}
