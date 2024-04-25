package com.jpa.springbootsimplecurdnew.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.springbootsimplecurdnew.dao.StudentDao;
import com.jpa.springbootsimplecurdnew.dto.Student;

@RestController
public class StudentController {
	@Autowired
	private StudentDao studentDao;
	
	@PostMapping("/saveStudent")
	public Student saveStudentController(@RequestBody Student student) {
		return studentDao.saveStudentDao(student);
	}
	
	@GetMapping("/getStudentById/{id}")
	public Student getStudentByIdController(@PathVariable Integer id) {
		return studentDao.getStudentByIdDao(id);
	}
	
	@DeleteMapping("/deleteStudentById/{id}")
	public String deleteByIdController(@PathVariable int id) {
		boolean bol= studentDao.deleteByIdDao(id);
		if(bol) {
			return "data deleted";
		}else {
			return "Id is not present";
		}
	}
	
	@PutMapping("/updateStudentById/{id}")
	public Student updateStudentByIdController(@RequestBody Student student) {
		return studentDao.updateStudentByIdDao(student);
	}
}
