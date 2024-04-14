package com.dsa.circularqueue;

import java.util.*;

public class CircularQueueClassImplementation {

	private int size;
	private Queue<Integer> queue;

	public CircularQueueClassImplementation(int size) {
		this.size = size;
		queue = new LinkedList<Integer>();
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}

	public boolean isFull() {
		return queue.size() == size;
	}

	public int enqueue(int value) {
		if (isFull()) {
			System.out.println("Queue is full, you cannot enqueue value : " + value);
			return -1;
		}
		queue.add(value);
		System.out.println("Enqueued element : " + value);
		return value;
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty, you cannot dequeue value ");
		}
		int removedValue = queue.poll();
		System.out.println("Dequeued element : " + removedValue);
		return removedValue;
	}

	public int peek() {
		System.out.println("Peeked element : " + queue.peek());
		return queue.peek();
	}

	public int size() {
		System.out.println("Queue size : " + queue.size());
		return queue.size();
	}

	public void display() {
		System.out.print("Queue elements : ");
		for (int element : queue) {
			System.out.print(element+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		CircularQueueClassImplementation circularQueueClassImplementation = new CircularQueueClassImplementation(5);
		circularQueueClassImplementation.enqueue(100);
		circularQueueClassImplementation.enqueue(200);
		circularQueueClassImplementation.enqueue(300);
		circularQueueClassImplementation.enqueue(400);
		circularQueueClassImplementation.enqueue(500);
		circularQueueClassImplementation.enqueue(600);
		circularQueueClassImplementation.display();
		circularQueueClassImplementation.size();
		circularQueueClassImplementation.peek();
		circularQueueClassImplementation.dequeue();
		circularQueueClassImplementation.display();
		circularQueueClassImplementation.enqueue(600);
		circularQueueClassImplementation.display();
	}

}
