//package com.example.daybyimagesspring.domain;
//
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//
//@Entity
//public class Section {
//
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	private String lesson_id;
//	private String name;
//	private String startTime;
//	private String endTime;
//	private String imagePth;
//	private String comment;
//	
//	
//	@ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "section")
//    private Lesson lesson;
//	
//	public Lesson getLesson() {
//		return lesson;
//	}
//
//	public void setLesson(Lesson lesson) {
//		this.lesson = lesson;
//	}
//
//
//
//	public Section() {
//		
//	}
//
//
//
//	public Section(String name, String startTime, String endTime, String imagePth, String comment) {
//		super();
//		this.name = name;
//		this.startTime = startTime;
//		this.endTime = endTime;
//		this.imagePth = imagePth;
//		this.comment = comment;
//	}
//
//
//
//	public String getLesson_id() {
//		return lesson_id;
//	}
//
//
//
//	public void setLesson_id(String lesson_id) {
//		this.lesson_id = lesson_id;
//	}
//
//
//
//	public String getName() {
//		return name;
//	}
//
//
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//
//
//	public String getStartTime() {
//		return startTime;
//	}
//
//
//
//	public void setStartTime(String startTime) {
//		this.startTime = startTime;
//	}
//
//
//
//	public String getEndTime() {
//		return endTime;
//	}
//
//
//
//	public void setEndTime(String endTime) {
//		this.endTime = endTime;
//	}
//
//
//
//	public String getImagePth() {
//		return imagePth;
//	}
//
//
//
//	public void setImagePth(String imagePth) {
//		this.imagePth = imagePth;
//	}
//
//
//
//	public String getComment() {
//		return comment;
//	}
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
//	
//}
