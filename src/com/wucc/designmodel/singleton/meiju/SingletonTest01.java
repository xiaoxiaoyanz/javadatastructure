package com.wucc.designmodel.singleton.meiju;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTest01 {
	
	 public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
	        Class objectClass = EnumInstance.class;
	        Constructor constructor = objectClass.getDeclaredConstructor(String.class,int.class);
	        constructor.setAccessible(true);
	        EnumInstance instance = (EnumInstance) constructor.newInstance("redstar",666);
	 }

}
