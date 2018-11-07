import java.util.Scanner;
import java.util.ArrayList;
/**
 * Class for solution.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     *main method for the program..
     *complexity is O(E + V)
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        String[] edges = sc.nextLine().split(" ");
        ArrayList<String> list = new ArrayList<String>();
        for (int j = 0; j < edges.length; j++) {
            list.add(edges[j]);
        }
        EdgeWeightedGraph graph = new EdgeWeightedGraph(Integer.
                                              parseInt(input[0]));
        for (int i = 0; i < Integer.parseInt(input[1]); i++) {
            String[] tokens = sc.nextLine().split(" ");
            graph.addEdge(new Edge(list.indexOf(tokens[0]),
                                   list.indexOf(tokens[1]),
                                   Integer.parseInt(tokens[2])));
        }
        int cases = Integer.parseInt(sc.nextLine());
        for (int k = 0; k < cases; k++) {
            String[] item = sc.nextLine().split(" ");
            DijkstraUndirectedSP dsp = new DijkstraUndirectedSP(graph, list.indexOf(item[0]));
            System.out.println(Math.round(dsp.distTo(list.indexOf(item[1]))));
        }
    }
}