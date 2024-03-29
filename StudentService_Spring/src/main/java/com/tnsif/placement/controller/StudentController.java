package com.tnsif.placement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.placement.entity.Student;
import com.tnsif.placement.repository.StudentRepository;



@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {

	@Autowired
	private StudentRepository studentRepo;

	@GetMapping("/{id}")
	public Student getCollegeById(@PathVariable Long id) {
		return studentRepo.findById(id).get();
	}

	@GetMapping
	public List<Student> getAllColleges() {
		return studentRepo.findAll();
	}

	@PostMapping
	public Student createCollege(@RequestBody Student Student) {
		return studentRepo.save(Student);
	}

	@PutMapping("/{id}")
	public Student updateCollege(@PathVariable Long id, @RequestBody Student student) {

		student.setId(id);
		return studentRepo.save(student);
	}

	@DeleteMapping("/{id}")
	public void deleteCollegeById(@PathVariable Long id) {
		studentRepo.deleteById(id);
	}
}
