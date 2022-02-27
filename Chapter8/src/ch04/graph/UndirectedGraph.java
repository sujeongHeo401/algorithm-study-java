package ch04.graph;

public class UndirectedGraph {
	private int count; // 노드 몇 개?
	private int[][] vertexMatrix;
	
	public UndirectedGraph(int count) {
		this.count = count;
		vertexMatrix = new int[count][count];
	}
	
	public void addEdges(int from, int to, int weight) {
		vertexMatrix[from][to] = weight;
		vertexMatrix[to][from] = weight;
	}

	public int[][] getMatrix(){
		return vertexMatrix;
	}
}
