package com.educationalframe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educationalframe.entity.UniversityCollegeMapping;

public interface UniversityCollegeMappingRepository extends JpaRepository<UniversityCollegeMapping, Long>{

	
	public List<UniversityCollegeMapping> findByUniversityUniversityId(Long universityId);
}
	