package com.example.daybyimagesspring.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Teacher {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long teacher_id;
	private String name;
	private String lastName;
	private String phone;
	private String password;



	@ManyToMany(mappedBy = "teachers")
	private Set<Student> students;
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}


	public Teacher() {

	}


	public Teacher(long id, String name, String lastName, String phone, String password) {
		super();
		this.teacher_id = id;
		this.name = name;
		this.lastName = lastName;
		this.phone = phone;
		this.password = password;
	}


	public long getId() {
		return teacher_id;
	}


	public void setId(long id) {
		this.teacher_id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}







}
