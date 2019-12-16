package com.wucc.designmodel.factory;

public class Factory1 implements AbstractFactory {

	@Override
	public AbstractProduct newProduct() {
		
		System.out.println("factory1 ���� product1");
		return new Product1();
	}

}
