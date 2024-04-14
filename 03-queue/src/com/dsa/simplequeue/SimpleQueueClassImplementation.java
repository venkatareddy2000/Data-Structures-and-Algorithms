package com.dsa.simplequeue;

import java.util.*;

public class SimpleQueueClassImplementation {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(100);
		queue.add(200);
		queue.add(300);
		System.out.println("Queue elements : " + queue);
		System.out.println("Peek element : " + queue.peek());
		System.out.println("Dequeue elements : " + queue.remove());
		System.out.println("Queue elements : " + queue);
		System.out.println("Queue size : " + queue.size());
		System.out.println("Is queue empty : " + queue.isEmpty());
	}

}
