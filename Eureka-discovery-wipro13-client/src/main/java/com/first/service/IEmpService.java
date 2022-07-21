package com.first.service;

import com.first.entity.Employee;


public interface IEmpService {
	
	public Integer saveEmp(Employee emp);
	
	public Employee fetchEmp(Integer id);
	
	


}
