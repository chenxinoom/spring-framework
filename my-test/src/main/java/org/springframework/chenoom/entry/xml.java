package org.springframework.chenoom.entry;

import java.util.List;

public class xml {
	private String name;
	private List<String> list;

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

	@Override
	public String toString() {
		return "xml{" +
				"name='" + name + '\'' +
				", list=" + list +
				'}';
	}
}
