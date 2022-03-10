package com.demo;

public class AnotherExampleStatic {
	
	
		//static variables
		public static String country="India";
		public static String state="AndhraPradesh";
		public static String  village="guttikonda";
		
		public void ordinaryMethod() {
			System.out.println(country+" : "+state+" : "+ village);
		}
		public static void main(String[] args) {
			AnotherExampleStatic as=new AnotherExampleStatic();
			as.ordinaryMethod();
			
		}

	}


