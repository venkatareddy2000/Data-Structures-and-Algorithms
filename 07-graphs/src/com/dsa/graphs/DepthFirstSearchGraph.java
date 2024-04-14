package com.dsa.graphs;

import java.util.LinkedList;
import java.util.ListIterator;

public class DepthFirstSearchGraph {
	private int vertices;
	private LinkedList<Integer> adjacencyList[];

	@SuppressWarnings("unchecked")
	public DepthFirstSearchGraph(int vertices) {
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
		boolean[] visited = new boolean[vertices];
		display(vertex, visited);
	}

	private void display(int vertex, boolean[] visited) {
		visited[vertex] = true;
		System.out.print(vertex + " ");

		ListIterator<Integer> listIterator = adjacencyList[vertex].listIterator();
		while (listIterator.hasNext()) {
			int adjacentVertex = listIterator.next();
			if (!visited[adjacentVertex]) {
				display(adjacentVertex, visited);
			}
		}
	}
}