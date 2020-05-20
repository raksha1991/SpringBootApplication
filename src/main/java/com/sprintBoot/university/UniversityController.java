package com.sprintBoot.university;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
public class UniversityController {
	
	@Autowired
	private UniversityService universityService;
	
	@RequestMapping("/university")
	public List<University> getAllUniversities() {
		return universityService.getAllUniversities();
	}
	
	@RequestMapping("/university/{id}")
	public Optional<University> getUniversity(@PathVariable Integer id) {
		return universityService.getUniversity(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "/university")
	public void addUniversity(@RequestBody University newUniversity) {
		universityService.addUniversity(newUniversity);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value = "/university/{id}")
	public void updateUniversity(@PathVariable Integer id, @RequestBody University updatedUniversity) {
		universityService.updateUniversity(updatedUniversity, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value = "/university/{id}")
	public void updateUniversity(@PathVariable Integer id) {
		universityService.deleteUniversity(id);
	}
	
	
}
