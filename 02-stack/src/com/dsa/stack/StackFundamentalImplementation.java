package com.dsa.stack;

public class StackFundamentalImplementation {

	private int maxsize;
	private int top;
	private int[] array;

	public StackFundamentalImplementation(int maxSize) {
		this.maxsize = maxSize;
		top = -1;
		array = new int[maxSize];
	}

	public int push(int value) {
		if (isFull()) {
			System.out.println("Stack is full, you cannot push the element " + value);
		} else {
			top++;
			array[top] = value;
			System.out.println("Pushed element : " + value);
		}
		return value;
	}

	public int pop() {
		int value = 0;
		if (isEmpty()) {
			System.out.println("Stack is empty, you cannot pop the element");
		} else {
			value = array[top];
			top--;
			System.out.println("Popped element : " + value);
		}
		return value;
	}

	public int peek() {
		int value = 0;
		if (isEmpty()) {
			System.out.println("The stack is empty, cannot peek the element");
			return -1;
		} else {
			value = array[top];
			System.out.println("Peeked element : " + value);
		}
		return value;
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == maxsize - 1);
	}

	public void display() {
		if (top == -1) {
			System.out.println("The stack is empty, cannot display the elements");
		} else {

			for (int i = top; i >= 0; i--) {
				System.out.print(array[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		StackFundamentalImplementation stackFundamentalImplementation = new StackFundamentalImplementation(5);
		stackFundamentalImplementation.push(100);
		stackFundamentalImplementation.push(200);
		stackFundamentalImplementation.push(300);
		stackFundamentalImplementation.push(400);
		stackFundamentalImplementation.push(500);
		stackFundamentalImplementation.peek();
		stackFundamentalImplementation.push(600);
		stackFundamentalImplementation.pop();
		stackFundamentalImplementation.pop();
		stackFundamentalImplementation.pop();
		stackFundamentalImplementation.pop();
		stackFundamentalImplementation.pop();
		stackFundamentalImplementation.pop();
		stackFundamentalImplementation.peek();
		stackFundamentalImplementation.display();

	}

}
