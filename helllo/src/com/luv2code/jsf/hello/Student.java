package com.luv2code.jsf.hello;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student {
	
	private String firstName;
	private String lastName;
	
	// create no-arg constructor
	public Student() {
		
	}
	
	// define getter/setter methods
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;	
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
