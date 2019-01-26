package com.example.daybyimagesspring.domain;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long student_id;
	private String name;
	private String lastName;
	private String phone;
	private String password;
	
	@ManyToMany(fetch = FetchType.LAZY,cascade = {CascadeType.MERGE})
	    @JoinTable(name = "student_teacher", joinColumns = @JoinColumn(name = "teacher_id", referencedColumnName = "teacher_id"),
	    inverseJoinColumns = @JoinColumn(name = "student_id", referencedColumnName = "student_id"))
	    private Set<Teacher> teachers; 
	public Set<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}


	public Student() {
		
	}
	
	


	public Student( String name, String lastName, String phone, String password) {
		super();
		
		this.name = name;
		this.lastName = lastName;
		this.phone = phone;
		this.password = password;
	}

	
	

	public Student(String name, String lastName, String phone, String password, Set<Teacher> teachers) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.phone = phone;
		this.password = password;
		this.teachers = teachers;
	}


	public long getId() {
		return student_id;
	}


	public void setId(long id) {
		this.student_id = id;
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


	public long getStudent_id() {
		return student_id;
	}


	public void setStudent_id(long student_id) {
		this.student_id = student_id;
	}
	
	
	
	
	
	
	
	
	
	
}
