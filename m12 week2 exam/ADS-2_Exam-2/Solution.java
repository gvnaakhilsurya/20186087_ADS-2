import java.util.Scanner;
/**.
 *@author :gvnaakhilsurya.
 * Class for solution.
 */
public final class Solution {
	/**.
	 * Constructs the object.
	 */
	private Solution() {
		/**.
		 * private Counstructor.
		 */
	}
	/**.
	 * In the main method we are reading the input from the
	 * user input and split it into the tokens and then send
	 * as arguments to the various classes andd their objects.
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		// Self loops are not allowed...
		// Parallel Edges are allowed...
		// Take the Graph input here...
		Scanner sc = new Scanner(System.in);
		int nvcities = Integer.parseInt(sc.nextLine());
		int lines = Integer.parseInt(sc.nextLine());
		EdgeWeightedGraph graph = new EdgeWeightedGraph(nvcities);
		for(int i = 0; i < lines; i++) {
			String[] tokens = sc.nextLine().split(" ");
			graph.addEdge(new Edge(Integer.parseInt(tokens[0]),
				Integer.parseInt(tokens[1]),
				 Double.parseDouble(tokens[2])));
		}
		String caseToGo = sc.nextLine();
		// String[]tokens = sc.nextLine().split(" ");
		// DijkstraSP dsp = new DijkstraSP(graph);
		// for (int j = 0;j < tokens.length;j++) {
		// 	DijkstraSP dsp = new DijkstraSP(graph,Integer.parseInt(tokens[0]));
		// }
		switch (caseToGo) {
		case "Graph":
			//Print the Graph Object.
			System.out.println(graph);
			break;
		case "DirectedPaths":
			String[] items = sc.nextLine().split(" ");
			for (int k = 0; k <items.length; k++) {
            DijkstraSP dsp = new DijkstraSP(graph,Integer.parseInt(items[0]));
             if (dsp.hasPathTo((Integer.parseInt(items[1])))== false) {
             	System.out.println("No Path Found.");
             	}
             	else{
             		System.out.println(dsp.distTo(Integer.parseInt(items[1])));
             	}
             	break;
        }
			break;
		case "ViaPaths":
			// Handle the case of ViaPaths, where three integers are given.
			// First is the source and second is the via is the one where path should pass throuh.
			// third is the destination.
			// If the path exists print the distance between them.
			// Other wise print "No Path Found."
			String[] objects = sc.nextLine().split(" ");
			for (int k = 0; k <objects.length; k++) {
            DijkstraSP dsp = new DijkstraSP(graph,Integer.parseInt(objects[0]));
            if (dsp.hasPathTo((Integer.parseInt(objects[1])))&&
            	dsp.hasPathTo((Integer.parseInt(objects[2])))== false){
            	System.out.println("No Path Found.");
            }
            break;
        }
			break;
		default:
			break;
		}

	}
}