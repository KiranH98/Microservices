package com.cognizant.user.valueobject;

import com.cognizant.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class ResponseTemplate {
	private User user;
	private Department department;
	public ResponseTemplate(User user, Department department) {
		super();
		this.user = user;
		this.department = department;
	}
	public ResponseTemplate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
}
