package com.marceloSantosC.services;

import java.util.List;
import java.util.Optional;

import javax.validation.ConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.marceloSantosC.entities.User;
import com.marceloSantosC.repositories.UserRepository;
import com.marceloSantosC.services.exception.DatabaseException;
import com.marceloSantosC.services.exception.ResourceNotFoundException;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> user = userRepository.findById(id);
		return user.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User user) {
		return userRepository.save(user);
	}
	
	public void delete(Long id) {
		try {
			this.userRepository.deleteById(id);
		} catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch(ConstraintViolationException e) {
			throw new DatabaseException(id);
		}

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
