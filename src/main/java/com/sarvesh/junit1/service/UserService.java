package com.sarvesh.junit1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sarvesh.junit1.model.User;
import com.sarvesh.junit1.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User addUser(User user) {
		return userRepository.save(user);
	}

	public List<User> getUsers() {
		return userRepository.findAll();
	}

	public User findById(long id) {
		return userRepository.findByUserId(id);
	}

	public User updateUser(User user) {
		System.out.println(user.toString());
		return userRepository.save(user);
	}

	public void removeUser(long id) {
		userRepository.deleteById(id);
	}

}
