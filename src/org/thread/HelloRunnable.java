package org.thread;

public class HelloRunnable implements Runnable {
	public static void main(String args[]) {
		(new Thread(new HelloRunnable())).start();
	}

	public void run() {
		System.out.println("Hello from a thread!");
	}
}
