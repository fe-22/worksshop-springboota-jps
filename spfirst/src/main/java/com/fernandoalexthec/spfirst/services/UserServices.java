package com.fernandoalexthec.spfirst.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fernandoalexthec.spfirst.entities.User;
import com.fernandoalexthec.spfirst.repositories.UserRepository;

@Component
public class UserServices {
	
	@Autowired
	private UserRepository repository;
	
	public List<User>findAll(){
		return repository.findAll();
	}
	
	public User findBy(Long id) {
		Optional<User>obj = repository.findById(id);
		return obj.get();
	}

}
