package com.demo.app;
 
public class TestSynchronization2 {

	public static void main(String[] args) {
		Counter c = new Counter();

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				c.increment();
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 5;i++) {
				c.increment();
			}

		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Count= " + c.getCount());
	}
}

class Counter {

	private int count;


	public synchronized void increment() {
		count++;
	}

	public int getCount() {
		return count;
	}
}