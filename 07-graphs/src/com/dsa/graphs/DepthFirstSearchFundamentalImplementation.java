package com.dsa.graphs;

public class DepthFirstSearchFundamentalImplementation {

	public static void main(String[] args) {
		DepthFirstSearchGraph depthFirstSearchGraph = new DepthFirstSearchGraph(5);
		depthFirstSearchGraph.addEdge(0, 1);
		depthFirstSearchGraph.addEdge(0, 2);
		depthFirstSearchGraph.addEdge(1, 3);
		depthFirstSearchGraph.addEdge(2, 4);

		depthFirstSearchGraph.display(0);
	}

}
