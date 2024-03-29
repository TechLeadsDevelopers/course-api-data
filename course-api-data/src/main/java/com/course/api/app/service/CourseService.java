package com.course.api.app.service;

import java.util.List;

import com.course.api.app.model.Course;

public interface CourseService {
	
	public Course getCourseDetails(String course) throws Exception;
	public List<Course> getAllCourses() throws Exception;
	public List<Course> addCourse(Course course) throws Exception;
	public Course updateById(Course course,long id) throws Exception;
	public Course getCourseDetails(long id) throws Exception;
	public List<Course> deleteCourseById(long id) throws Exception;
}
