package com.dsa.simplequeue;

public class SimpleQueueFundamentalImplementation {

	private int size;
	private int front;
	private int rear;
	private int[] array;
	private int currentSize;

	public SimpleQueueFundamentalImplementation(int size) {
		this.size = size;
		array = new int[size];
		front = 0;
		rear = -1;
		currentSize = 0;
	}

	public boolean isEmpty() {
		return currentSize == 0;
	}

	public boolean isFull() {
		return currentSize == size;
	}

	public int enqueue(int value) {
		if (isFull()) {
			System.out.println("Queue is full, you cannot enqueue element : " + value);
			return -1;
		} else {
			rear++;
			array[rear] = value;
			currentSize++;
			System.out.println("Enqueued element : " + value);
		}
		return value;
	}

	public int dequeue() {
		int value = 0;
		if (isEmpty()) {
			System.out.println("Queue is empty, you cannot dequeue element");
		} else {
			value = array[front];
			front++;
			currentSize--;
			System.out.println("Dequeued element : " + value);
		}
		return value;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Queue is empty, cannot peek the element");
			return -1;
		} else {
			int value = array[front];
			System.out.println("Peeked element : " + value);
			return value;
		}
	}

	public void display() {
		if (currentSize == 0) {
			System.out.println("Queue is empty, cannot dispaly elements");
		} else {
			int count = 0;
			int index = front;
			while (count < currentSize) {
				System.out.print(array[index] + " ");
				count++;
				index++;
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		SimpleQueueFundamentalImplementation simpleQueueFundamentalImplementation = new SimpleQueueFundamentalImplementation(
				5);
		simpleQueueFundamentalImplementation.enqueue(100);
		simpleQueueFundamentalImplementation.enqueue(200);
		simpleQueueFundamentalImplementation.enqueue(300);
		simpleQueueFundamentalImplementation.enqueue(400);
		simpleQueueFundamentalImplementation.enqueue(500);
		simpleQueueFundamentalImplementation.enqueue(600);
		simpleQueueFundamentalImplementation.display();
		simpleQueueFundamentalImplementation.peek();
		simpleQueueFundamentalImplementation.dequeue();
		simpleQueueFundamentalImplementation.dequeue();
		simpleQueueFundamentalImplementation.dequeue();
		simpleQueueFundamentalImplementation.dequeue();
		simpleQueueFundamentalImplementation.dequeue();
		simpleQueueFundamentalImplementation.dequeue();
		simpleQueueFundamentalImplementation.display();

	}

}
