package com.irmakTekin.learnspringframework.examples.a1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
@Component
public class BusinessCalculationService {
	
	
	
	
	private DataService dataService;
	
	//@Autowired
	public BusinessCalculationService(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	public int findMax() {
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}

	
	public static void main(String[] args) {
		try(var context = 
				new AnnotationConfigApplicationContext(BusinessCalculationService.class)){
			
				Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
				System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		}
	}
}
