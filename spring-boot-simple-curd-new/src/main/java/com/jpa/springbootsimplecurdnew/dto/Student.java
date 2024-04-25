package com.jpa.springbootsimplecurdnew.dto;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Student {
	@Id
	private int id;
	private String name;
	private String email;
	private LocalDate dob;
	private String degree;
	
}
