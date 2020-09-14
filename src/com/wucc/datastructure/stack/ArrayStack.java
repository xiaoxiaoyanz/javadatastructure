package com.wucc.datastructure.stack;

import java.util.Scanner;

/**
 * <p>
 * 用数组实现栈
 * <p>
 *
 * @author wudingjia
 * @date 2020-08-18 15:06
 */
public class ArrayStack {

	public static void main(String[] args) {
		ArrayToStack arrayToStack = new ArrayToStack(10);
		boolean loop = true;
		String key = " ";
		Scanner scanner = new Scanner(System.in);
		while (loop){
			System.out.println("push:压栈"+" "+"pop:出栈"+" "+"show:查看"+" "+"exit:结束");
			key = scanner.next();
			switch (key){
				case "push":
					System.out.println("请输入一个整数");
					int i = scanner.nextInt();
					arrayToStack.push(i);
					break;
				case "pop":
					try {
						int pop = arrayToStack.pop();
						System.out.println("出栈的数据为："+pop);
					}catch (Exception e){
						System.out.println(e.getMessage());
					}
					break;
				case "show":
					arrayToStack.list();
					break;
				case "exit":
					scanner.close();
					loop = false;
					break;
				default:
					break;
			}
		}

	}



}


