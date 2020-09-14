package com.wucc.datastructure.stack;

class ArrayToStack{
	private int maxStackSize;
	private int[] arrayToSTACK;
	private int top = -1;
	public ArrayToStack(int maxStackSize){
		this.maxStackSize = maxStackSize;
		arrayToSTACK = new int[maxStackSize];
	}
	public void  show(){

	}
	public boolean isFull(){
		return top == maxStackSize - 1;
	}
	public boolean isEmpty(){
		return top == -1;
	}

	public void push(int value){
		if(isFull()){
			System.out.println("栈满");
			return;
		}
		arrayToSTACK[++top] = value;
	}
	public int pop(){
		if(isEmpty()){
			throw  new RuntimeException("栈空");
		}
		int value = arrayToSTACK[top];
		top--;
		return  value;
	}
	public void  list(){
		if(isEmpty()){
			System.out.println("栈空");
			return;
		}
		for (int i = top;i>=0;i--){
			System.out.println(arrayToSTACK[i]);
		}
	}

	//判断是不是操作符
	public boolean isOper(char ch) {
		return ch=='+'||ch=='-'||ch=='*'||ch=='/';
	}

	public int priority(int ch) {
		if(ch == '*'||ch == '/'){
			return 1;
		}else if(ch == '-'|| ch == '='){
			return 0;
		}else {
			return -1;
		}

	}

	public int peek() {
		return arrayToSTACK[top];
	}

	public int cal(int num1, int num2, int oper) {
		int res = 0;
		switch (oper){
			case '+':
				res = num1 + num2;
				break;
			case '-':
				res = num2 - num1;
				break;
			case '*':
				res = num1*num2;
				break;
			case '/':
				res = num2/num1;
				break;
			default:
				break;
		}
		return  res;
	}
}
