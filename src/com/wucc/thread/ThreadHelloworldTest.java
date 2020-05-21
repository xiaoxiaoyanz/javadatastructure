package com.wucc.thread;

public class ThreadHelloworldTest {
	public static void main(String[] args) throws InterruptedException {
		ThreadHelloWorld threadHelloWorld = new ThreadHelloWorld();
		threadHelloWorld.start();
		Thread.sleep(800);
		Thread.yield();
		for (int i = 0;i < 100;i++){
			Thread thread = new Thread(new ThreadHelloworldRunable());
			thread.setName("thread"+i);
			thread.start();
		}



		System.out.println(Thread.currentThread().getName());

	}
}
