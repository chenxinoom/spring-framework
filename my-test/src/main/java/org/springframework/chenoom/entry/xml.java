package org.springframework.chenoom.entry;

import java.util.List;

public class xml {
	private String name;
	private List<String> list;
	private Teacher teacher;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public void setTeacher(Teacher teacher){
		this.teacher = teacher;
	}

	public Teacher getTeacher(){

		return teacher;
	}

//	@Override
//	public String toString() {
//		return "xml{" +
//				"name='" + name + '\'' +
//				", list=" + list +
//				", teacher=" + teacher +
//				'}';
//	}
}
