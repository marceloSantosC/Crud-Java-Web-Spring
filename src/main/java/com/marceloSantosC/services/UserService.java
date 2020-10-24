package com.marceloSantosC.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marceloSantosC.entities.User;
import com.marceloSantosC.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	private UserService() {}
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> user = userRepository.findById(id);
		return user.get();
	}

}
