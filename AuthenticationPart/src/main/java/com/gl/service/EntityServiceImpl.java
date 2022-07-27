package com.gl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.appdata.Entityclass;
import com.gl.repo.EntityRepo;


@Service
public class EntityServiceImpl implements IEntityService{

	
	@Autowired
	private EntityRepo repo;
	
	@Override
	public Integer saveEntity(Entityclass ent) {
		// saving entity using hibernate service
		repo.save(ent);
		return ent.getId();
	}

	@Override
	public List<Entityclass> getAlldata() {
		List<Entityclass> entityList = repo.findAll();
		System.out.println(entityList);
		return entityList;
	}
	
}


