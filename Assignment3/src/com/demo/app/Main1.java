package com.demo.app;



public class Main1 {

	public static void main(String[] args) {
		Runnable runObj=new MyRunnable();
		
		Thread t1=new Thread(runObj);
		
		t1.start();
	}
	
	
}







