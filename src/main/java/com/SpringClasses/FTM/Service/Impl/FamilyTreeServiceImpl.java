package com.SpringClasses.FTM.Service.Impl;

import java.util.List;


import com.SpringClasses.FTM.Repository.RegisterRepository;
import com.SpringClasses.FTM.Model.Register;
import com.SpringClasses.FTM.Service.FamilyTreeService;

public class FamilyTreeServiceImpl implements FamilyTreeService{

	private RegisterRepository RegisterRepository;
	public FamilyTreeServiceImpl(RegisterRepository RegisterRepository) {
		this.RegisterRepository = RegisterRepository;
	}
	@Override
	public List<Register> getAllRegister() {
		// TODO Auto-generated method stub
		return RegisterRepository.findAll();
	}

	@Override
	public Register saveUser(Register user) {
		// TODO Auto-generated method stub
		return RegisterRepository.save(user);
	}

	@Override
	public Register getUserById(Long id) {
		// TODO Auto-generated method stub
		return RegisterRepository.findById(id).get();
	}

	@Override
	public Register updateUser(Register user) {
		// TODO Auto-generated method stub
		return RegisterRepository.save(user);
	}

	@Override
	public void deleteUserById(Long id) {
		// TODO Auto-generated method stub
		RegisterRepository.deleteById(id);
	}

}
