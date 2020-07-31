package com.wucc.jvm;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-06-23 16:54
 */
public class TestNewClasss {
	public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
		PcRegister pcRegister = PcRegister.class.newInstance();
		Constructor<PcRegister> declaredConstructor = PcRegister.class.getDeclaredConstructor();
		PcRegister pcRegister1 = declaredConstructor.newInstance();
	}
}
