package com.wucc.datastructure.hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		Map<String, String> stringStringMap = Collections.synchronizedMap(new HashMap<String, String>());
		stringStringMap.put(null,null);
		stringStringMap.put(null,null);
		Hashtable<String,String>  hashTable = new Hashtable<>();
		hashTable.put("k1","v1");

	}
}
