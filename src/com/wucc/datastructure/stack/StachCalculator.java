package com.wucc.datastructure.stack;

import java.util.Stack;

/**
 * <p>
 * 用栈实现计算表达式
 * <p>
 *
 * @author wudingjia
 * @date 2020-08-18 15:37
 */
public class StachCalculator {

	public static void main(String[] args) {
		String expression = "3*18+3+6*23534545";
		//操作数栈
		ArrayToStack numStack = new ArrayToStack(10);
		//操作符栈
		ArrayToStack operStack = new ArrayToStack(10);
		//用于扫描
		int index = 0;
		int num1 = 0;
		int num2 = 0;
		int oper = 0;
		int res =0 ;
		char ch = ' ';
		String keepNum = "";
		//开始扫描
		while (true){
			ch = expression.substring(index, index + 1).charAt(0);
			//判断ch是操作数还是操作符
			if(operStack.isOper(ch)){
				//是操作符
				if(!operStack.isEmpty()){
					if(operStack.priority(ch)<=operStack.priority(operStack.peek())){
						num1 = numStack.pop();
						num2 = numStack.pop();
						oper = operStack.pop();
						res = numStack.cal(num1,num2,oper);
						numStack.push(res);
						operStack.push(ch);
					}else {
						operStack.push(ch);
					}
				}else {
					operStack.push(ch);
				}
			}else {
				//是操作数
				keepNum += ch;
				if(index == expression.length()-1){
					numStack.push(Integer.parseInt(keepNum));
				}else {
					//如果后一位是操作符
					if(operStack.isOper(expression.substring(index+1,index+2).charAt(0))){
						numStack.push(Integer.parseInt(keepNum));
						keepNum = "";
					}
				}
			}
			index++;
			if(index>=expression.length()){
				break;
			}
		}

		while (true){
			if(operStack.isEmpty()){
				break;
			}
			num1 = numStack.pop();
			num2 = numStack.pop();
			oper = operStack.pop();
			res = numStack.cal(num1,num2,oper);
			numStack.push(res);
		}

		int res2 = numStack.pop();
		System.out.println(res2);


	}


}
