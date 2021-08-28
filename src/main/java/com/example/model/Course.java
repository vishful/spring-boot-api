package com.example.model;


import org.bson.BsonDateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Course {

	@Id
	String courseId;
	String courseName;
	String provider;
	String university;
	String parentSubject;
	String childSubject;
	String url;
	double length;
	String nextSession;
	String videoUrl;
	
	public Course(String courseId, String courseName, String provider, String university, String parentSubject, String childSubject, String url, double length, String nextSession, String videoUrl) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.provider = provider;
		this.university = university;
		this.parentSubject = parentSubject;
		this.childSubject = childSubject;
		this.url = url;
		this.length = length;
		this.nextSession=nextSession;
		this.videoUrl = videoUrl;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getParentSubject() {
		return parentSubject;
	}
	public void setParentSubject(String parentSubject) {
		this.parentSubject = parentSubject;
	}
	public String getChildSubject() {
		return childSubject;
	}
	public void setChildSubject(String childSubject) {
		this.childSubject = childSubject;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public String getVideoUrl() {
		return videoUrl;
	}
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}
	public String getNextSession() {
		return nextSession;
	}
	public void setNextSession(String nextSession) {
		this.nextSession = nextSession;
	}
	
	public String toString() {
		return "Course Id : "+courseId+" Course Name : "+courseName+" Provider : "+provider+ " University : "+university+" Parent Subject : "+parentSubject+" Child Subject : "+childSubject+" URL : "+url+" Length : "+length+ "Next Session : "+ nextSession+ " Video URL : "+videoUrl;
	}

	
	
}
