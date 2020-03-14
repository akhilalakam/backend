package com.educationalframe.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UniversityCollegeMapping {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long universityCollegeMappingId;

	public Long getUniversityCollegeMappingId() {
		return universityCollegeMappingId;
	}

	public void setUniversityCollegeMappingId(Long universityCollegeMappingId) {
		this.universityCollegeMappingId = universityCollegeMappingId;
	}
	
	
	
}
