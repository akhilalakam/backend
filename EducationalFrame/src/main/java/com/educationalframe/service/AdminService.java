package com.educationalframe.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educationalframe.entity.Course;
import com.educationalframe.entity.Department;
import com.educationalframe.entity.Subject;
import com.educationalframe.repository.CourseRepository;
import com.educationalframe.repository.DepartmentRepository;
import com.educationalframe.repository.SubjectRepository;
import com.educationalframe.entity.University;
import com.educationalframe.entity.UniversityCollegeMapping;
import com.educationalframe.repository.UniversityCollegeMappingRepository;
import com.educationalframe.repository.UniversityRepository;
import com.educationalframe.response.UniversityOfCollegeResponse;

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
	
	
	

    @Autowired
	private UniversityRepository universityRepository;
    
    @Autowired
    private UniversityCollegeMappingRepository universityCollegeMappingRepository;
    
    public List<University> getAllUniversities()
    {
    	return universityRepository.findAll();
    }
    
    
    public List<UniversityOfCollegeResponse> getUniversityOfColleges(Long universityId)
    {
    	List<UniversityCollegeMapping> universityCollegeMappings= universityCollegeMappingRepository.findByUniversityUniversityId(universityId);
    	
    	List<UniversityOfCollegeResponse> universityOfCollegeOfResponses=new ArrayList<>();
    	
    	for (UniversityCollegeMapping universityCollegeMapping : universityCollegeMappings) {
    		
    		UniversityOfCollegeResponse universityOfCollegeOfResponse= new UniversityOfCollegeResponse();
        	universityOfCollegeOfResponse.setCollegeId(universityCollegeMapping.getCollege().getCollegeId());
        	universityOfCollegeOfResponse.setCollegeName(universityCollegeMapping.getCollege().getCollegeName());
        	universityOfCollegeOfResponses.add(universityOfCollegeOfResponse);
        	
		}
    	return universityOfCollegeOfResponses;
    	
    }
    
}
