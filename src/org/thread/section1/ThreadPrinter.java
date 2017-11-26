package org.thread.section1;

public class ThreadPrinter implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("From the new thread: "
					+ Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
