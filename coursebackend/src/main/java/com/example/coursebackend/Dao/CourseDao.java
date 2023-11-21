package com.example.coursebackend.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.coursebackend.Entity.Course;

public interface CourseDao extends JpaRepository<Course , Long> {
	

}
