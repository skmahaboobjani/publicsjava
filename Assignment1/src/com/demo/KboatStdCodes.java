package com.demo;



public class KboatStdCodes {
	

		public static void main(String[] args)
		{
			
			int n = 4;
			
		
			String names[]
				= { "DELHI", "NOIDA", "GUARGAON", "BANGLORE" };
			String temp;
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					
					
					if (names[i].compareTo(names[j]) > 0) {
						
						temp = names[i];
						names[i] = names[j];
						names[j] = temp;
					}
				}
			}
			
		
			System.out.println(
				"The city names are: ");
			for (int i = 0; i < n; i++) {
				System.out.println(names[i]);
			}
		}
	}

	
	   
	


