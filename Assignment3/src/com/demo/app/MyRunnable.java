package com.demo.app;



	

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=50;i++)
			System.out.println(i);
	}
	
}