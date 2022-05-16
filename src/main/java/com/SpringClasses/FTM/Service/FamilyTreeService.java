package com.SpringClasses.FTM.Service;

import java.util.List;



import com.SpringClasses.FTM.Model.Register;

public interface FamilyTreeService {
	public List<Register> getAllRegister();  
	public Register saveUser(Register user);
	public Register getUserById(Long id);
	public Register updateUser(Register user);
	public void deleteUserById(Long id);


}
