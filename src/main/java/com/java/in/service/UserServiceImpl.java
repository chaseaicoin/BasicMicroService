package com.java.in.service;

import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.in.entity.Users;
import com.java.in.exception.ResourceNotFoundException;
import com.java.in.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	private Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

	@Override
	public Users saveUser(Users users) {
		log.info("This is saveUser function of UserServiceImpl class.");
		users.setUserId(UUID.randomUUID().toString());
		return userRepository.save(users);
	}

	@Override
	public List<Users> getAllUsers() {
		log.info("This is GetAllUser function of UserServiceImpl class.");
		return userRepository.findAll();
	}

	@Override
	public Users getUsers(String userId) throws ResourceNotFoundException {
		log.info("This is GetUser function of UserServiceImpl class.");
		Users user = userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User with given id is not found on server !! : " + userId));
		return null;
		}
	}
