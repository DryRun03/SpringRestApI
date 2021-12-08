package com.springrest.springrest.controller;

import com.springrest.springrest.services.CourseService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.springrest.springrest.entities.Course;

@RestController
public class MyController {
	@Autowired   
	private CourseService courseService;
	
	
	@GetMapping("/home")
	public String home() {
		return "This is home Page";
	}
	//Get the courses
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.courseService.getCourses();	
	}
	//Get the courses using Id.
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	//Adding a course.
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return this.courseService.addCourse(course);
	}
	//updating a course.
	@PutMapping("/courses/{courseId}")
	public Course updateCourse(@RequestBody Course course,@PathVariable String courseId) {
		return this.courseService.updateCourse(course, Long.parseLong(courseId));
	}
	//deleting a course.
	@DeleteMapping("courses/{courseId}")
	public Course deleteCourse(@RequestBody Course course,@PathVariable String courseId) {
		return this.courseService.deleteCourse(course, Long.parseLong(courseId));
	}
} 