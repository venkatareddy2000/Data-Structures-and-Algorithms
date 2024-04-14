package com.dsa.graphs;

public class BreadthFirstSearchFundamentalImplementation {

	public static void main(String[] args) {
		// BreadthFirstSearchGraph breadthFirstSearchGraph = new
		// BreadthFirstSearchGraph(5);
		AdjacencyMatrixGraph breadthFirstSearchGraph = new AdjacencyMatrixGraph(4);
		breadthFirstSearchGraph.addEdge(0, 1);
		breadthFirstSearchGraph.addEdge(0, 2);
		breadthFirstSearchGraph.addEdge(0, 3);
		breadthFirstSearchGraph.addEdge(1, 2);
		breadthFirstSearchGraph.addEdge(2, 1);

		breadthFirstSearchGraph.display(2);

	}

}
