package com.dsa.hashing;

import java.util.*;

public class HashMapClassImplementation {

	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("A", 1);
		hashMap.put("B", 2);
		hashMap.put("C", 3);
		hashMap.put("D", 4);
		hashMap.put("E", 5);
		System.out.println(hashMap);
		System.out.println(hashMap.get("A"));
		System.out.println(hashMap.containsKey("D"));
		System.out.println(hashMap.remove("D"));
		System.out.println(hashMap);
	}

}
