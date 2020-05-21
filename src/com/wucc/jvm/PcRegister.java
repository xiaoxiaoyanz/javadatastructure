package com.wucc.jvm;

public class PcRegister {
	public static void main(String[] args) {
		int i = 10;
		int b = 20;
		int a = i + b;
		Integer d = 30;
		String s= "abc";
		System.out.println(a);
		System.out.println(s);
		String str = "a,b,c,,";
		String[] ary = str.split(",");
// 预期大于 3，结果是 3
		System.out.println(ary.length);
		System.out.println(d.equals(30));
	}
	public  int test01(){
		int i = 1;
		int j = 2;
		int k = i + j;
		return  k;
	}
}
