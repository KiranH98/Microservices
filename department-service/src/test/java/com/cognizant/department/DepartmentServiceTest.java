package com.cognizant.department;

import static org.mockito.Mockito.mockitoSession;

import java.util.Optional;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.junit.Assert;

import com.cognizant.department.entity.Department;
import com.cognizant.department.repository.DepartmentRepository;
import com.cognizant.department.service.DepartmentService;

public class DepartmentServiceTest {
	@InjectMocks
	private DepartmentService departmentService;
	
	@Mock
	private DepartmentRepository departmentRepository;
	
	@SuppressWarnings("deprecation")
	@BeforeAll
	public void setUP() throws Exception{
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void getDepartmentTest() {
		 Department department = new Department("aviation","trivandrum","AV-001");
		 Mockito.when(departmentRepository.findByDepartmentId((long) 1)).thenReturn(department);
		 
		 Department result= departmentService.findDepartmentById((long) 1);
		 
		 Assert.assertEquals(department.getDepartmentName(), result.getDepartmentName());
	}
}
