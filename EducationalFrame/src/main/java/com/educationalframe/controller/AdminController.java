package com.educationalframe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educationalframe.entity.Course;
import com.educationalframe.entity.Department;
import com.educationalframe.entity.Subject;
import com.educationalframe.service.AdminService;

@RestController
@RequestMapping("/e1/admin")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@GetMapping("/getCourses")
	public ResponseEntity<List<Course>> getAllCourses(){
		return new ResponseEntity<>(adminService.findAllCourses(), HttpStatus.OK);
	}
	
	@GetMapping("/getDepartments")
	public ResponseEntity<List<Department>> getAllDepartments(){
		return new ResponseEntity<List<Department>>(adminService.findAllDepartments(), HttpStatus.OK);
	}
	
	@GetMapping("/getSubjects")
	public ResponseEntity<List<Subject>> getAllSubjects(){
		return new ResponseEntity<List<Subject>>(adminService.findAllSubjects(), HttpStatus.OK);
	}

}
