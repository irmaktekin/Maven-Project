package com.irmak.springboot.learnjpahibernate;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringJpaRepository extends JpaRepository<Course,Long>{
	
	List <Course>findByAuthor(String author);
}
