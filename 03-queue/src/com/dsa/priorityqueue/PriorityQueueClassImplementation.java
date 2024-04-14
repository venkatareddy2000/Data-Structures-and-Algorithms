package com.dsa.priorityqueue;

import java.util.*;

public class PriorityQueueClassImplementation {

	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
		priorityQueue.add(10);
		priorityQueue.offer(9);
		priorityQueue.add(7);
		Iterator<Integer> iterator = priorityQueue.iterator();
		while (iterator.hasNext()) {
			System.out.print(priorityQueue.poll() + " ");
		}
	}

}
