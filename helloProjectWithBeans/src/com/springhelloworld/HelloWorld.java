package com.springhelloworld;

public class HelloWorld {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	 public void display() {
		 System.out.println("Hello World from "+name);
	 }
}
