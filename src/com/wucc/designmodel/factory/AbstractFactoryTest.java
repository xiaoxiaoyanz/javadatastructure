package com.wucc.designmodel.factory;

public class AbstractFactoryTest {
	
	public static void main(String[] args) {
		AbstractFactory a;
		a = new Factory1();
		AbstractProduct product1 = a.newProduct();
		product1.show();
		
		a = new Factory2();
		AbstractProduct product2 = a.newProduct();
		product2.show();
	}

}
