package com.family.tree.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.family.tree.dto.CommonUtils;
import com.family.tree.dto.GenericResponse;
import com.family.tree.dto.LoginDTO;
import com.family.tree.dto.RegisterDTO;
import com.family.tree.model.Register;
import com.family.tree.repository.RegisterRepository;
import com.family.tree.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private RegisterRepository registerRepository;

	Map<String, String> errors = null;

	public static final String GENERIC_MESSAGE = "GENERIC_MESSAGE";

	@Override
	public GenericResponse<String> registerUser(RegisterDTO registerDto) {
		errors = new HashMap<>();
		Optional<Register> registerOpt = registerRepository.findByEmailId(registerDto.getEmailId());
		if (registerOpt.isPresent())
			errors.put(GENERIC_MESSAGE, "UserName already exists.");
		if (!CollectionUtils.isEmpty(errors))
			return CommonUtils.getHttpResponse(errors, null, HttpStatus.BAD_REQUEST);
		Register register = new Register();
		register.setFirstName(registerDto.getFirstName());
		register.setLastName(registerDto.getLastName());
		register.setEmailId(registerDto.getEmailId());
		register.setPassword(registerDto.getPassword());
		registerRepository.save(register);
		return CommonUtils.getHttpResponse(errors, "User Registered Successfully.", HttpStatus.OK);
	}

	@Override
	public GenericResponse<String> loginUser(LoginDTO loginDto) {
		errors = new HashMap<>();
		Optional<Register> registerOpt =
			registerRepository.findByUserNameAndPassword(loginDto.getEmailId(), loginDto.getPassword());
		if (!registerOpt.isPresent())
			errors.put(GENERIC_MESSAGE, "Login Credentials are in correct.");
		if (!CollectionUtils.isEmpty(errors))
			return CommonUtils.getHttpResponse(errors, null, HttpStatus.BAD_REQUEST);
		return CommonUtils.getHttpResponse(errors, "Login Successful.", HttpStatus.OK);
	}
}
