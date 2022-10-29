package com.upskill.java_1;

public class VariableExample {
	
	public int a = 30;
	private int b= 40;
	static int c= 50;
	
	
			

	public static void main(String[] args){
		VariableExample obj = new VariableExample();
		obj.a1();
		obj.b1();
		c1();
		//obj.d();
	}
		
			public void a1(){
			int A =30;
			int A1 = a+A; 
			System.out.println("First sum is " + A1);
		}
			
			public int b1 (){
			int B = 40;
			int B1 = b+B;
			System.out.println ("Second sum is "  +B1);
			return B1;
			}
			
			public static void c1 (){
			int C = 50;
			int C1 = c+C;
			System.out.println("Third sum is " +  C1);
			
			
			}

			public void d(){
			int s = 40;
			int d = a+s;
			System.out.println(d);
			}
			
}

