package com.educationalframe.entity;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class UniversityCollegeMapping {

	private Long universityCollegeMappingId;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="college_id")
	private University univesity;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="university_id")
	private College college;
	
}
