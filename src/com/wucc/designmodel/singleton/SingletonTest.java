package com.wucc.designmodel.singleton;

public class SingletonTest {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getSingleton();
		singleton.show();
	}

}
