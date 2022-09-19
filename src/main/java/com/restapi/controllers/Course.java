package com.restapi.controllers;

/**
 * @author martourez
 *
 */
public class Course {
	
	private int id;
	private String code;
	private String course_name;
	private String course_description;
	private String course_tutor;
	
	public Course() {
		
	}
	
	public Course(int id, String code, String course_name, String course_description, String course_tutor) {
		this.id = id;
		this.code = code;
		this.course_name = course_name;
		this.course_description = course_description;
		this.course_tutor = course_tutor;
	}
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", code=" + code + ", course_name=" + course_name + ", course_description="
				+ course_description + ", course_tutor=" + course_tutor + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getCourse_description() {
		return course_description;
	}
	public void setCourse_description(String course_description) {
		this.course_description = course_description;
	}
	public String getCourse_tutor() {
		return course_tutor;
	}
	public void setCourse_tutor(String course_tutor) {
		this.course_tutor = course_tutor;
	}

}
