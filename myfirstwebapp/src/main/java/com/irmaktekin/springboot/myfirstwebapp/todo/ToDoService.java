package com.irmaktekin.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class ToDoService {
	private static List <ToDo> todos =new ArrayList<>();
	private static int todosCount = 0;
	static {
		todos.add(new ToDo(++todosCount,"irmaktekin","Learn AWS",
				LocalDate.now().plusYears(1),false));
		todos.add(new ToDo(++todosCount,"irmaktekin","Learn DevOps",
				LocalDate.now().plusYears(1),false));
		todos.add(new ToDo(++todosCount,"irmaktekin","Full Stack Development",
				LocalDate.now().plusYears(1),false));
	}
	
	public List <ToDo> findByUsername(String username){
		return todos;
			
	}
	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		ToDo todo = new ToDo(++todosCount,username, description,targetDate,done);
		todos.add(todo);
		
	}
	

}
