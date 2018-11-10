import java.util.Scanner;
public class Solution {
	private Solution() {

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nvcities = Integer.parseInt(sc.nextLine());
		int veroads = Integer.parseInt(sc.nextLine());
		EdgeWeightedGraph graph = new EdgeWeightedGraph(nvcities);
		for (int i = 0;i < nvcities;i++) {
			String[]contains = sc.nextLine().split(" ");
			graph.addEdge(new Edge(Integer.parseInt(contains[0]),
				Integer.parseInt(contains[1]),Integer.parseInt(contains[2])));
        }
        System.out.println(graph);
		// Parallel Edges are allowed...
		// Take the Graph input here...
		// switch (caseToGo) {
		// case "Graph":
		// 	//Print the Graph Object.
		// 	break;

		// case "DirectedPaths":
		// 	// Handle the case of DirectedPaths, where two integers are given.
		// 	// First is the source and second is the destination.
		// 	// If the path exists print the distance between them.
		// 	// Other wise print "No Path Found."
		// 	break;

		// case "ViaPaths":
		// 	// Handle the case of ViaPaths, where three integers are given.
		// 	// First is the source and second is the via is the one where path should pass throuh.
		// 	// third is the destination.
		// 	// If the path exists print the distance between them.
		// 	// Other wise print "No Path Found."
		// 	break;

		// default:
		// 	break;
		// }

	}
}