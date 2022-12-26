package com.irmakTekin.learnspringframework.examples.a1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

//@Component
@Repository
@Primary
public class MongoDbDataService implements DataService{
	
	@Override
	public int[] retrieveData() {
		return new int [] {1,2,3,4,5};
	}
	

}
