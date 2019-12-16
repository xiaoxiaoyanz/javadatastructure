package com.wucc.designmodel.component;

public class ConcreteDecorator extends Decorator{

	public ConcreteDecorator(Animal animal) {
		super(animal);
	}
	
	public void common() {
		super.common();
		System.out.println("���ӹ���:");
		this.run();
	}
	
	public void run() {
		System.out.println("������");
	}

}
