package com.student.result.processing.system.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Result {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String course;
	private String year;

	@ManyToOne
	@JoinColumn(name = "result_id")
	private Set<Administration> administration = new HashSet<>();

	@OneToOne
	@JoinColumn(name = "result_id")
	private Set<Student> students = new HashSet<>();

	public Result() {
	}

	public Result(Long id, String name, String course, String year) {
		this.id = id;
		this.name = name;
		this.course = course;
		this.year = year;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public Set<Administration> getAdministration() {
		return administration;
	}

	public void setAdministration(Set<Administration> administration) {
		this.administration = administration;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Result other = (Result) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Result [id=" + id + ", name=" + name + ", course=" + course + ", year=" + year + "]";
	}

}
