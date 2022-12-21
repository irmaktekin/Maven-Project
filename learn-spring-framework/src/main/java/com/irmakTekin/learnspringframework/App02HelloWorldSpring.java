package com.irmakTekin.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		//1:Launch a Spring context
	var context=
			new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		//2:configure the things that we want Spring to manage
				//via config class
	System.out.println(context.getBean("name"));
	System.out.println(context.getBean("age"));
	System.out.println(context.getBean("person"));
	System.out.println(context.getBean("adress"));

	}	

}
