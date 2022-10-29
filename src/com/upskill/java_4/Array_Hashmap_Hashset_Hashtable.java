package com.upskill.java_4;

import java.util.HashMap;
import java.util.HashSet;

public class Array_Hashmap_Hashset_Hashtable {

	public static void main(String[] args) {
		
		extracted();
		int[] ageThanos = new int[]{30, 35, 27, 22, 40, 32};
		
		System.out.println("Student Age :" +  ageThanos[2]);
		System.out.println("Total Student Ages :" +  ageThanos.length);
		
		
		extracted();
		String[] nameThanos = new String []{"Jalloh", "Sami", "Anis", "Emad", "Rupa"};
		
		System.out.println ("Student Name :" +  nameThanos [1]);
		System.out.println ("Total Student Names :" +  nameThanos.length);
		
		int [][] ageThanos2D = {{30, 35, 27, 22, 40, 32}, 
				                {37, 26, 24, 35}};
		
		System.out.println("Student Age 2D :" + ageThanos2D [0][4]);
		
		
		HashMap<String, String> Region = new HashMap<String, String>();
		
		Region.put("Bangladesh", "Dhaka");
		Region.put("India", "Mumbai");
		Region.put("United States", "Washington");
		
		System.out.println("Region city: " + Region.get("Bangladesh"));
		
		
		HashSet<String> car = new HashSet<String>();
		car.add("BMW");
		car.add("Audi");
		car.add("Ford");
		
		System.out.println("Car : "+ car);
		
		
		HashSet<Integer> ageStudent = new HashSet<Integer>();
		
		
		ageStudent.add(30);
		ageStudent.add(31);
		ageStudent.add(32);
		System.out.println("Select Student Ages :" + ageStudent);

		

		
		
	
		
		
		}

	private static void extracted() {
		String name = "Student";
	}

	private static void extracted() {
		int age = 30;
	}
	}


