package com.wucc.designmodel.singleton;

public class Singleton {
	
	private static Singleton singleton;
	private Singleton() {
	}
	
	public static Singleton getSingleton() {
		return new Singleton();
	}
	
	public void show() {
		System.out.println("i am singleton...");
	}

}
