package com.irmakTekin.learnspringframework.examples.a1;

import org.springframework.stereotype.Repository;

//@Component
@Repository
public class MySQLDataService implements DataService{
	@Override
	public int[] retrieveData() {
		return new int [] {11,22,33,44};
	}
	
}
