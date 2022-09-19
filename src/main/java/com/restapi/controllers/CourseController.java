package com.restapi.controllers;

import java.util.Arrays;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	private CourseService course_service;
	
	
	/**
	 * This API endpoint retrieves all the available courses
	 * stored in the list at the Course class 
	 * @return
	 */
	@RequestMapping("/courses")
	public List<Course> getAllCourses(){
		return course_service.getAllCourses();
	}

	@RequestMapping("/courses/{id}")
	public Course getCourseById(@PathVariable int id) {
		return course_service.getCourseById(id);
	}
	/**
	 * This endpoint retrieves courses by course code
	 */
	
	@RequestMapping("/courses/code/{code}")
	public Course getCourseByCode(@PathVariable String code){
		return course_service.getCourseByCode(code);
	}
	
	/**
	 * This is a POST API endpoint to add courses to the list
	 * @param course
	 */
	@RequestMapping(method = RequestMethod.POST, value="/courses")
	public void addCourse(@RequestBody Course course) {
		course_service.addCourse(course);
	}
	
	/**
	 * This resource endpoint deletes a course based on an id passed to the URI
	 * @param course
	 * @param id
	 */
	@RequestMapping(method = RequestMethod.PUT, value = "/courses/{id}")
	public void updateCourse(@RequestBody Course course, @PathVariable int id ) {
		course_service.updateCourse(id, course);
	}
	
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/courses/{id}")
	public void deleteCourse(@PathVariable int id) {
		course_service.deleteCourse(id);
	}
}
