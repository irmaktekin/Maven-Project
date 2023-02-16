package com.irmak.springboot.learnjpahibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import jpa.CourseJpaRepository;


@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	//@Autowired
	//private CourseJdbcRepository repository;
	//@Autowired
	//private CourseJpaRepository repository;
	@Autowired
	private CourseSpringJpaRepository repository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	//	repository.insert(new Course(1,"Learn AWS JPA Now","irmaktekin"));
	//	repository.insert(new Course(2,"Learn Cloud JPANow","irmaktekin"));
	//	repository.deleteById(1);
		repository.save(new Course(1,"Learn AWS JPA Now","irmaktekin"));
		repository.save(new Course(2,"Learn Cloud JPANow","irmaktekin"));
		System.out.println(repository.findById(2l));
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		System.out.println(repository.findByAuthor("irmaktekin"));


	}

}
