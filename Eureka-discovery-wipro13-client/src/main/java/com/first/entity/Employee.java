package com.first.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "wiproEmp13")
public class Employee {
	
	@Id
	@GeneratedValue(strategy  = GenerationType.AUTO)
	@Column(name = "emp_id")
	private Integer id;
	
	@Column(name  = "emp_name")
	private String name;
	
	@Column(name  = "emp_email")
	private String email;
	
	@Column(name  = "emp_mob")
	private String mob;
	
	@Column(name = "emp_address")
	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", mob=" + mob + ", address=" + address
				+ "]";
	}

	public Employee(Integer id, String name, String email, String mob, String address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mob = mob;
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

}
