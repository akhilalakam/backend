package com.educationalframe.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class University {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long universityId;
	private String universityName;
	private String universityLocation;
	
	public Long getUniversityId() {
		return universityId;
	}
	public void setUniversityId(Long universityId) {
		this.universityId = universityId;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public String getUniversityLocation() {
		return universityLocation;
	}
	public void setUniversityLocation(String universityLocation) {
		this.universityLocation = universityLocation;
	}
}
