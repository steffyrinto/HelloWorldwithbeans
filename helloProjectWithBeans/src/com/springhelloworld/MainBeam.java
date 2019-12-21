package com.springhelloworld;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainBeam {
	 public static void main(String[] args) {
		 ApplicationContext a=new ClassPathXmlApplicationContext("resources/NewFile.xml");
		 HelloWorld mybean=(HelloWorld) a.getBean("helloworld");
		 mybean.display();
		 
	 }

}
