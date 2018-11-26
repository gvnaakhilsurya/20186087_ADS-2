/**
 * Class for directed cycle.
 */
public class DirectedCycle {
    /**
     * boolean value.
     */
    private boolean[] marked;
    /**
     * integer array.
     */
    private int[] edgeTo;
    /**
     * boolean array.
     */
    private boolean[] onStack;
    /**
     * stack.
     */
    private Stack<Integer> cycle;
    /**
     * integer value.
     */
    private int vertices;
    /**
     * boolean value.
     */
    private boolean isbipartite = false;
    /**
     * Determines whether the digraph {@code G} has a directed cycle and, if so
     * finds such a cycle.
     * @param graph the digraph
     */
    public DirectedCycle(final Graph graph) {
        this.vertices = 0;
        marked  = new boolean[graph.vertices()];
        onStack = new boolean[graph.vertices()];
        edgeTo  = new int[graph.vertices()];
        for (int v = 0; v < graph.vertices(); v++) {
            if (!marked[v] && cycle == null) {
                dfs(graph, v);
            }
        }
    }
    /**
      *By the analysis the the time constant of the following method
      *is O(E+V)
      *As E is the total number of edges and V is the total no of vertices
      *in the Digraph given.
     * @param      graph   Graph
     * @param      v     vertex
     */
    private void dfs(final Graph graph, final int v) {
        isbipartite = !isbipartite;
        onStack[v] = true;
        marked[v] = true;
        for (int w : graph.adj(v)) {

            // short circuit if directed cycle found
            if (cycle != null) {
                return;
            } else if (!marked[w]) {
                edgeTo[w] = v;
                dfs(graph, w);
            } else if (onStack[w]) {
                cycle = new Stack<Integer>();
                for (int x = v; x != w; x = edgeTo[x]) {
                    cycle.push(x);
                }
                cycle.push(w);
                cycle.push(v);
            }
        }
        onStack[v] = false;
    }

    /**
     * Determines if it has cycle.
     * Returns a string representation of the object.
     *By the analysis the the time constant of the following method
     *is O(1).
     *The statment of the method executes only once when the method calls.
     * @return     True if has cycle, False otherwise.
     */
    public boolean hasCycle() {
        return cycle != null;
    }

    /**
     * Determines if bipartite.
     * Returns a string representation of the object.
     *By the analysis the the time constant of the following method
     *is O(1).
     *The statment of the method executes only once when the method calls.
     * @return     True if bipartite, False otherwise.
     */
    public boolean isBipartite() {
        return isbipartite;
    }
}
