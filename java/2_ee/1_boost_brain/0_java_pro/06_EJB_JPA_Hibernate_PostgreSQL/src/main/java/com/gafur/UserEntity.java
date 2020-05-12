package com.gafur;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserEntity {
	@Id
	private String login;
	
	private String password;
	
	public void setLogin(String login) {
		this.login = login;
	}
	public String getLogin() {
		return login;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
}
