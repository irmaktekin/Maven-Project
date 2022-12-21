package com.irmakTekin.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//In here you can define spring beans

record Person(String name, int age) {}
record Adress(String firstLine, String city) {}

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	//this method produces a bean which is managed by spring container
	public String name() {
		return "Irmak";
	}
	

	@Bean
	//this method produces a bean which is managed by spring container
	public int age() {
		return 25;
	}
	@Bean
	public Person person() {
		return new Person("Ravi",20);
		
	}
	
	@Bean
	public Adress adress() {
		return new Adress("Uncubozköy","Manisa");
	}

}
