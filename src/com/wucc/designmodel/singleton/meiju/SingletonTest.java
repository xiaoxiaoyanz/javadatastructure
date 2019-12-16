package com.wucc.designmodel.singleton.meiju;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;

public class SingletonTest {
	
	 public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
		    
		    EnumInstance instance = EnumInstance.getInstance();
		        instance.setData(new Object());

		        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
		        oos.writeObject(instance);

		        File file = new File("singleton_file");
		        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		        EnumInstance newInstance = (EnumInstance) ois.readObject();
		        
		        
		        
		        System.out.println(instance.getData());
		        System.out.println(newInstance.getData());
		        System.out.println(instance.getData() == newInstance.getData());
	 }

}
