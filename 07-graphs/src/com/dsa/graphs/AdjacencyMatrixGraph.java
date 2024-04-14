package com.dsa.graphs;

import java.util.LinkedList;

public class AdjacencyMatrixGraph {
	private int vertices;
	private boolean adjacencyList[][];

	public AdjacencyMatrixGraph(int vertices) {
		this.vertices = vertices;
		adjacencyList = new boolean[vertices][vertices];
	}

	public void addEdge(int vertex, int weight) {
		adjacencyList[vertex][weight] = true;
	}

	public void display(int vertex) {
		boolean visited[] = new boolean[vertices];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[vertex] = true;
		queue.add(vertex);
		while (!queue.isEmpty()) {
			vertex = queue.poll();
			System.out.print(vertex + " ");
			for (int neighbor = 0; neighbor < vertices; neighbor++) {
				if (adjacencyList[vertex][neighbor] && !visited[neighbor]) {
					visited[neighbor] = true;
					queue.add(neighbor);
				}
			}
		}
	}

}
