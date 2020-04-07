package org.springframework.chenoom.entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("teacher")
public class Teacher {

	@Autowired
	Student student;

	public Teacher(){
		System.out.println("Teacher");
	}
}
