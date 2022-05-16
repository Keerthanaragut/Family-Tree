package com.SpringClasses.FTM.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 

@Table(name="Login")
public class Login {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private long emailId;
	
	@Column(name ="password", nullable=false)
	private String password;
	
	public long getEmailId() {
		return emailId;
	}
	public void setEmailId(long emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
  

}
