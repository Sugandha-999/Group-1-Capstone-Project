package com.first.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.first.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee,Integer> {

}
