package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;
@Service
public class CourseServiceImpl implements CourseService {
	List<Course> list;
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(1,"Java Core Course", "This course contains basics of java."));
		list.add(new Course(2, "Spring Boot Course","Creating rest API usung Spring boot."));
		list.add(new Course(3,"Hibernate Course", "This course contains the basics of Hibernate."));
		list.add(new Course(4,"SQl Course","This course is about the use of Basic SQL commands and implementing them "));
	}
	@Override
	public List<Course> getCourses() {
		return list;
	}
	@Override
	public Course getCourse(long courseId) {
	Course c = null;
	for(Course course:list) {
		if(course.getId()==courseId) {
			c= course;
			break;
		}
	}
	return c;
	}
	@Override
	public Course addCourse(Course course) {
	list.add(course);
	return course;
	}
	
	@Override
	public Course updateCourse(Course course, long courseId) {
		Course c = null;
		for(Course course1:list) {
			if(course1.getId()==courseId) {
				c= course1;
				list.remove(c);
				list.add(course);
			}
		}	
		
		return null;
	}
	@Override
	public Course deleteCourse(Course course, long courseId) {
		Course c = null;
		for(Course course1:list) {
			if(course1.getId()==courseId) {
				c= course1;
				list.remove(c);
			}
		}	
		
		return null;
	}
}