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
	

}
