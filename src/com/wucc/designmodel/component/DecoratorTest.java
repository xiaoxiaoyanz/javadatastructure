package com.wucc.designmodel.component;

public class DecoratorTest {
	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.common();
		ConcreteDecorator concreteDecorator = new ConcreteDecorator(dog);
		concreteDecorator = new ConcreteDecorator(concreteDecorator);
		concreteDecorator.common();
	}

}
