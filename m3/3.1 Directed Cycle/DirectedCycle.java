/**
 * Class for directed cycle.
 */
public class DirectedCycle {
    /**
     * { var_description }.
     */
    private boolean[] marked;
    /**
     * { var_description }.
     */
    private int[] edgeTo;
    /**
     * { var_description }.
     */
    private boolean[] onStack;
    /**
     * { var_description }.
     */
    private Stack<Integer> cycle;

    /**
     * Determines whether the digraph {@code G} has a directed cycle and, if so
     * finds such a cycle.
     * @param graph the digraph
     */
    public DirectedCycle(final Digraph graph) {
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
     **By the analysis the the time constant of the following method
      *is adj(v).
      *As the Adj(v) is the adjacent list of the each vertices.
      *The statment of the method executes only once when the method calls.
     * @param      graph    digraph
     * @param      v        vertex
     */
    private void dfs(final Digraph graph, final int v) {
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
     *By the analysis the the time constant of the following method
     *is O(1).
     *The statment of the method executes only once when the method calls.
     * @return     True if has cycle, False otherwise.
     */
    public boolean hasCycle() {
        return cycle != null;
    }

    /**
     * Returns a string representation of the object.
     *By the analysis the the time constant of the following method
     *is O(1).
     *The statment of the method executes only once when the method calls.
     * @return     String representation of the object.
     */
    public String toString() {
        if (hasCycle()) {
            return "Cycle exists.";
        } else {
            return "Cycle doesn't exists.";
        }

    }
}
