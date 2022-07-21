package com.first.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.first.service.EmpServiceImpl;

@Controller
public class homeController {
	
	@Autowired
	private EmpServiceImpl service;
	
	
	

}
