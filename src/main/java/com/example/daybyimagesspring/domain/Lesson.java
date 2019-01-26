//package com.example.daybyimagesspring.domain;
//
//import java.util.List;
//import java.util.Set;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.persistence.OneToMany;
//
//@Entity
//public class Lesson {
//
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	private long lesson_id;
//	private String date;
//	private String name;
//	private String image_path;
//	private String comment;
//
//
//	@OneToMany(cascade = CascadeType.ALL, mappedBy="section")
//	private List<Section> sections;
//
//	public List<Section> getSections() {
//		return sections;
//	}
//
//	public void setSections(List<Section> sections) {
//		this.sections = sections;
//	}
//
//
//
//
//
//
//	@ManyToMany(fetch = FetchType.LAZY,cascade = {CascadeType.MERGE})
//	@JoinTable(name = "student_lesson", joinColumns = @JoinColumn(name = "lesson_id", referencedColumnName = "lesson_id"),
//	inverseJoinColumns = @JoinColumn(name = "student_id", referencedColumnName = "student_id"))
//	private Set<Student> students;
//
//	public Set<Student> getStudents() {
//		return students;
//	}
//
//	public void setStudents(Set<Student> students) {
//		this.students = students;
//	}
//
//
//
//
//
//
//	public Lesson() {
//
//	}
//
//
//
//
//
//
//	public Lesson(String date, String name, String image_path, String comment) {
//		super();
//		this.date = date;
//		this.name = name;
//		this.image_path = image_path;
//		this.comment = comment;
//	}
//
//
//
//
//
//
//	public long getLesson_id() {
//		return lesson_id;
//	}
//
//
//
//
//
//
//	public void setLesson_id(long lesson_id) {
//		this.lesson_id = lesson_id;
//	}
//
//
//
//
//
//
//	public String getDate() {
//		return date;
//	}
//
//
//
//
//
//
//	public void setDate(String date) {
//		this.date = date;
//	}
//
//
//
//
//
//
//	public String getName() {
//		return name;
//	}
//
//
//
//
//
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//
//
//
//
//
//	public String getImage_path() {
//		return image_path;
//	}
//
//
//
//
//
//
//	public void setImage_path(String image_path) {
//		this.image_path = image_path;
//	}
//
//
//
//
//
//
//	public String getComment() {
//		return comment;
//	}
//
//
//
//
//
//
//	public void setComment(String comment) {
//		this.comment = comment;
//	}
//
//
//
//
//
//
//
//
//}
