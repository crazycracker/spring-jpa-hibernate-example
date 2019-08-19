package com.vinay.jpa.springjpahibernateexample.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinay.jpa.springjpahibernateexample.model.Users;
import com.vinay.jpa.springjpahibernateexample.repository.UserRepository;

@RestController
@RequestMapping("/rest/users")
public class UserResource {
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping(value = "/all")
	public List<Users> getAll(){
		return userRepository.findAll();
	}
	
	@GetMapping(value = "/{name}")
	public List<Users> getUser(@PathVariable("name") final String name){
		return userRepository.findBySname(name);
	}
	
	@GetMapping(value = "/id/{id}")
	public Optional<Users> getId(@PathVariable("id") final Integer id) {
		return userRepository.findById(id);
	}
}
