package com.qa.inheritanceexercise;

public class Mammal extends Animal {

	private String skin = "Hairy";
	private String pace = "Fast";
	
	public String skinType() {;
	return skin;
}
	
	
	public void run() {
	System.out.println("Has " + super.getLimbs() + " and runs " + pace);
	
	
}
	
}