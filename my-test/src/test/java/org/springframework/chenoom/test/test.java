package org.springframework.chenoom.test;

import javafx.fxml.FXML;
import org.springframework.chenoom.entry.xml;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class test {

	class a{

	}

	class b extends a{

	}

	class c extends a{

	}

	public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
		Class<? extends xml> aClass = new xml().getClass();

		Constructor<? extends xml> constructor = aClass.getConstructor();
		xml xml = constructor.newInstance();

		System.out.println(xml);
	}
}
