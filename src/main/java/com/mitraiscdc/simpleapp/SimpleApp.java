package com.mitraiscdc.simpleapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mitraiscdc.simpleapp.entity.Student;
import com.mitraiscdc.simpleapp.repository.StudentRepository;

@SpringBootApplication
public class SimpleApp {
    
    @Autowired
    StudentRepository studentRepository;
    
    SimpleApp(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
        studentRepository.save(new Student("John", "Doe"));
        studentRepository.save(new Student("Annie", "Wan"));
    }

	public static void main(String[] args) {
		SpringApplication.run(SimpleApp.class, args);
	}
}
