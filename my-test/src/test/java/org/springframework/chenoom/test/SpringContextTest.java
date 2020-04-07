package org.springframework.chenoom.test;

import org.springframework.chenoom.config.ApplicationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringContextTest {

	public static void main(String[] args){
		AnnotationConfigApplicationContext annotationConfigApplicationContext =
				new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Object student = annotationConfigApplicationContext.getBean("teacher");
		System.out.println(student);
	}
}
