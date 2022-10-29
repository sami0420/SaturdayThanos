package com.upskill.java_2;

public class IfElseStatement {
	
	static int age = 110;

	public static void main(String[] args) {
		age();
	
		
	}
	
	public static void age(){
		if (age < 13){
			System.out.println("You are children");
		} else if (age > 13 && age < 18){
				System.out.println("You are teenager");
			} else {
			System.out.println("You are adult");
			if (age > 60){
				System.out.println("You are Old");
			 //Nested If Else Statement
				if (age > 100){
					System.out.println("You are Rebel");
				} else {
					System.out.println("You are Old");
				}
			}
			
		}
	
	}

}
