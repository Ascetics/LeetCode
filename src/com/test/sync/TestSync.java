package com.test.sync;

public class TestSync {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runner1("Thread1"));
		Thread t2 = new Thread(new Runner1("Thread2"));
		t1.start();
		t2.start();
	}

}

class Runner1 implements Runnable {
	private String name;

	public Runner1(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(name + "---" + i);
		}
	}
}
