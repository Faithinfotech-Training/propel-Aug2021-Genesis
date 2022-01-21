package com.faith.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.entity.Login;

import com.faith.app.service.ILoginService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class LoginController {

	@Autowired
	private ILoginService loginService;

	@GetMapping("/logins")
	public List<Login> getAllLogins() {
		// TODO Auto-generated method stub
		return loginService.getAllLogins();
	}

	@GetMapping("/logins/{logId}")
	public Optional<Login> getLoginById(@PathVariable Integer logId) {
		// TODO Auto-generated method stub
		return loginService.getLoginById(logId);
	}

	@PostMapping("/logins")
	public void addLogin(@RequestBody Login login) {
		loginService.addLogin(login);

	}

	@PutMapping("/logins")
	public void updateLogin(@RequestBody Login login) {
		loginService.updateLogin(login);
	}

	@DeleteMapping("/logins/{logId}")
	public void deleteLogin(@PathVariable Integer logId) {
		loginService.deleteLogin(logId);

	}

	// Custom find User by Username and Password
	@GetMapping("/logins/namepassword/{userName}&{password}")
	public ResponseEntity<Login> getUserByUserNameAndPassword(@PathVariable("userName") String userName,
			@PathVariable("password") String password) {

		System.out.println("User name Password ...." + userName + password);

		// Declare Responsibility
		ResponseEntity<Login> response = null;
		Login user = loginService.findByUserNameAndPassword(userName, password);

		if (user == null) {
			response = new ResponseEntity<Login>(user, HttpStatus.NOT_FOUND);
		} else {
			response = new ResponseEntity<Login>(user, HttpStatus.OK);
		}
		return response;
	}

}
