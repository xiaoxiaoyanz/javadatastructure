package com.wucc.designmodel.component;

public  class Decorator implements Animal {
	
	private Animal animal;
	
	public Decorator(Animal animal){
		this.animal = animal;
	}

	@Override
	public void common() {
		animal.common();
	}
	
	

}
