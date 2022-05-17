package com.family.tree.service;

import com.family.tree.dto.GenericResponse;
import com.family.tree.dto.LoginDTO;
import com.family.tree.dto.RegisterDTO;

public interface UserService {

	public GenericResponse<String> registerUser(RegisterDTO registerDto);

	public GenericResponse<String> loginUser(LoginDTO loginDto);
}
