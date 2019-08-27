package com.test.sync;


public class TestThread1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Runner r = new Runner();
		Thread t = new Thread(r);
		t.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("Main Thread---" + i);
		}
	}

}

class Runner implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Runner1 Thread--" + i);
		}
	}
	
}
