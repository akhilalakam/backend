package com.educationalframe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.educationalframe.entity.Course;
import com.educationalframe.entity.Department;
import com.educationalframe.entity.Subject;
import com.educationalframe.entity.University;
import com.educationalframe.response.UniversityOfCollegeResponse;
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
	@RequestMapping(value="/getAllUniversities",method = RequestMethod.GET)
	public List<University> getAllUniversities()
	{
		return adminService.getAllUniversities();
	}
	
	@RequestMapping(value="/getUniversityOfColleges/{universityId}",method = RequestMethod.GET)
	public List<UniversityOfCollegeResponse> getUniversityOfColleges(@PathVariable ("universityId") Long universityId)
	{
		return adminService.getUniversityOfColleges(universityId);
	}


}
