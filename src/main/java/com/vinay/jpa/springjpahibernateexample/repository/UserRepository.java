package com.vinay.jpa.springjpahibernateexample.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinay.jpa.springjpahibernateexample.model.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{
	List<Users> findBySname(String name);
	
	Optional<Users> findById(Integer id);
}
