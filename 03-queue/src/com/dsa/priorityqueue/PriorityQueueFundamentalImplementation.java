package com.dsa.priorityqueue;

import java.util.*;

public class PriorityQueueFundamentalImplementation {

	private void push(ArrayList<Integer> arrayList, int value) {
		int size = arrayList.size();
		if (size == 0) {
			arrayList.add(value);
		} else {
			arrayList.add(value);
			for (int i = size / 2 - 1; i >= 0; i--) {
				heapify(arrayList, i);
			}
		}
	}

	private void pop(ArrayList<Integer> arrayList, int value) {
		int size = arrayList.size();
		int index;
		for (index = 0; index < size; index++) {
			if (value == arrayList.get(index)) {
				break;
			}
		}
		int temp = arrayList.get(index);
		arrayList.set(index, arrayList.get(size - 1));
		arrayList.set(size - 1, temp);
		arrayList.remove(size - 1);
		for (int i = size / 2 - 1; i >= 0; i--) {
			heapify(arrayList, i);
		}
	}

	private int peek(ArrayList<Integer> arrayList) {
		if (arrayList.size() == 0)
			return -1;
		return arrayList.get(0);

	}

	private void heapify(ArrayList<Integer> arrayList, int index) {
		int size = arrayList.size();
		int largest = index;
		int left = 2 * index + 1;
		int right = 2 * index + 2;
		if (left < size && arrayList.get(left) > arrayList.get(largest)) {
			largest = left;
		}
		if (right < size && arrayList.get(right) > arrayList.get(largest)) {
			largest = right;
		}
		if (largest != index) {
			int temp = arrayList.get(index);
			arrayList.set(index, arrayList.get(largest));
			arrayList.set(largest, temp);
			heapify(arrayList, largest);
		}
	}

	/*
	 * private void heapify(ArrayList<Integer> arrayList, int index) { int size =
	 * arrayList.size(); int smallest = index; int left = 2 * index + 1; int right =
	 * 2 * index + 2; if (left < size && arrayList.get(left) <
	 * arrayList.get(smallest)) { smallest = left; } if (right < size &&
	 * arrayList.get(right) < arrayList.get(smallest)) { smallest = right; } if
	 * (smallest != index) { int temp = arrayList.get(index); arrayList.set(index,
	 * arrayList.get(smallest)); arrayList.set(smallest, temp); heapify(arrayList,
	 * smallest); } }
	 */

	public static void main(String[] args) {
		PriorityQueueFundamentalImplementation priorityQueueFundamentalImplementation = new PriorityQueueFundamentalImplementation();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		priorityQueueFundamentalImplementation.push(arrayList, 13);
		priorityQueueFundamentalImplementation.push(arrayList, 14);
		priorityQueueFundamentalImplementation.push(arrayList, 12);
		priorityQueueFundamentalImplementation.push(arrayList, 11);
		priorityQueueFundamentalImplementation.push(arrayList, 19);
		System.out.println(arrayList);
		priorityQueueFundamentalImplementation.pop(arrayList, 19);
		System.out.println(arrayList);
		int priorityElement = priorityQueueFundamentalImplementation.peek(arrayList);
		System.out.println("The priority element is : " + priorityElement);
	}

}
