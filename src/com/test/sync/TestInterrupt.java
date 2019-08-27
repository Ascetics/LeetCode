package com.test.sync;

import java.util.Date;

public class TestInterrupt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.setName("RunnerThread");//被监视的线程
		
		ThreadMonitor tMonitor = new ThreadMonitor(t);//监视的线程
		tMonitor.start();//开始监视
		
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t.start();//被监视的线程开始运行
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
		}
		t.flag = false;//被监视的线程结束
		
		try {
			Thread.sleep(700);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		tMonitor.flag = false;//监视的线程后结束
	}

}

class MyThread extends Thread {
	boolean flag = true;

	@Override
	public void run() {
		while (flag) {
			System.out.println("===" + new Date() + "===");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}

}

class ThreadMonitor extends Thread {
	private Thread t;
	boolean flag;
	public ThreadMonitor(Thread t) {
		this.t = t;
		this.flag = true;
	}

	@Override
	public void run() {
		while (flag) {
			System.out.println(t.getId() + "==" + t.getName() + "==" + t.getState().toString());
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
