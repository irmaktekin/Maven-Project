package com.irmakTekin.learnspringframework.examples.f1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
@Component
class SomeClass {
	private SomeDependency someDependency;
	
	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency=someDependency;
		System.out.println("All dependicies are ready");
	}
	//As soon as the dependencies are wired in we would want
	//to do some initialization.
	@PostConstruct
	public void initialize() {
		someDependency.getReady();
	}
	// To do some operation before bean is removed from context
	@PreDestroy
	public void cleanup() {
		System.out.println("Clean up");
	}
	
}

@Component
class SomeDependency{

	public void getReady() {
		// TODO Auto-generated method stub
		System.out.println("Some logic using some dependency");
	}
	
}
@Configuration
@ComponentScan

public class PrePostAnnotationsContextLauncherApplication{
	


	public static void main(String [] args) {
		try(var context = 
				new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApplication.class)){

				Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			
		}
	}
	
	
	
}
