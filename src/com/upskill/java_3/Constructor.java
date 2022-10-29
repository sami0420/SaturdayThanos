package com.upskill.java_3;

public class Constructor {

	String admin;
	int adAge;
	
	public Constructor(String name, int age){
		admin = name;
		adAge = age;
		
	}
	public static void main(String[] args) {
	
		Constructor obj = new Constructor("Fahime", 30);
		
		System.out.println(obj.adAge);
		System.out.println(obj.admin);
		
}
}