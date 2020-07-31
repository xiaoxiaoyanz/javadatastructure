package com.wucc.alibb;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AibbTest {

	@Test
	public  void test01(){
		List<String> list = new ArrayList<>(2);
		list.add("ccc");
		list.add("hhh");
		String[] strings = list.toArray(new String[0]);
		System.out.println(strings[0]);
	}

	@Test
	public  void test02(){
		String str = "a,b,c,d,,f";
		String[] split = str.split(",");
		System.out.println(split.length);
		System.out.println(split[5]);
	}
}
