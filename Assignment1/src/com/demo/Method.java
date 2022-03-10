package com.demo;

 class TestOverloading1 {

	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}
}

public class Method {

	public static void main(String[] args) {
		TestOverloading1 t=new TestOverloading1();
		System.out.println(t.add(11, 11));
		System.out.println(t.add(11, 11, 11));
	}

}
