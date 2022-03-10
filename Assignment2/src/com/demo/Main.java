package com.demo;



	public class Main {
		public static void main(String[] args) {

			Parrot parrot=new Parrot("Parrot");
			Duck duck=new Duck("Duck");
			Eagle eagle=new Eagle("Eagle");
			
			parrot.canFly();
			eagle.canFly();
			
//			parrot.canSwim();
			eagle.canSwim();
			
			parrot.color();
			duck.color();
			eagle.color();
			
		}
	}



