package com.dsa.graphs;

import java.util.LinkedList;
import java.util.ListIterator;

public class BreadthFirstSearchGraph {
	private int vertices;
	private LinkedList<Integer> adjacencyList[];

	@SuppressWarnings("unchecked")
	public BreadthFirstSearchGraph(int vertices) {
		this.vertices = vertices;
		adjacencyList = new LinkedList[vertices];
		for (int i = 0; i < vertices; i++) {
			adjacencyList[i] = new LinkedList<Integer>();
		}
	}

	public void addEdge(int vertex, int weight) {
		adjacencyList[vertex].add(weight);
	}

	public void display(int vertex) {
		boolean visited[] = new boolean[vertices];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[vertex] = true;
		queue.add(vertex);
		while (!queue.isEmpty()) {
			vertex = queue.poll();
			System.out.print(vertex + " ");
			ListIterator<Integer> listIterator = adjacencyList[vertex].listIterator();
			while (listIterator.hasNext()) {
				int number = listIterator.next();
				if (!visited[number]) {
					visited[number] = true;
					queue.add(number);
				}
			}
		}
	}

}
