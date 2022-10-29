package com.upskill.java_3;

public class Loops {

/*	
	Types of Loops
	1. For Loop- doing same thing again and again
	2. While Loop- doing same thing again and again until the condition matches
	3. Do While Loop-doing loop without seeing the condition and then match the condition
	4. Infinite Loop
	*/
	
	public static void main(String[] args) {
  //practiceforloop();
  // practicewhileloop();
  // practiceDoWhileLoop();
  // practiceInfiniteloop();
   practiceNestedForloop();
	}
public static void practiceforloop(){
		int i;
		for (i = 100; i >=1; i--){
			System.out.println("For Loops Numbers = " +i);
		}
	}
	 
	
public static void practicewhileloop(){
		int i = 1;
		while (i<=100){
			System.out.println("While Loops Numbers = " +i );
			i++;
		}
	}
	
	public static void practiceDoWhileLoop(){
		int i = 1;
		do{
			System.out.println("Do While Loops numbers = " +i);
			i++;
		}while (i<=0);
	}

	
  public static void practiceInfiniteloop(){
	  int i = 1;
	  for (i = 1;  ; i++){
		  System.out.println("For loops numbers = " + i);
	  }
  }
  
  public static void practiceNestedForloop(){
	  int i;
	  int j;
	  for (i = 1; i <=10; i++){
		  for (j = 1; j <=10; j++){
			  int multiplicationTable = i * j;
		  
		   System.out.print(multiplicationTable + " = ");
		   System.out.println (i+ "X"+j);
		  }
		   
		   System.out.println("");
	 
	  
	  }
	  
	  
  }
}
	  
	  
  

		
	