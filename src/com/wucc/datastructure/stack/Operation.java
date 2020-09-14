package com.wucc.datastructure.stack;

import com.wucc.designmodel.extendtest.A;

import java.util.Stack;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-08-25 13:48
 */
public class Operation {

	private static int ADD = 1;
	private static int SUB = 1;
	private static int MUL = 2;
	private static int DIV = 2;
	private static int MAX = 3;
	public static int getValue(String operation){

		int res = 0;
		switch (operation){
			case "+":
				res = ADD;
				break;
			case "-":
				res = SUB;
				break;
			case "*":
				res = MUL;
				break;
			case "/":
				res = DIV;
				break;
			case "(":
				break;
			default:
				break;

		}
		return  res;
	}
}
