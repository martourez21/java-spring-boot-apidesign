package com.restapi.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.controllers.Course;

@Service
public class CourseService {

	
	private List<Course> courses = new ArrayList<>(Arrays.asList(
			new Course(1, "201", "Engineering Math-1", "MAthematical calculus for engineers and science methodologies", "Mr. Nouadjep"),
			new Course(2, "205", "Physics for Engineering 1", "Physics principles for engineers and science methodologies", "Mr.Kalid"),
			new Course(3, "207", "Discreet Mathematics", "Discreet Mathematics for engineers and science methodologies", "Mr.Joseph"),
			new Course(4, "208", "Introduction to Computing", "Introduction to the principles of computing and architecture", "Mr. Tiku"),
			new Course(5, "211", "The Logical Concepts", "The Dual nature of Engineering and Arts", "Mr.Remond"),
			new Course(6, "215", "Coding Theory and Implementation 1", "Coding Theory and Implementation course 1", "Mr.Brian"),
			new Course(7, "217", "Basic Electronics 1", "Theory of electronic designs", "Mr.Ahmed")
			));
	
	
	public Course getCourseById(int id) {
		return courses.stream()
					  .filter(p -> p.getId()==id)
					  .findAny()
					  .get();
	}
	/**
	 * Service method to return all courses from the courses list above
	 * @return
	 */
	public List<Course> getAllCourses(){
		return courses;
	}
	
	/**
	 * Get a course by course code from the list above
	 * @param code
	 * @return
	 */
	public Course getCourseByCode(String code) {
			return courses.stream()
					  .filter(course -> course.getCode().equals(code))
					  .findFirst()
					  .get();
	}
	
	public void addCourse(Course course) {
		// TODO Auto-generated method stub
		courses.add(course);
	}
	
	/**
	 * Delete a course from the list endpoint
	 */
	public void updateCourse( int id, Course course) {
		for(int i=0; i<courses.size(); i++) {
			Course c = courses.get(i);
			if(c.getId()==(id)){
				courses.set(i, course);
				return;
			}
		}
	}
	public void deleteCourse(int id) {
		// TODO Auto-generated method stub
		for(int i=0; i<courses.size(); i++) {
			Course c = courses.get(i);
			if(c.getId()==id) {
				courses.remove(i);
				return;
			}
		}
		
	}
}

