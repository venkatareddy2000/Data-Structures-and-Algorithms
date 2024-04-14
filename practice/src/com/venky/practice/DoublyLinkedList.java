package com.venky.practice;

public class DoublyLinkedList {
	private Node head;

	private static class Node {
		private int data;
		private Node next;
		private Node previous;

		public Node(int data) {
			this.data = data;
			this.next = null;
			this.previous = null;
		}
	}

	public void insertAtBeginning(int data) {
		Node node = new Node(data);
		if (isEmpty()) {
			head = node;
		} else {
			head.previous = node;
			node.next = head;
			head = node;
		}

	}

	public void insertAtEnd(int data) {
		Node node = new Node(data);
		if (isEmpty()) {
			head = node;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = node;
			node.previous = current;
		}
	}

	public void insertAtIndex(int index, int data) {
		if (index < 0 || index > getSize()) {
			throw new IndexOutOfBoundsException("Invalid index");
		}

		if (index == 0) {
			insertAtBeginning(data);
		} else if (index == getSize()) {
			insertAtEnd(data);
		} else {
			Node node = new Node(data);
			Node current = head;
			for (int i = 0; i < index - 1; i++) {
				current = current.next;
			}
			node.next = current.next;
			node.previous = current;
			current.next.previous = node;
			current.next = node;
		}
	}

	public void deleteAtBeginning() {
		if (isEmpty()) {
			throw new RuntimeException("LinkedList is empty");
		} else if (head.next == null) {
			head = null;
		} else {
			head = head.next;
		}
	}

	public void deleteAtEnd() {
		if (isEmpty()) {
			throw new RuntimeException("LinkedList is empty");
		} else if (head.next == null) { // single node
			head = null;
		} else {
			Node current = head;
			while (current.next.next != null) {
				current = current.next;
			}
			current.next = null;
		}
	}

	public void deleteAtIndex(int index) {
		if (index < 0 || index > getSize()) {
			throw new IndexOutOfBoundsException("invalid index");
		}

		if (index == 0) {
			deleteAtBeginning();
		} else if (index == getSize()) {
			deleteAtEnd();
		} else {
			Node current = head;
			for (int i = 0; i < index - 1; i++) {
				current = current.next;
			}
			current.next = current.next.next;
			if (current.next != null) {
				current.next.previous = current;
			}
		}
	}

	public void reverseLinkedList() {
		Node temp = head;
		Node next = null;
		Node previous = null;
		while (temp != null) {
			next = temp.next;
			temp.next = previous;
			previous = temp;
			temp = next;
		}
		head = previous;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void displayForward() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public void displayBackward() {
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.previous;
		}
		System.out.println();
	}

	private int getSize() {
		int count = 0;
		Node current = head;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	public static void main(String[] args) {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.insertAtBeginning(10);
		doublyLinkedList.insertAtEnd(20);
		doublyLinkedList.displayForward();
		doublyLinkedList.insertAtIndex(1, 15);
		doublyLinkedList.displayForward();
		doublyLinkedList.displayBackward();
		doublyLinkedList.deleteAtBeginning();
		doublyLinkedList.deleteAtEnd();
		doublyLinkedList.displayForward();

	}

}
