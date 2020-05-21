package com.wucc.test.impl;

import com.wucc.test.Wucc01;

public class Wucc01Impl  {
	public static void main(String[] args) {
		Wucc01 wucc = new Wucc01() {
			@Override
			public String  testWucc() {
				//System.out.println("wucc");
				return "wucc";
			}
		};
		String s = wucc.testWucc();
		System.out.println(s);
	}
}
