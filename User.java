package com.ibm.trainingmarch25.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User {

	String username;
	
	String email;
	
	String Mobileno;
	


	@Id
	
	int id;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileno() {
		return Mobileno;
	}

	public void setMobileno(String mobileno) {
		Mobileno = mobileno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public User(String username, String email, String mobileno, int id) {
		
		this.username = username;
		this.email = email;
		this.Mobileno = mobileno;
		this.id = id;
	}

	public User() {
			}

	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + ", Mobileno=" + Mobileno + ", userid=" + id + "]";
	}
	
	
}
