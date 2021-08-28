package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Course;
import com.example.repository.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	
	//Create operation
		public Course create(String courseId, String courseName, String provider, String university, String parentSubject, String childSubject, String url, double length, String nextSession, String videoUrl) {
			return courseRepository.save(new Course(courseId, courseName, provider, university, parentSubject, childSubject, url, length, nextSession, videoUrl));
		}
		
		//Retrieve operation
		public List<Course> getAll(){
			return courseRepository.findAll();
		}
		
		public Course getByProvider(String provider) {
			return courseRepository.findByProvider(provider);
		}
		
		public Course getByCourseId(String courseId) {
			return courseRepository.findByCourseId(courseId);
		}
		//Update operation
		public Course update(String courseId, double length) {
			Course c = courseRepository.findByProvider(courseId);
			c.setLength(length);
			return courseRepository.save(c);
		}
		
		//Delete operation
		public void deleteAll() {
			courseRepository.deleteAll();
		}
		
		public void delete(String courseId) {
			Course c = courseRepository.findByProvider(courseId);
			courseRepository.delete(c);
		}
		
		
}
