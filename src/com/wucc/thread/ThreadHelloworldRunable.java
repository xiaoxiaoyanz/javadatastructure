package com.wucc.thread;

public class ThreadHelloworldRunable implements  Runnable {
	@Override
	public void run() {
		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"=="+Thread.currentThread().getId()+"=="+Thread.currentThread().isDaemon()+"=="+Thread.currentThread().getPriority());
	}
}
