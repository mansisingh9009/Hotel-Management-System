package com.DepartmentMicroservice.Controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DepartmentMicroservice.Model.Department;
import com.DepartmentMicroservice.Model.DepartmentList;
import com.DepartmentMicroservice.Repository.DepartmentRepo;
import com.DepartmentMicroservice.Services.Departmentservice;


@RestController
@RequestMapping("/department")
public class DepartmentController {
@Autowired
 private DepartmentRepo repository;
	@Autowired
	private Departmentservice service;

	@GetMapping("/hello")
	public String test() {
		return "Hello this is Department microservice";
	}
	
	
	@PostMapping("/add")
	public String addDept(@RequestBody Department dept) {
		repository.save(dept);
		
		//return this.service.addDepartment(dept);
		return "department added" +dept.getDepartmentID();
	}
	
	
	@GetMapping("/findAllDepartment")
	public List<Department> getDepartment()
	{
	return repository.findAll();
	}

	@GetMapping("/findDepartmentById/{departmentID}")
	public Optional<Department> getByID(@PathVariable long departmentID)
	{
	return repository.findById(departmentID);
	}

	
	
	@PutMapping("/updateDepartment")
	public String UpdateDepartment(@RequestBody Department dept)
	{
	repository.save(dept);
	return "Department updated "+ dept.getDepartmentID();
	}
	
	
	 @DeleteMapping("/delete/{departmentID}") 
	 public String deleteByID(@PathVariable long departmentID)
	 { 
		 repository.deleteById(departmentID);
		 return "Department deleted at" +departmentID;
	 }
	
	

}
