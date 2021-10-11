package com.cognizant.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cognizant.user.entity.User;
import com.cognizant.user.repository.UserRepository;
import com.cognizant.user.valueobject.Department;
import com.cognizant.user.valueobject.ResponseTemplate;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public ResponseTemplate getUserWithDepartment(Long userId) {
		ResponseTemplate rt= new ResponseTemplate();
		User user = userRepository.findByUserId(userId);
		//Department department = restTemplate.getForObject("http://localhost:9001/departments/"+user.getDepartmentId(), Department.class);
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepartmentId(), Department.class);
		rt.setUser(user);
		rt.setDepartment(department);
		return rt;
	}
}
