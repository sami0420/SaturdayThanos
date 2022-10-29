package com.upskill.homework;

public class Nested {


		
	Nested loop(){
		  int i;
		  int j;
		  for (i = 5; i <=10; i++){
			  for (j = 3; j <=10; j++){
				  int multiplicationTable = i * j;
			  
			   System.out.print(multiplicationTable + " = ");
			   System.out.println (i+ "X"+j);
			  }
			   
			   System.out.println("");
			   return;
		  }
		}

		
}