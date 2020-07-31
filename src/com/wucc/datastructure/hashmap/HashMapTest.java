package com.wucc.datastructure.hashmap;

import java.util.*;

public class HashMapTest {
	public static void main(String[] args) {
		/*HashMap<String,String> map = new HashMap<>();
		Map<String, String> stringStringMap = Collections.synchronizedMap(new HashMap<String, String>());
		stringStringMap.put(null,null);
		stringStringMap.put(null,null);
		Hashtable<String,String>  hashTable = new Hashtable<>();
		hashTable.put("k1","v1");*/

		List<String> ls = new ArrayList<>();
		ls.add("cc");
		ls.add("haha");
		ls.add("dede");
		ls.add("mm");
		ls.add("cc");
		System.out.println(ls);
		Iterator<String> iterator = ls.iterator();
		while (iterator.hasNext()){
			if(iterator.next().equals("cc")){
				iterator.remove();
			}
		}
		System.out.println(ls);

		String  str = "abcdefg";
		int c = str.indexOf("c");
		System.out.println(c);
		String substring = str.substring(c+1);
		System.out.println(substring);
	}
}
