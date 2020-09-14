package com.wucc.datastructure.stack;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-08-24 09:48
 */
public class PolandNotation {
	public static void main(String[] args) {
		String suffixExpression = "3 4 + 8 * 9 -";
		List<String> list = getListString(suffixExpression);
		int result = calculate(list);
		System.out.println("运算结果为："+result);


		String suffixExpression1 = "1+((3+5)-6)*6-9";//中缀表达式

		//中缀表达式转后缀表达式，首先将suffiExpression1转成list
		List<String> list1 = toInExpressionList(suffixExpression1);
		//转后缀表达式
		List<String> list2 = parseSuffixExpressionList(list1);

		int calculate = calculate(list2);

		System.out.println("中缀表达式计算结果为："+calculate);

	}

	private static List<String> parseSuffixExpressionList(List<String> list1) {
		Stack<String> stack1 = new Stack<>();
		List<String> s2 = new ArrayList<>();
		for (String item : list1) {
			if(item.matches("\\d+")){
				s2.add(item);
			}else if("(".equals(item)){
				stack1.push(item);
			}else if(")".equals(item)){
				while (!"(".equals(stack1.peek())){
					s2.add(stack1.pop());
				}
				stack1.pop();
			}else {
				while (stack1.size() != 0 && Operation.getValue(stack1.peek())>=Operation.getValue(item)){
					s2.add(stack1.pop());
				}
				stack1.push(item);
			}
		}
		while (stack1.size() != 0 ){
			s2.add(stack1.pop());
		}
		return s2;
	}

	private static List<String> toInExpressionList(String suffixExpression1) {
		List<String> res = new ArrayList<>(16);
		//遍历指针
		int i = 0;
		//对多位数的拼接
		String str;
		//每一个字符
		char c;
		do {
			//如果是一个数字，加入res
			if((c=suffixExpression1.charAt(i)) < 48|| (c=suffixExpression1.charAt(i)) > 57){
				res.add(""+c);
				i++;
			}else {
				str = "";
				while (i < suffixExpression1.length() && (c=suffixExpression1.charAt(i)) >= 48 && (c=suffixExpression1.charAt(i)) <= 57){
					str += c;
					i++;
				}
				res.add(str);
			}
		}while (i < suffixExpression1.length());
		return res;
	}

	private static int calculate(List<String> list) {
		Stack<String> stack = new Stack<>();
		for (String item : list) {
			if (item.matches("\\d+")) {
				stack.push(item);
			} else {
				int num2 = Integer.parseInt(stack.pop());
				int num1 = Integer.parseInt(stack.pop());
				int res = 0;

				if ("+".equals(item)) {
					res = num1 + num2;
				} else if ("-".equals(item)) {
					res = num1 - num2;
				} else if ("*".equals(item)) {
					res = num1 * num2;
				} else if ("/".equals(item)) {
					res = num1 / num2;
				} else {
					throw new RuntimeException("运算符有问题");
				}
				stack.push("" + res);

			}
		}
		return Integer.parseInt(stack.pop());
	}

	private static List<String> getListString(String suffixExpression) {
		String[] s = suffixExpression.split(" ");
		List<String> list = new ArrayList<>(8);
		for (String str : s) {
			list.add(str);
		}
		return list;
	}
}
