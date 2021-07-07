package com.student.result.processing.system.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.student.result.processing.system.model.Administration;

public interface AdministrationRepository extends CrudRepository<Administration, Long> {
	
	public List<Administration> findByName(String Name);
}

