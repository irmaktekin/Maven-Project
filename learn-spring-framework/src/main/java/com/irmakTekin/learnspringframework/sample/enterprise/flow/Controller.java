package com.irmakTekin.learnspringframework.sample.enterprise.flow;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//sending response in the right format
@RestController
public class Controller {
	@Autowired
	private BusinessService businessService;
	// "/sum" => 100
	
	@GetMapping("/sum")
	public long displaySum() {
		return businessService.calculateSum();
	}

}


//business logic
@Component
class BusinessService{
	@Autowired
	
	private DataService dataService;
	
	public long calculateSum() {
		 List<Integer> data = dataService.retrieveData();
		 return data.stream().reduce(Integer::sum).get();
	}
}

//getting data
@Component
class DataService{
	public List <Integer> retrieveData(){
		return Arrays.asList(12,34,56,78);
	}
	
}