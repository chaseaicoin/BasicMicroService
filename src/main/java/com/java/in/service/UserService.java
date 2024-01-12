package com.java.in.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.java.in.entity.Users;
import com.java.in.exception.ResourceNotFoundException;

@Service
public interface UserService {
	
	//createUser, getAllUser, getUser, deleteUser, updateUser
	
	Users saveUser(Users users);
	
	List<Users> getAllUsers();
	
	Users getUsers(String userId) throws ResourceNotFoundException;

}
