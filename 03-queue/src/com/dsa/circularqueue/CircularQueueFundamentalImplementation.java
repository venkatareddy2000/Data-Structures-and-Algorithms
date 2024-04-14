package com.dsa.circularqueue;

public class CircularQueueFundamentalImplementation {

	private int maxSize;
	private int front;
	private int rear;
	private int[] array;
	private int currentSize;

	public CircularQueueFundamentalImplementation(int size) {
		maxSize = size;
		front = -1;
		rear = -1;
		array = new int[maxSize];
		currentSize = 0;
	}

	public boolean isEmpty() {
		return front == rear;
	}

	public boolean isFull() {
		return (rear + 1) % maxSize == front;
	}

	public int enqueue(int value) {
		if (isFull()) {
			System.out.println("Queue is full, you cannot enqueue value : " + value);
			return -1;
		}
		if (isEmpty()) {
			front = 0;
		}
		rear = (rear + 1) % maxSize;
		array[rear] = value;
		currentSize++;
		System.out.println("Enqueued element is : " + value);
		return value;
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty, you cannot dequeue the element");
			return -1;
		}
		int value = array[front];
		front = (front + 1) % maxSize;
		currentSize--;
		System.out.println("Dequeued element : " + value);
		return value;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Queue is empty, you cannot peek the element ");
			return -1;
		} else {
			System.out.println("Peeked element : " + array[front]);
			return array[front];
		}
	}

	public int size() {
		System.out.println("Queue size : " + currentSize);
		return currentSize;
	}

	public void display() {
		int count = 0;
		int index = (front) % maxSize;
		while (count < currentSize) {
			System.out.print(array[index] + " ");
			index = (index + 1) % maxSize;
			count++;
		}
		System.out.println(" ");
	}

	public static void main(String[] args) {
		CircularQueueFundamentalImplementation circularQueueFundamentalImplementation = new CircularQueueFundamentalImplementation(
				5);
		circularQueueFundamentalImplementation.enqueue(100);
		circularQueueFundamentalImplementation.enqueue(200);
		circularQueueFundamentalImplementation.enqueue(300);
		circularQueueFundamentalImplementation.enqueue(400);
		circularQueueFundamentalImplementation.enqueue(500);
		circularQueueFundamentalImplementation.display();
		circularQueueFundamentalImplementation.peek();
		circularQueueFundamentalImplementation.size();
		circularQueueFundamentalImplementation.dequeue();
		circularQueueFundamentalImplementation.enqueue(600);
		circularQueueFundamentalImplementation.display();

	}

}
