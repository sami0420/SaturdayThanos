package com.upskill.java_1;

public class AccessModifier {

	public static void main(String[] args) {
	
		//Different Access Modifier in Java
		
		public String name = "Sami"; //Public - Any class can access
		
		private int age = 42;       //Private - only same class can access
		
		protected int ssn = 123456; //Protected - classes in the same package and subclass can access
		
		String address = "Heritage Tower"; //Default - class in same package can access           

	}

}
