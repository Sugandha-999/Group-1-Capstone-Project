package com.gl.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.appdata.Entityclass;
import com.gl.service.EntityServiceImpl;



@Controller
//@RequestMapping("/Employee")
public class homeController {
	

	@Autowired
	private EntityServiceImpl service;
	
	
	@RequestMapping("/home")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	
	@RequestMapping("/save")
	public String saveEntity(@ModelAttribute Entityclass ent ,Model model) {
		System.out.println("save called ::"+ent);
		
		Integer id = service.saveEntity(ent);
		System.out.println("emp saved with id"+id);
		
		model.addAttribute("id","emp save with id"+id);
		return "index";
		
	}
	
	@RequestMapping("/Dashboard")
	public String dashboard(@ModelAttribute Entityclass ent ,Model model) {
		System.out.println("save called ::"+ent);
		
		List<Entityclass> entityList = service.getAlldata();
		System.out.println("All emp:: "+entityList);
		
		
		for (Entityclass en : entityList) //Iterates as long as there are elements in the list. An object s is created of type Employee class.
        {
            System.out.print("ID, username, email: ");
            System.out.println(en.getId()+" "+en.getUsername()+" " +en.getEmail());
        }
		return "login";
		
	}
	
	
	
	
	
	

}
