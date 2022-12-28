package com.irmak.springboot.learnjpahibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	//@Autowired
	//private CourseJdbcRepository repository;
	@Autowired
	private CourseJpaRepository repository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.insert(new Course(1,"Learn AWS JPA Now","irmaktekin"));
		repository.insert(new Course(2,"Learn Cloud JPANow","irmaktekin"));
		repository.deleteById(1);
		
		System.out.println(repository.findById(2));
	}

}
