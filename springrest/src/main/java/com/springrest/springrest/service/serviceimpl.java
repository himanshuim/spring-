package com.springrest.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.course;
@Service
public class serviceimpl  implements CourseService{
	
  List<course> list;
	
	public serviceimpl()
	{
		
			// TODO Auto-generated method stub
			list =new ArrayList<>();
			list.add(new course(145,42,"this is course java"));
			list.add(new course(146,147,"this is my area"));
			 
	}
	
	
	

	@Override
	public List<course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

}
