package org.springframework.chenoom.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.chenoom.entry.xml;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class XmlTest {
	public static void main(String[] args) {
		//xmlbeanfactroy
//		ClassPathResource classPathResource = new ClassPathResource("bean.xml");
//		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(classPathResource);
//		Object xml = xmlBeanFactory.getBean("xml");
//		System.out.println(xml);
		//xmlbeanfactory编程式开发
		//这个可以用defaultListableBeanfactroy类来创建ioc对象 以后的自己想拓展的用户
//		ClassPathResource classPathResource = new ClassPathResource("bean.xml");	//定义 beandefinition的抽象资源
//		DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();	//beanfactory
//		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory); //读取器 会调配置
//		xmlBeanDefinitionReader.loadBeanDefinitions(classPathResource);		//载入
//
//		Object xml = defaultListableBeanFactory.getBean("xml");

		xml xml1 = new xml();
		FileSystemXmlApplicationContext fileSystemXmlApplicationContext = new FileSystemXmlApplicationContext("classpath:bean.xml");
		Object xml = fileSystemXmlApplicationContext.getBean("xml");
		System.out.println(xml);
	}
}
