package com.qa.inheritanceexercise;

public class Animal {

	private int age = 40;
	private String sound = "Loud";
	private int limbs = 4;
	
	public void ageSound(){
	System.out.println(age + sound);
	
}

	public int getLimbs() {
	return limbs;
	
}
    public void setLimbs(int numberLimbs) {
    	this.limbs = numberLimbs;
    	
    
    }
    
}