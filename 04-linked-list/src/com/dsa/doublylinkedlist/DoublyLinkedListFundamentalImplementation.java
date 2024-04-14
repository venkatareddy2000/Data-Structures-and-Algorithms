package com.dsa.doublylinkedlist;

public class DoublyLinkedListFundamentalImplementation {

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
			node.next = head;
			head.previous = node;
			head = node;
		}
	}

	public void insertAtEnd(int data) {
		Node node = new Node(data);
		if (isEmpty()) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
			node.previous = temp;
		}
	}

	public void insertAtIndex(int index, int data) {
		Node node = new Node(data);
		if (index < 0 || index > getSize() - 1) {
			throw new RuntimeException("Invalid index");
		}
		if (index == 0) {
			insertAtBeginning(data);
		} else if (index == getSize() - 1) {
			insertAtEnd(data);
		} else {
			Node temp = head;
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;
			}
			node.next = temp.next;
			node.previous = temp;
			temp.next.previous = node;
			temp.next = node;
		}
	}

	public void deleteAtBeginning() {
		if (isEmpty()) {
			System.out.println("Linked list is empty");
		}
		if (head.next == null) {
			head = null;
		} else {
			head = head.next;
		}
	}

	public void deleteAtEnd() {
		if (isEmpty()) {
			System.out.println("Linked list is empty");
		}
		if (head.next == null) {
			head = null;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.previous.next = null;
		}
	}

	public void deleteAtIndex(int index) {
		if (index < 0 || index > getSize() - 1) {
			throw new RuntimeException("Invalid index");
		}
		if (index == 0) {
			deleteAtBeginning();
		} else if (index == getSize() - 1) {
			deleteAtEnd();
		} else {
			Node temp = head;
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
			if (temp.next != null) {
				temp.next.previous = temp;
			}
		}
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int getSize() {
		int count = 0;
		Node temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public void displayForward() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public void displayBackward() {
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.previous;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		DoublyLinkedListFundamentalImplementation doublyLinkedListFundamentalImplementation = new DoublyLinkedListFundamentalImplementation();
		doublyLinkedListFundamentalImplementation.insertAtBeginning(10);
		doublyLinkedListFundamentalImplementation.insertAtBeginning(20);
		doublyLinkedListFundamentalImplementation.insertAtBeginning(30);
		doublyLinkedListFundamentalImplementation.insertAtBeginning(40);
		doublyLinkedListFundamentalImplementation.insertAtEnd(50);
		doublyLinkedListFundamentalImplementation.insertAtIndex(3, 100);
		doublyLinkedListFundamentalImplementation.displayBackward();
		doublyLinkedListFundamentalImplementation.deleteAtBeginning();
		doublyLinkedListFundamentalImplementation.deleteAtEnd();
		doublyLinkedListFundamentalImplementation.deleteAtIndex(2);
		doublyLinkedListFundamentalImplementation.deleteAtIndex(2);
		doublyLinkedListFundamentalImplementation.deleteAtIndex(1);
		doublyLinkedListFundamentalImplementation.displayForward();
		int size = doublyLinkedListFundamentalImplementation.getSize();
		System.out.println("Linked List size : " + size);
	}

}
