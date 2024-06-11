package com.javaLogicBuilding;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		
		//print left angle triangle using star pattern
		/**
		 * 				 *
		 * 			   * * 
		 * 			 * * *
		 * 		   * * * *
		 * 	  	 * * * * *
		 * 	   * * * * * *
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter any number");
		int num = scanner.nextInt();
		scanner.close();
		
		System.out.println();
		
		for(int i = 0; i < num; i++)
		{
			for(int j = 2*(num-i); j >= 0; j--)
			{
				System.out.print(" ");
			}
			
			for(int j = 0; j <= i; j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
	}

}
