package com.javaLogicBuilding;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		
		//print right angle triangle using star pattern
		/**
		 * 				*
		 * 				* *
		 * 				* * *
		 * 				* * * *
		 * 				* * * * *
		 * 				* * * * * *
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter any number");
		int num = scanner.nextInt();
		scanner.close();
		
		System.out.println();
		
		for(int i = 1; i <= num; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		
	}

}
