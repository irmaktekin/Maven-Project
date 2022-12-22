package com.irmakTekin.learnspringframework.examples.a0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass{
	//field injection
		//@Autowired
		Dependency1 dependency1;
		//@Autowired
		Dependency2 dependency2;
		
	/*@Autowired
	public void setDependency1(Dependency1 dependency1) {
		System.out.println("Setter injection dependency1");
		this.dependency1 = dependency1;
	}
	@Autowired
	public void setDependency2(Dependency2 dependency2) {
		System.out.println("Setter injection dependency2");

		this.dependency2 = dependency2;
	}*/

	
	public String toString() {
		return "Using"+dependency1+"and"+dependency2;
	}

	//Autowired can be added or not.
	public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		System.out.println("Constructor injection");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}
}
@Component
class Dependency1{
	
}
@Component
class Dependency2{
	
}

@Configuration
@ComponentScan

public class SimpleSpringContextLauncherApplication{
	


	public static void main(String [] args) {
		try(var context = 
				new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class)){

				System.out.println(context.getBean(YourBusinessClass.class));
			
		}
	}
	
	
	
}
