package com.irmakTekin.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
//In here you can define spring beans

record Person(String name, int age, Adress adress) {}
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
		return new Person("Ravi",20, new Adress("Manisa","Yunusemre"));
		
	}
	
	@Primary
	@Bean(name="address2")
	public Adress adress() {
		return new Adress("Uncubozköy","Manisa");
	}
	@Bean(name="address3")
	public Adress adress3() {
		return new Adress("Uncubozköy","Şehzadeler");
	}
	@Bean
	public Person person2MethodCall() {
		return new Person(name(),age(),adress());
		
	}
	@Bean
	public Person person3Parameters(String name, int age, Adress address2) {
		return new Person(name,age,address2);
		
	}
}
