package com.sprintBoot.course;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(Integer universityId){
		List<Course> courses = new ArrayList<>();
		courseRepository.findByUniversityId(universityId).forEach(courses::add);
		return courses;
	}

	public Optional<Course> getCourse(Integer courseId) {
		return courseRepository.findById(courseId);
	}

	public void addCourse(Course newCourse) {
		courseRepository.save(newCourse);
	}

	public void updateCourse(Course updatedCourse) {
		courseRepository.save(updatedCourse);
	}

	public void deleteCourse(Integer courseId) {
		courseRepository.deleteById(courseId);
	}
	
	

}
