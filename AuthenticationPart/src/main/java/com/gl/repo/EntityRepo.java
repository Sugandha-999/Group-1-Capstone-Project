package com.gl.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.appdata.Entityclass;

public interface EntityRepo extends JpaRepository<Entityclass,Integer> {

}
