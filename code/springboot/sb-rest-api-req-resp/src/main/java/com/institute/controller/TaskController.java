package com.institute.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.institute.bean.ToDoBean;
import com.institute.service.ToDoService;

@RestController
public class TaskController {
	
	@Autowired
	private ToDoService todoService; // DI process
	
	@PostMapping("/create-task")
	public String addTaskDetails(@RequestBody ToDoBean task) {
		System.out.println("Title : " + task.getTitle());
		System.out.println("Status : " + task.getStatus());
		System.out.println("CreatedDate : " + task.getCreatedOn());
		todoService.addTask(task);
		return "Task Created Successfully...";
	}
	
	
	@GetMapping("/get-all-task")
	public List<ToDoBean> getAllTaskDetails() {
		return todoService.getAllTask();
	}
	
	
	@GetMapping("/get-by-date")
	public List<ToDoBean> getTaskDetailsByDate(@RequestParam("date") String date) {
		System.out.println("Date : " + date);
		return todoService.getTaskByDate(date);
	}
	
	
	
	
	
	
	
	
}
