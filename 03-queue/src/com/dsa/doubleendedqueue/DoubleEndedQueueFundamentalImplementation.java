package com.dsa.doubleendedqueue;

public class DoubleEndedQueueFundamentalImplementation {
	private int front;
	private int rear;
	private int capacity;
	private int[] array;
	private int size;

	public DoubleEndedQueueFundamentalImplementation(int capacity) {
		this.capacity = capacity;
		array = new int[capacity];
		front = -1;
		rear = -1;
		size = 0;
	}

	public boolean isFull() {
		return size == capacity;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void insertFront(int element) {
		if (isFull()) {
			System.out.println("Dequeue is full, you cannot insert the elements");
			return;
		}

		if (isEmpty()) {
			front = 0;
			rear = 0;
		} else if (front == 0) {
			front = capacity - 1;
		} else {
			front--;
		}
		array[front] = element;
		size++;
		System.out.println("Enqueued from front : " + element);
	}

	public void insertRear(int element) {
		if (isFull()) {
			System.out.println("Dequeue is full, you cannot insert the elements");
		}

		if (isEmpty()) {
			front = 0;
			rear = 0;
		} else if (rear == capacity - 1) {
			rear = 0;
		} else {
			rear++;
		}
		array[rear] = element;
		size++;
		System.out.println("Enqueued from rear : " + element);
	}

	public int deleteFront() {
		if (isEmpty()) {
			System.out.println("Dequeue is empty, you cannot delete the elements");
			return -1;
		}
		int element = array[front];
		if (front == rear) {
			front = -1;
			rear = -1;
		} else if (front == capacity - 1) {
			front = 0;
		} else {
			front++;
		}
		size--;
		System.out.println("Dequeued from front : " + element);
		return element;
	}

	public int deleteRear() {
		if (isEmpty()) {
			System.out.println("Dequeue is empty, you cannot delete the elements");
			return -1;
		}
		int element = array[rear];
		if (front == rear) {
			front = -1;
			rear = -1;
		} else if (rear == 0) {
			rear = capacity - 1;
		} else {
			rear--;
		}
		size--;
		System.out.println("Dequeued from rear : " + element);
		return element;
	}

	public int getFront() {
		if (isEmpty()) {
			System.out.println("Dequeue is empty, you cannot get the element");
			return -1;
		}
		System.out.println("Front element : " + array[front]);
		return array[front];
	}

	public int getRear() {
		if (isEmpty()) {
			System.out.println("Dequeue is empty, you cannot get the element");
			return -1;
		}
		System.out.println("Rear element : " + array[rear]);
		return array[rear];
	}

	public static void main(String[] args) {
		DoubleEndedQueueFundamentalImplementation doubleEndedQueueFundamentalImplementation = new DoubleEndedQueueFundamentalImplementation(
				5);
		doubleEndedQueueFundamentalImplementation.insertFront(5);
		doubleEndedQueueFundamentalImplementation.insertFront(10);
		doubleEndedQueueFundamentalImplementation.insertFront(15);
		doubleEndedQueueFundamentalImplementation.insertFront(20);
		doubleEndedQueueFundamentalImplementation.insertFront(25);
		doubleEndedQueueFundamentalImplementation.insertFront(30);
		doubleEndedQueueFundamentalImplementation.getFront();
		doubleEndedQueueFundamentalImplementation.getRear();
		doubleEndedQueueFundamentalImplementation.deleteFront();
		doubleEndedQueueFundamentalImplementation.deleteFront();
		doubleEndedQueueFundamentalImplementation.deleteFront();
		doubleEndedQueueFundamentalImplementation.deleteFront();
		doubleEndedQueueFundamentalImplementation.deleteFront();
		doubleEndedQueueFundamentalImplementation.deleteRear();

	}

}
