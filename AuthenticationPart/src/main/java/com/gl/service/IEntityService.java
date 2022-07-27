package com.gl.service;

import java.util.List;

import com.gl.appdata.Entityclass;


public interface IEntityService {
	
	public Integer saveEntity(Entityclass ent);
	
	public List<Entityclass > getAlldata();
	
	

	

}
