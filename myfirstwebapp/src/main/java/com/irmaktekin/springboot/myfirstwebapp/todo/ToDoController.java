package com.irmaktekin.springboot.myfirstwebapp.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ToDoController {
	private ToDoService todoService;
	public ToDoController(ToDoService todoService) {
		super();
		this.todoService = todoService;
	}
	// /list-todos
	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap model) {
		List <ToDo> todos=todoService.findByUsername("irmaktekin");
		model.addAttribute("todos",todos);
		return "listTodos";
		
	}

}
