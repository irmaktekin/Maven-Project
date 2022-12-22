package com.irmakTekin.learnspringframework.examples.a1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan

public class DepInjectionLauncherApplication {
	


	public static void main(String [] args) {
		try(var context = 
				new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)){
				
			
			
		}
	}
	
	
	
}
