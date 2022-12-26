package com.irmakTekin.learnspringframework.examples.g1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;

@Configuration
@ComponentScan

public class CdiContextLauncherApplication{
	


	public static void main(String [] args) {
		try(var context = 
				new AnnotationConfigApplicationContext(CdiContextLauncherApplication.class)){
			
		}
	}
	
	
	
}
