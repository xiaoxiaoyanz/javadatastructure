package com.wucc.designmodel.factory;

public class Factory2 implements AbstractFactory {

	@Override
	public AbstractProduct newProduct() {
		
		System.out.println("factory2 ���� product2");
		return new Product2();
	}

}
