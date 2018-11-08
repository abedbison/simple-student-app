package com.mitraiscdc.simpleapp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.mitraiscdc.simpleapp.entity.Student;


@RestResource(path="student", rel="student")
public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {

}
