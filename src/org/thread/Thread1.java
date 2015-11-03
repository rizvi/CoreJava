package org.thread;

public class Thread1 {

	public static void main(String[] args) {
		new ThreadTest("eBay").start();
		new ThreadTest("Paypal").start();
		new ThreadTest("Google").start();
		new ThreadTest("Rizvi").start();
	}
}

class ThreadTest extends Thread {
	public ThreadTest(String str) {
		super(str);
	}

	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println("Loop " + i + ": " + getName());
			try {
				sleep((int) (Math.random() * 3000));
			} catch (InterruptedException e) {
			}
		}
		System.out.println("Test Finished for: " + getName());
	}
}