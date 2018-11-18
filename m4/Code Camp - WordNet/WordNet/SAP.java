/**
 * Class for sap.
 */
public class SAP {
    /**
     * digraph.
     */
    private Digraph dg;
    /**
     * distance.
     */
    private int distance = Integer.MAX_VALUE;
    /**
     * ancestor.
     */
    private int ancestor1 = -1;
    /**
     * Constructs the object.
     *
     * @param      digraph  The digraph
     */
    public SAP(final Digraph digraph) {
        dg = digraph;
    }
    /**
     * length.
     * By the analysis the time complexity of the following method is
     * O(1).As the statment of the method executes only once when
     the method calls.
     *
     * @param      v    integer variable.
     * @param      w    integer variable.
     *
     * @return  distance.
     */
    public int length(final int v, final int w) {
        ancestor(v, w);
        return distance;
    }
    /**
     * ancestor.
     *By the analysis the time complexity of the following method is
     * O(V).As the for loop iterates upto the total no.of vertices.Then the
     * V is total no.of vertices.
     * @param      v  integer variable.
     * @param      w  integer variable.
     *
     * @return    ancestor.
     */
    public int ancestor(final int v, final int w) {
        BreadthFirstDirectedPaths b1 = new BreadthFirstDirectedPaths(dg, v);
        BreadthFirstDirectedPaths b2 = new BreadthFirstDirectedPaths(dg, w);
        for (int vertices = 0; vertices < dg.v(); vertices++) {
            if (b1.hasPathTo(vertices) && b2.hasPathTo(vertices)) {
                int newdistance = b1.distTo(vertices) + b2.distTo(vertices);
                if (newdistance < distance) {
                    distance = newdistance;
                    ancestor1 = vertices;
                }
            }
        }
        return ancestor1;
    }
    /**
     * length.
     * By the analysis the time complexity of the following method is
     * O(V).As the for loop iterates upto the total no.of vertices.Then the
     * V is total no.of vertices.
     * @param      v   integer variable.
     * @param      w   integer variable.
     *
     * @return length.
     */
    public int length(final Iterable<Integer> v, final Iterable<Integer> w) {
        ancestor(v, w);
        return distance;
    }
    /**
     * ancestor.
     *By the analysis the time complexity of the following method is
       O(V*V).As the for loop iterates upto the total no.of vertices.Then the
     * V is total no.of vertices.
     * @param      v   integer variable.
     * @param      w   integer variable.
     *
     * @return ancestor.
     */
    public int ancestor(final Iterable<Integer> v, final Iterable<Integer> w) {
        for (int v1 : v) {
            for (int w1 : w) {
                ancestor1 = ancestor(v1, w1);
            }
        }
        return ancestor1;
    }
}

