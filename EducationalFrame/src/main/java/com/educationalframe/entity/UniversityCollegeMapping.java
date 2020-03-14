package com.educationalframe.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class UniversityCollegeMapping {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long universityCollegeMappingId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="college_id")
	private University university;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="university_id")
	private College college;

	

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public Long getUniversityCollegeMappingId() {
		return universityCollegeMappingId;
	}

	public void setUniversityCollegeMappingId(Long universityCollegeMappingId) {
		this.universityCollegeMappingId = universityCollegeMappingId;
	}
	
}
