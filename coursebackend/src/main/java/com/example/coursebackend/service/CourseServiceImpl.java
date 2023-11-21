package com.example.coursebackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.example.coursebackend.Dao.CourseDao;
import com.example.coursebackend.Entity.Course;


@Configuration
@EnableWebMvc
@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private CourseDao courseDao;
	
	
//	List<Course> list; 
	
	public CourseServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Course(145 , "java core course" , "this course contains basic")); 
//		list.add(new Course(146 , "java spring " , "this is the rest api"));
		
		
	}


	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}


	@Override
	public Course getCourse(long courseId) {
		
//		Course c = null; 
//		for(Course it: list) {
//			if(it.getId() == courseId) {
//				c = it; 
//				break; 
//			}
//		}
		
		return courseDao.getOne(courseId);
	}


	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		
//		list.add(course);
		
		courseDao.save(course);
		return course;
	}


	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		
//		list.forEach(e -> {
//			
//			
//			if(e.getId() == course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription()); 
//			}
//		});
		
		courseDao.save(course);
		
		return course;
	}


	@Override
	public Course deleteCourse(long parseLong) {
		// TODO Auto-generated method stub
		
//		Course c = null; 
		
//		for(Course it: list) {
//			
//			if(it.getId() == courseId) {
//				c = it;
//				list.remove(it);
//				break; 
//			}
//		}
		Course entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
		
		return entity ;
	}
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/courses")
		.allowedOrigins("http://localhost:3000")
		 .allowedMethods("GET" , "POST" ,"PUT" , "DELETE");
	}

}

