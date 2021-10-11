package com.cognizant.department.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cognizant.department.entity.Department;
import com.cognizant.department.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	
	/*
	 * Post method to save Department
	 * arg: Department
	 * */
	/*
	 * @PostMapping("/") public Department saveDepartment(@RequestBody Department
	 * department) {
	 * //Log.info("Inside saveDepartment method of DepartmentController"); return
	 * departmentService.saveDepartment(department); }
	 */
	
	@GetMapping("/")
	public List<Department> getDepartment() {
		//Log.info("Inside saveDepartment method of DepartmentController");
		return departmentService.getdepartment();
	}
	
	/*
	 * Method to get Department based on Department id
	 * */
	
	@PostMapping("{id}")
	public Department findDepartmentById(@PathVariable("id") Long departmentId) {
		//Log.info("Inside findDepartmentById method of DepartmentController");
		return departmentService.findDepartmentById(departmentId);
	}
}
