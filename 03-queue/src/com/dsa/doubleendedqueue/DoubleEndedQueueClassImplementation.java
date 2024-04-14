package com.dsa.doubleendedqueue;

import java.util.Deque;
import java.util.LinkedList;

public class DoubleEndedQueueClassImplementation {

	public static void main(String[] args) {
		Deque<Integer> deque = new LinkedList<Integer>();
		deque.addFirst(5);
		deque.addFirst(10);
		deque.addFirst(15);
		System.out.println(deque);
		System.out.println("Dequed from front : " + deque.pollFirst());
		System.out.println(deque);
		deque.addLast(15);
		deque.addLast(20);
		System.out.println(deque);
		System.out.println("Dequed from rear : " + deque.pollLast());
		System.out.println(deque);
		System.out.println(deque.isEmpty());
		System.out.println("peek from front : " + deque.peekFirst());
		System.out.println("peek from last : " + deque.peekLast());
	}

}
