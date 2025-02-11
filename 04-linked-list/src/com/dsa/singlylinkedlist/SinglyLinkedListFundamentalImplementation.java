package com.dsa.singlylinkedlist;

public class SinglyLinkedListFundamentalImplementation {

	private Node head;

	private static class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void insertAtBeginning(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
	}

	public void insertAtEnd(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = node;
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
			current.next = node;
		}
	}

	public void deleteAtBeginning() {
		if (head == null) {
			throw new RuntimeException("LinkedList is empty");
		}
		head = head.next;
	}

	public void deleteAtEnd() {
		if (head == null) {
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
		} else if (index == getSize() - 1) {
			deleteAtEnd();
		} else {
			Node current = head;
			for (int i = 0; i < index - 1; i++) {
				current = current.next;
			}
			current.next = current.next.next;
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

	public void display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
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
		SinglyLinkedListFundamentalImplementation singlyLinkedListFundamentalImplementation = new SinglyLinkedListFundamentalImplementation();
		
		//singlyLinkedListFundamentalImplementation.insertAtBeginning(55);
		singlyLinkedListFundamentalImplementation.insertAtEnd(10);
		singlyLinkedListFundamentalImplementation.insertAtEnd(20);
		singlyLinkedListFundamentalImplementation.insertAtEnd(30);
		singlyLinkedListFundamentalImplementation.insertAtEnd(40);
		singlyLinkedListFundamentalImplementation.display();
		singlyLinkedListFundamentalImplementation.insertAtBeginning(55);
		singlyLinkedListFundamentalImplementation.display();
		singlyLinkedListFundamentalImplementation.insertAtIndex(4, 88);
		singlyLinkedListFundamentalImplementation.display();
		singlyLinkedListFundamentalImplementation.deleteAtBeginning();
		singlyLinkedListFundamentalImplementation.display();
		singlyLinkedListFundamentalImplementation.deleteAtEnd();
		singlyLinkedListFundamentalImplementation.display();
		singlyLinkedListFundamentalImplementation.deleteAtIndex(2);
		singlyLinkedListFundamentalImplementation.display();
		singlyLinkedListFundamentalImplementation.reverseLinkedList();
		System.out.println("After reversing : ");
		singlyLinkedListFundamentalImplementation.display();
	}

}
