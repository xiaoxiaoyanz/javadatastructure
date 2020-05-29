package com.wucc.jdk8;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

public class lambda02 {

	@Test
	public void test01(){

		int m = 10;
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("hello"+m);
			}
		};
		r.run();

		Runnable r2 = () -> System.out.println("hello2");

		r2.run();
	}

	@Test
	public void test02(){

		Consumer<String>  com = (x) -> System.out.println(x);
		com.accept("hahaha");


	}

	@Test
	public void test03(){

		Consumer<String>  com = x -> System.out.println(x);
		com.accept("hahaha");


	}

	@Test
	public void test04(){
		Comparator<Integer> com = (x,y) -> {
			System.out.println("ccc");
			return Integer.compare(x,y);
		};
	}



}
