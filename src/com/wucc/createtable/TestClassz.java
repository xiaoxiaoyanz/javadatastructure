package com.wucc.createtable;

import com.wucc.createtable.easycode.entity.ApslSysMetadata;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-06-16 10:29
 */
public class TestClassz {
	public static void main(String[] args) {
		Field[] declaredFields = ApslSysMetadata.class.getClass().getDeclaredFields();
		/*for (Field declaredField : declaredFields) {
			System.out.println(declaredField);
		}*/
		Arrays.stream(declaredFields).map(x->{
			x.setAccessible(true);
			return x.getName();
		}).forEach(System.out::println);

	}
}
