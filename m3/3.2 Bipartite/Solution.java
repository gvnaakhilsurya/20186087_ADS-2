import java.util.Scanner;
/**
 * Solution class.
 * @author:gvnaakhilsurya.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        /**
         * private counstructor.
         */
    }
    /**
     * client method.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int vertices = Integer.parseInt(sc.nextLine());
        int edges = Integer.parseInt(sc.nextLine());
        Graph graph = new Graph(vertices);
        while (sc.hasNext()) {
            String[] input = sc.nextLine().split(" ");
            graph.addEdge(Integer.parseInt(input[0]),
                          Integer.parseInt(input[1]));
        }
        DirectedCycle directedcycle = new DirectedCycle(graph);
        if (directedcycle.isBipartite()) {
            System.out.println("Graph is bipartite");
        } else {
            System.out.println("Graph is not a bipartite");
        }
    }
}
