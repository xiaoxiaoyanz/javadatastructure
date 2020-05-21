package com.wucc.thread;

public class ThreadHelloWorld  extends  Thread{
	@Override
	public void run() {
		Thread.currentThread().setName("helloworld01");
		System.out.println(Thread.currentThread().getName());
		System.out.println("helloworld:thread");
	}

}
