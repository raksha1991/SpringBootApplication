package com.sprintBoot.university;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniversityService {
	
	@Autowired
	private UniversityRepository universityRepository;
	
	public List<University> getAllUniversities(){
		List<University> universities = new ArrayList<>();
		universityRepository.findAll().forEach(universities::add);
		Collections.sort(universities);
		return universities;
	}
	
	public Optional<University> getUniversity(Integer id) {
		return universityRepository.findById(id);
	}
	
	public void addUniversity(University newUniversity) {
		universityRepository.save(newUniversity);
	}
	
	public void updateUniversity(University updateUniversity, Integer id) {
		universityRepository.save(updateUniversity);
	}

	public void deleteUniversity(Integer id) {
		universityRepository.deleteById(id);
	}
	
}
