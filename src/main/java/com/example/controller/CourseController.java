package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Course;

import com.example.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/create")
	public String create(@RequestParam String courseId, @RequestParam String courseName, @RequestParam String provider, @RequestParam String university, @RequestParam String parentSubject, @RequestParam String childSubject, @RequestParam String url, @RequestParam double length, @RequestParam String nextSession, @RequestParam String videoUrl) {
		Course c = courseService.create(courseId, courseName, provider, university, parentSubject, childSubject, url, length, nextSession, videoUrl);
		return c.toString();
	}
	
	@RequestMapping("/get")
	public Course getCourse(@RequestParam String courseId) {
		return courseService.getByCourseId(courseId);
	}
	@GetMapping("/getAll")
	public List<Course> getAll(){
		return courseService.getAll();
	}
	@RequestMapping("/update")
	public String update(@RequestParam String provider, @RequestParam double length) {
		Course c = courseService.update(provider, length);
		return c.toString();
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam String courseId) {
		courseService.delete(courseId);
		return "Deleted cOURSE : "+courseId;
	}
	@RequestMapping ("/deleteAll")
	public String deleteAll() {
		courseService.deleteAll();
		return "Deleted all records";
	}
}
