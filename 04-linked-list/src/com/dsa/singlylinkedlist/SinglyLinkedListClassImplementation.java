package com.dsa.singlylinkedlist;

import java.util.*;

public class SinglyLinkedListClassImplementation {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(20);
		linkedList.addFirst(10);
		linkedList.add(2, 30);
		linkedList.addLast(40);
		linkedList.add(50);
		linkedList.add(60);
		linkedList.add(70);
		System.out.println(linkedList);
		Collections.reverse(linkedList);
		System.out.println(linkedList);
		linkedList.removeFirst();
		linkedList.removeLast();
		linkedList.remove(2);
		System.out.println(linkedList);
		System.out.println("Last element : " + linkedList.getLast());
		System.out.println("First element : " + linkedList.getFirst());
		System.out.println("Element at index 2  : " + linkedList.get(2));
	}

}
