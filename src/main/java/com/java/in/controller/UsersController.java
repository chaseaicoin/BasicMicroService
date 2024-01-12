package com.java.in.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.in.entity.Users;
import com.java.in.service.UserService;


@RestController
@RequestMapping("/users")
public class UsersController {

	@Autowired
	private UserService userService;
	
	private Logger log = LoggerFactory.getLogger(UsersController.class);
	
	//create
	@PostMapping("/")
	public ResponseEntity<Users> createUser(@RequestBody Users user){
		log.info("inside create user of controoler therse are the details : "+user);
		Users userObj = userService.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(userObj);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Users> getSingleUser(@PathVariable String id){
		log.info("Gettign single function of controoler this is id : "+id);
		Users userObj = userService.getUsers(id);
		return ResponseEntity.ok(userObj);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Users>> getAllusers(){
		List<Users> allUseobj = userService.getAllUsers();
		return ResponseEntity.ok(allUseobj);
	}
	
}
