package com.SpringClasses.FTM.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 

@Table(name="Register")
public class Register {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long Id;
	@Column(name ="FirstName", nullable=false)
	private String FirstName;
	@Column(name ="LastName", nullable=false)
	private String LastName;
	@Column(name ="EmailId", nullable=false)
	private String EmailId;
	@Column(name ="password", nullable=false)
	private String password;
	@Column(name ="ConfirmPassword", nullable=false)
	private String ConfirmPassword;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return ConfirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		ConfirmPassword = confirmPassword;
	}
	

}
