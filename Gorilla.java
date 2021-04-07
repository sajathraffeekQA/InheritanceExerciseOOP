package com.qa.inheritanceexercise;

public class Gorilla extends Ape {

	private boolean intelligence = true;
	
	public  boolean smart() {
		return intelligence;
		
	}
	
	public void smartLegs() {
		System.out.println("assumption that is smart is " + intelligence + " and the number of limbs are " + super.getLimbs());
	}
	
}


