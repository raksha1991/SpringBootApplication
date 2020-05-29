package com.sprintBoot.course;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sprintBoot.university.University;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/university/{id}/courses")
	public List<Course> getAllCourses(@PathVariable Integer id) {
		return courseService.getAllCourses(id);
	}
	
	@RequestMapping("/university/{universityId}/course/{courseId}")
	public Optional<Course> getCourse(@PathVariable Integer universityId, @PathVariable Integer courseId) {
		return courseService.getCourse(courseId);
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "/university/{universityId}/course")
	public void addCourse(@RequestBody Course newCourse, @PathVariable Integer universityId) {
		newCourse.setUniversity(new University(universityId));
		courseService.addCourse(newCourse);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value = "/university/{universityId}/course/{courseId}")
	public void updateCourse(@PathVariable Integer courseId, @PathVariable Integer universityId, @RequestBody Course updatedCourse) {
		updatedCourse.setUniversity(new University(universityId));
		updatedCourse.setId(courseId);
		courseService.updateCourse(updatedCourse);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value = "/university/{universityId}/course/{courseId}")
	public void updateCourse(@PathVariable Integer courseId) {
		courseService.deleteCourse(courseId);
	}

}
