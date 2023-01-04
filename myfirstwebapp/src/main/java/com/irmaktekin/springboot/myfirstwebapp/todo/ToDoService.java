package com.irmaktekin.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class ToDoService {
	private static List <ToDo> todos =new ArrayList<>();
	static {
		todos.add(new ToDo(1,"irmaktekin","Learn AWS",
				LocalDate.now().plusYears(1),false));
		todos.add(new ToDo(2,"irmaktekin","Learn DevOps",
				LocalDate.now().plusYears(1),false));
		todos.add(new ToDo(3,"irmaktekin","Full Stack Development",
				LocalDate.now().plusYears(1),false));
	}
	
	public List <ToDo> findByUsername(String username){
		return todos;
			
	}
	

}
