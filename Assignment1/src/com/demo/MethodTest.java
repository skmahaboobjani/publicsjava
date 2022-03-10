package com.demo;

public class MethodTest {

	void hello(int i) {
		System.out.println("Inside hello(int i)");
	}

	void hello(byte i) {
		System.out.println("Inside hello(byte i)");
	}

	void hello(short i) {
		System.out.println("Inside hello(short i)");
	}

	void hello(long i) {
		System.out.println("Inside hello(long i)");
	}

	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		mt.hello(5);		
		
	}

}
