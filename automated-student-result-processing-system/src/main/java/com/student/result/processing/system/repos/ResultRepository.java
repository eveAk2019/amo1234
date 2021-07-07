package com.student.result.processing.system.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.student.result.processing.system.model.Result;

public interface ResultRepository extends CrudRepository<Result, Long> {
	
	public List<Result> findByName(String Name);

}
