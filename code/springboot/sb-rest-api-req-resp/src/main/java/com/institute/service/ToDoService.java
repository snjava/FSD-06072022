package com.institute.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.institute.bean.ToDoBean;

@Service
public class ToDoService {
	
	ArrayList<ToDoBean> list = new ArrayList<ToDoBean>();
	
	public void addTask(ToDoBean task) {
		list.add(task);
	}
	
	public List<ToDoBean> getAllTask() {
		return list;
	}
	
	public List<ToDoBean> getTaskByDate(String date) {
		ArrayList<ToDoBean> filterData = new ArrayList<ToDoBean>();
		
		for(ToDoBean bean : list) {
			if(bean.getCreatedOn().equals(date)) {
				filterData.add(bean);
			}
		}
		
		return filterData;
	}
	
}
