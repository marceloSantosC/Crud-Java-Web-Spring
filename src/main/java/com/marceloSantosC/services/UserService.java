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
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> user = userRepository.findById(id);
		return user.get();
	}
	
	public User insert(User user) {
		return userRepository.save(user);
	}
	
	public void delete(Long id) {
		this.userRepository.deleteById(id);
	}
	
	public User update(Long id, User user) {
		User entity = userRepository.getOne(id);
		this.updateData(user, entity);
		return userRepository.save(entity);
	}
	
	public void updateData(User user, User entity) {
		entity.setEmail(user.getEmail());
		entity.setName(user.getName());
		entity.setPhone(user.getPhone());
	}

}
