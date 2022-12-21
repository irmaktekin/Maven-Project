package com.irmakTekin.learnspringframework.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		//1:Launch a Spring context
		
		try(var context=
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
					
					
					//2:configure the things that we want Spring to manage
							//via config class
				System.out.println(context.getBean("name"));
				System.out.println(context.getBean("age"));
				System.out.println(context.getBean("person"));
				System.out.println(context.getBean(Adress.class));
				System.out.println(context.getBean("person2MethodCall"));
				System.out.println(context.getBean("person3Parameters"));
				System.out.println(context.getBean(Adress.class));

				//print all beans definitions
				Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
				}
	
	
	}	

}
