package com.educationalframe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educationalframe.entity.UserRoleMapping;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRoleMapping, Long> {

}
