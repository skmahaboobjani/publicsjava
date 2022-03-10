package com.demo;

public class BigNumber {
	
		static int biggestOfThree(int x, int y, int z)
		{

			return z > (x > y ? x : y) ? z : ((x > y) ? x : y);
		}

		
		public static void main(String[] args)
		{

	
			int a, b, c;

			
			int largest;
			a = 25;
			b = 10;
			c = 30;
		
			largest = biggestOfThree(a, b, c);

		
			System.out.println(largest
							+ " is the largest number.");
		}
	}



