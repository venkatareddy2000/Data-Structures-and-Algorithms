package com.dsa.hashing;

public class HashMapFundamentalImplementation {

	private Entry[] table;
	private int capacity;

	public class Entry {
		private String key;
		private int value;
		private Entry next;

		public Entry(String key, int value) {
			this.key = key;
			this.value = value;
			this.next = null;
		}
	}

	public HashMapFundamentalImplementation(int capacity) {
		this.capacity = capacity;
		this.table = new Entry[capacity];
	}

	private int hash(String key) {
		int hashCode = key.hashCode();
		return Math.abs(hashCode) % capacity;
	}

	public void put(String key, int value) {
		int index = hash(key);
		Entry entry = table[index];
		while (entry != null) {
			if (entry.key.equals(key)) {
				entry.value = value;
				return;
			}
			entry = entry.next;
		}
		Entry newEntry = new Entry(key, value);
		newEntry.next = table[index];
		table[index] = newEntry;
	}

	public int get(String key) {
		int index = hash(key);
		Entry entry = table[index];
		while (entry != null) {
			if (entry.key.equals(key)) {
				return entry.value;
			}
			entry = entry.next;
		}
		return -1;
	}

	public void remove(String key) {
		int index = hash(key);
		Entry entry = table[index];
		Entry previous = null;
		while (entry != null) {
			if (entry.key.equals(key)) {
				if (previous == null) {
					table[index] = entry.next;
				} else {
					previous.next = entry.next;
				}
			}
			previous = entry;
			entry = entry.next;
		}
	}

	public boolean containsKey(String key) {
		int index = hash(key);
		Entry entry = table[index];
		while (entry != null) {
			if (entry.key.equals(key)) {
				return true;
			}
			entry = entry.next;
		}
		return false;
	}

	public void display() {
		for (int index = 0; index < capacity; index++) {
			Entry entry = table[index];
			while (entry != null) {
				System.out.println("Key : " + entry.key + ", Value : " + entry.value);
				entry = entry.next;
			}
		}
	}

	public static void main(String[] args) {
		HashMapFundamentalImplementation hashMapFundamentalImplementation = new HashMapFundamentalImplementation(10);
		hashMapFundamentalImplementation.put("A", 1);
		hashMapFundamentalImplementation.put("B", 2);
		hashMapFundamentalImplementation.put("C", 3);
		hashMapFundamentalImplementation.put("D", 4);
		hashMapFundamentalImplementation.put("E", 5);
		hashMapFundamentalImplementation.display();
		System.out.println(hashMapFundamentalImplementation.get("A"));
		System.out.println(hashMapFundamentalImplementation.containsKey("E"));
		hashMapFundamentalImplementation.remove("C");
		hashMapFundamentalImplementation.display();
	}

}
