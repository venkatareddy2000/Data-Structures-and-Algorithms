package com.dsa.arrays.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		System.out.println(arrayList);
		arrayList.set(1, 2000);
		System.out.println(arrayList);
		arrayList.remove(3);
		System.out.println(arrayList);
	}

}
