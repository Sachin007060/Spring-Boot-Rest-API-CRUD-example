package com.jpa.springbootsimplecurdnew.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.springbootsimplecurdnew.dto.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
