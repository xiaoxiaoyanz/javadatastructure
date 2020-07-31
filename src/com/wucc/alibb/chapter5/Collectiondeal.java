package com.wucc.alibb.chapter5;

import org.junit.Test;

import java.util.*;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-07-18 15:53
 */
public class Collectiondeal {
	@Test
	public  void test01(){
		List<String> list = new ArrayList<>(2);
		list.add("ccc");
		list.add("hhh");
		String[] strings = list.toArray(new String[0]);
		System.out.println(strings[0]);
	}

	@Test
	public  void test02(){
		Map<String,String> map = new HashMap<>();
        map.put("ccc","hhh");
		for(String key: map.keySet()){
			System.out.println(map.get(key));
			map.remove(key);
		}
		Set<String> strings = map.keySet();
		strings.add("haha");
		System.out.println(map.toString());
	}
	@Test
	public  void test03(){
		List<String> list = new ArrayList<>(2);
		list.add("ccc");
		list.add("hhh");
		list.add("fff");
		list.add("ggg");
		list.add("ooo");
		List<String> subList = list.subList(2, list.size());
		/*java.util.ConcurrentModificationException
		list.add("lll");
		for (String s : subList) {
			System.out.println(s);
		}*/
		subList.add("kkk");
		System.out.println(list);
		System.out.println(subList);
	}
	@Test
	public  void test04(){
		List<String> list = new ArrayList<>();
		list.add("ccc");
		list.add("hhh");
		list.add("fff");
		list.add("ggg");
		list.add("ooo");
		for (String s : list) {
			if("ooo".equals(s)){
				list.remove(s);
			}
		}
		System.out.println(list);

	}
	@Test
	public  void test05(){
		List<String> list = new ArrayList<>();
		list.add("ccc");
		list.add("hhh");
		list.add("fff");
		list.add("ggg");
		list.add("ooo");

		System.out.println(list);
		Map<String,String> map = new HashMap<>(16);


	}

	@Test
	public  void test06(){
		Date date = new Date();
		System.out.println(date);

	}
}
