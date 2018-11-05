/**
 * Class for digraph.
 */
public class Digraph {
    /**
     * {number of vertices in this digraph}.
     */
    private final int vertices;
    /**
     * {number of edges in this digraph}.
     */
    private int edges;
    /**
     * {adj[v] = adjacency list for vertex v}.
     */
    private Bag<Integer>[] adj;
    /**
     * {indegree[v] = indegree of vertex v}.
     */
    private int[] indegree;

    /**
     * Initializes an empty digraph with <em>v</em> vertices.
     *
     * @param  v the number of vertices
     * @throws IllegalArgumentException if {@code v < 0}
     */
    public Digraph(final int v) {
        if (v < 0) {
            throw new IllegalArgumentException(
                "Number of vertices in a Digraph must be nonnegative");
        }
        this.vertices = v;
        this.edges = 0;
        indegree = new int[vertices];
        adj = (Bag<Integer>[]) new Bag[vertices];
        for (int i = 0; i < vertices; i++) {
            adj[i] = new Bag<Integer>();
        }
    }

    /**
     * Returns the number of vertices in this digraph.
     *By the analysis the the time constant of the following method
     *is O(1).
     *The statment of the method executes only once when the method calls.
     * @return the number of vertices in this digraph
     */
    public int vertices() {
        return vertices;
    }

    /**
     * Returns the number of edges in this digraph.
     *By the analysis the the time constant of the following method
     *is O(1).
     *The statment of the method executes only once when the method calls.
     * @return the number of edges in this digraph
     */
    public int edges() {
        return edges;
    }

    /**
     * Adds the directed edge v→w to this digraph.
     *By the analysis the the time constant of the following method
     *is O(1).
     *The statment of the method executes only once when the method calls.
     * @param  v the tail vertex
     * @param  w the head vertex
     * @throws IllegalArgumentException unless both
     * {@code 0 <= v < V} and {@code 0 <= w < V}
     */
    public void addEdge(final int v, final int w) {
        adj[v].add(w);
        indegree[w]++;
        edges++;
    }

    /**
     *Returns the vertices adjacent from vertex {@code v} in this digraph.
     *By the analysis the the time constant of the following method
     *is O(V).V is the total no.of the vertices.
     *The method iterates upto no.of values of the vertecies given it.
     * @param  v the vertex
     * @return the vertices adjacent from vertex {@code v}
     * in this digraph, as an iterable
     * @throws IllegalArgumentException unless {@code 0 <= v < V}
     */
    public Iterable<Integer> adj(final int v) {
        return adj[v];
    }

    /**
     *Returns the number of directed edges incident from vertex {@code v}.
     *This is known as the <em>outdegree</em> of vertex {@code v}.
     *By the analysis the the time constant of the following method
     *is O(1).
     *The statment of the method executes only once when the method calls.
     * @param  v the vertex
     * @return the outdegree of vertex {@code v}
     * @throws IllegalArgumentException unless {@code 0 <= v < V}
     */
    public int outdegree(final int v) {
        return adj[v].size();
    }

    /**
     *Returns the number of directed edges incident to vertex {@code v}.
     *This is known as the <em>indegree</em> of vertex {@code v}.
     *By the analysis the the time constant of the following method
     *is O(1).
     *The statment of the method executes only once when the method calls.
     * @param  v the vertex
     * @return the indegree of vertex {@code v}
     * @throws IllegalArgumentException unless {@code 0 <= v < V}
     */
    public int indegree(final int v) {
        return indegree[v];
    }

    /**
     *Returns the reverse of the digraph.
     *By the analysis the the time constant of the following method
     *is O(E*V).V is the total no.of the vertices and E is the edges.
     * In the two forloops, one iterates upto to the V value and another
     * one is iterates upto E value.
     *
     * @return the reverse of the digraph
     */
    public Digraph reverse() {
        Digraph reverse = new Digraph(vertices);
        for (int j = 0; j < vertices; j++) {
            for (int w : adj(j)) {
                reverse.addEdge(w, j);
            }
        }
        return reverse;
    }
}
