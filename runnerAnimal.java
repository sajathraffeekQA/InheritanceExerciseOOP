package com.qa.inheritanceexercise;

public class runnerAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gorilla gorillasmart = new Gorilla();
		gorillasmart.smartLegs();
		gorillasmart.smart();
		
		
		Ape walkWay = new Ape();
		walkWay.limbLegs();
		walkWay.walkHow();
		
		Mammal running = new Mammal();
		running.run();
		running.skinType();

		Animal noise = new Animal();
		noise.ageSound();

	}

}
