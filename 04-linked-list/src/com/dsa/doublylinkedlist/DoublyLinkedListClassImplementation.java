package com.dsa.doublylinkedlist;

import java.util.*;

public class DoublyLinkedListClassImplementation {

	public static void main(String[] args) {
		LinkedList<Integer> doublyLinkedList = new LinkedList<Integer>();
		doublyLinkedList.add(20);
		doublyLinkedList.add(30);
		doublyLinkedList.add(40);
		doublyLinkedList.addFirst(10);
		doublyLinkedList.addLast(50);
		doublyLinkedList.removeFirst();
		doublyLinkedList.removeLast();
		doublyLinkedList.remove(1);
		ListIterator<Integer> forwardIterator = doublyLinkedList.listIterator();
		while (forwardIterator.hasNext()) {
			System.out.print(forwardIterator.next() + " ");
		}
		System.out.println();
		ListIterator<Integer> backwardIterator = doublyLinkedList.listIterator(doublyLinkedList.size());
		while (backwardIterator.hasPrevious()) {
			System.out.print(backwardIterator.previous() + " ");
		}
		System.out.println();
	}

}
