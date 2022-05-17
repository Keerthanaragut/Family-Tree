package com.family.tree.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.family.tree.dto.GenericResponse;
import com.family.tree.dto.LoginDTO;
import com.family.tree.dto.RegisterDTO;
import com.family.tree.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/register")
	public GenericResponse<String> registerUser(@RequestBody RegisterDTO registerDto) {
		return userService.registerUser(registerDto);
	}

	@PostMapping("/login")
	public GenericResponse<String> loginUser(@RequestBody LoginDTO loginDto) {
		return userService.loginUser(loginDto);
	}
}
