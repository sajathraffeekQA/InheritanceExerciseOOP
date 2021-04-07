package com.qa.inheritanceexercise;

public class Ape extends Mammal {

	private int walkLegs = 2;
	
	public void walkHow() {
		System.out.println("Walks on " + walkLegs + " legs");
	}

	public void limbLegs() {
		System.out.println("Has " + super.getLimbs() + " but walks on " + walkLegs + " legs");
		
	}
	
	}
	



