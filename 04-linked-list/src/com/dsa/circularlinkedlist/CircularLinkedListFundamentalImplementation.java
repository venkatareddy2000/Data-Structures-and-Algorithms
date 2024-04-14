package com.dsa.circularlinkedlist;

public class CircularLinkedListFundamentalImplementation {

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
		if (isEmpty()) {
			head = node;
			head.next = head;
		} else {
			node.next = head;
			Node temp = head;
			while (temp.next != head) {
				temp = temp.next;
			}
			temp.next = node;
			head = node;
		}
	}

	public void insertAtEnd(int data) {
		Node node = new Node(data);
		if (isEmpty()) {
			head = node;
			head.next = head;
		} else {
			Node temp = head;
			while (temp.next != head) {
				temp = temp.next;
			}
			temp.next = node;
			node.next = head;
		}
	}

	public void insertAtIndex(int index, int data) {
		Node node = new Node(data);
		if (index < 0 || index > getSize()) {
			throw new IndexOutOfBoundsException("Invalid index");
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
			temp.next = node;

		}
	}

	public void deleteAtBeginning() {
		if (isEmpty()) {
			System.out.println("Linked List is empty");
		}
		if (head.next == head) {
			head = null;
		} else {
			Node temp = head;
			while (temp.next != head) {
				temp = temp.next;
			}
			temp.next = head.next;
			head = head.next;
		}
	}

	public void deleteAtEnd() {
		if (isEmpty()) {
			System.out.println("Linked List is empty");
		}
		if (head.next == head) {
			head = null;
		} else {
			Node temp = head;
			while (temp.next.next != head) {
				temp = temp.next;
			}
			temp.next = head;
		}
	}

	public void deleteAtIndex(int index) {
		if (index < 0 || index > getSize()) {
			throw new IndexOutOfBoundsException("Invalid index");
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
		}
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int getSize() {
		int count = 0;
		if (isEmpty()) {
			return count;
		} else {
			Node temp = head;
			do {
				count++;
				temp = temp.next;
			} while (temp != head);
		}
		return count;
	}

	public void display() {
		if (head == null) {
			System.out.println("Linked List is empty");
		}
		Node temp = head;
		do {
			System.out.print(temp.data + " ");
			temp = temp.next;
		} while (temp != head);
		System.out.println();

	}

	public static void main(String[] args) {
		CircularLinkedListFundamentalImplementation circularLinkedListFundamentalImplementation = new CircularLinkedListFundamentalImplementation();
		circularLinkedListFundamentalImplementation.insertAtBeginning(10);
		circularLinkedListFundamentalImplementation.insertAtBeginning(20);
		circularLinkedListFundamentalImplementation.insertAtEnd(30);
		circularLinkedListFundamentalImplementation.insertAtEnd(40);
		circularLinkedListFundamentalImplementation.insertAtIndex(2, 20);
		circularLinkedListFundamentalImplementation.display();
		circularLinkedListFundamentalImplementation.deleteAtBeginning();
		circularLinkedListFundamentalImplementation.display();
		circularLinkedListFundamentalImplementation.deleteAtEnd();
		circularLinkedListFundamentalImplementation.display();
		circularLinkedListFundamentalImplementation.deleteAtIndex(1);
		circularLinkedListFundamentalImplementation.display();
		int size = circularLinkedListFundamentalImplementation.getSize();
		System.out.println("Size of the linked list : " + size);

	}

}
