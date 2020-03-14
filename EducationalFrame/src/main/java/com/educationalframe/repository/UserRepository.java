package com.educationalframe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educationalframe.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
