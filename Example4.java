package com.javaLogicBuilding;

public class Example4 {

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
		for(int i = 1; i <= 6; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		
	}

}
