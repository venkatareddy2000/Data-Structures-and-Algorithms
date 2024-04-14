package com.dsa.stack;

import java.util.Stack;

public class StackClassImplementation {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println("Pushed element : " + stack.add(100));
		System.out.println("Pushed element : " + stack.add(200));
		System.out.println("Pushed element : " + stack.add(300));
		
		System.out.println("Stack elements : " + stack);
		
		System.out.println("Popped element : " + stack.pop());
		
		System.out.println("Is stack empty : " + stack.empty());
		
		System.out.println("Peeked element : " + stack.peek());
	}

}
