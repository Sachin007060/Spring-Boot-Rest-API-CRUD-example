package com.jpa.springbootsimplecurdnew.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jpa.springbootsimplecurdnew.dto.Student;
import com.jpa.springbootsimplecurdnew.repository.StudentRepository;

@Repository
public class StudentDao {
	@Autowired
	private StudentRepository studentRepository;
	
	public Student saveStudentDao(Student student) {
		return studentRepository.save(student);
	}
	
	public Student getStudentByIdDao(Integer id) {
		Optional<Student> student=studentRepository.findById(id);
		if(student != null) {
			return student.get();
		}else {
			return null;
		}
	}
	
	public boolean deleteByIdDao(int id) {
		Student student= getStudentByIdDao(id);
		if(student != null) {
			studentRepository.delete(student);
			return true;
		}else {
			return false;
		}
	}
	
	public Student updateStudentByIdDao(Student student) {
		Student student1 = getStudentByIdDao(student.getId());
		if(student1 != null) {
			studentRepository.save(student);
			return student1;
		}else {
			return null;
		}
	}
}