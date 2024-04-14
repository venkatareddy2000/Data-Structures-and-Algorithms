package com.dsa.circularlinkedlist;

import java.util.*;

public class CircularLinkedListClassImplementation {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.add(50);
		Collections.reverse(linkedList);
		System.out.println(linkedList);
		linkedList.addFirst(linkedList.removeLast());
		Iterator<Integer> iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}

}
