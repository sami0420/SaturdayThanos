package com.upskill.java_2;

public class SwitchCase {
	
	static int day = 8;

	public static void main(String[] args) {
	day();
		
	}
	
	//Switch case
	public static void day(){
		switch(day){
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Satueday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		case 8:
			System.out.println("Offday");
			break;
		}
	}

}
