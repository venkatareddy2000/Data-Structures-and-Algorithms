package com.dsa.heap;

import java.util.*;

public class HeapFundamentalImplementation {

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
		HeapFundamentalImplementation heapFundamentalImplementation = new HeapFundamentalImplementation();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		heapFundamentalImplementation.push(arrayList, 13);
		heapFundamentalImplementation.push(arrayList, 14);
		heapFundamentalImplementation.push(arrayList, 12);
		heapFundamentalImplementation.push(arrayList, 11);
		heapFundamentalImplementation.push(arrayList, 19);
		System.out.println(arrayList);
		heapFundamentalImplementation.pop(arrayList, 19);
		System.out.println(arrayList);
	}

}
