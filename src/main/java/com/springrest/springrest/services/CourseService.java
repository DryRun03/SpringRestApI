package com.springrest.springrest.services;
import com.springrest.springrest.entities.*;
import java.util.List;

public interface CourseService {
	public List<Course> getCourses();
	public Course getCourse(long courseId);
	public Course addCourse(Course course);
	public Course updateCourse(Course course,long courseId);
	public Course deleteCourse(Course course,long courseId);
}
