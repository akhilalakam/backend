package com.educationalframe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educationalframe.entity.Course;
import com.educationalframe.entity.Department;
import com.educationalframe.entity.Subject;
import com.educationalframe.repository.CourseRepository;
import com.educationalframe.repository.DepartmentRepository;
import com.educationalframe.repository.SubjectRepository;

@Service
public class AdminService {
	
	@Autowired
	private CourseRepository courseRepository;
	@Autowired
	private DepartmentRepository departmentRepository;
	@Autowired
	private SubjectRepository subjectRepository;
	
	public List<Course> findAllCourses(){
		return courseRepository.findAll();
	}
	
	public List<Department> findAllDepartments(){
		return departmentRepository.findAll();
	}
	
	public List<Subject> findAllSubjects(){
		return subjectRepository.findAll();
	}
	
	
	

}
