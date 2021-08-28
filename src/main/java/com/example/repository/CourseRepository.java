package com.example.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.model.*;


@Repository
public interface CourseRepository extends MongoRepository<Course, String> {
	  public Course findByProvider(String provider);
	  public Course findByCourseId(String courseId);
}
