package com.student.result.processing.system.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.student.result.processing.system.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {
	
	public List<Student> findByName(String name);
}
