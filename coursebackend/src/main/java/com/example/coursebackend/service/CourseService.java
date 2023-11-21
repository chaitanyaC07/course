package com.example.coursebackend.service;

import java.util.List;

import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.example.coursebackend.Entity.Course;


public interface CourseService  {
	
	public List<Course> getCourses();
	
	public Course getCourse(long CourseId);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);
	
	public Course deleteCourse(long courseId);

	void addCorsMappings(CorsRegistry registry);

}
