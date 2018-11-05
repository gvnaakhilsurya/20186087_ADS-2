import java.util.Scanner;
/**
 * Class for graph matrix.
 */
class GraphMatrix {
    /**
     * array declaration.
     */
    private String[] tokens;
    /**
     * array declaration.
     */
    private int[][] matrix;
    /**
     * variable declaration.
     */
    private int v;
    /**
     * variable declaration.
     */
    private int e;
    /**
     * Constructs the object.
     */
    GraphMatrix() {
        e = 0;
    }
    /**
     * Constructs the object.
     *
     * @param      sc  The scan
     */
    GraphMatrix(Scanner sc) {
        /**
         * In the follow method we reads the inputs from
         * the input files and then create a graph. 
         */
        this.v = Integer.parseInt(sc.nextLine());
        matrix = new int[v][v];
        int edge = Integer.parseInt(sc.nextLine());
        tokens = sc.nextLine().split(",");
        for (int i = 0; i < edge; i++) {
            String[] inputs = sc.nextLine().split(" ");
            addEdge(Integer.parseInt(inputs[0]), Integer.parseInt(inputs[1]));
        }
    }

    /**
     * Adds an edge.
     * The complexity of the following method is O(1).
     * As the statment of the method executes only once for the
     * each method calls.
     * @param      v    the integer value
     * @param      w    the integer value
     */
    public void addEdge(int v, int w) {
        if (v != w) {
            if (!hasEdge(v, w)) {
                matrix[v][w] = 1;
                matrix[w][v] = 1;
                e++;
            }
        }
    }

    /**
     * Determines if it has edge.
     * The complexity of the following method is O(1).
     * As the statment of the method executes only once for the
     * each method calls.
     * @param      v    the integer.
     * @param      w    the integer.
     *
     * @return     True if has edge, False otherwise.
     */
    public boolean hasEdge(int v, int w) {
        if (matrix[v][w] == 1) {
            return true;
        }
        return false;
    }

    /**
     * display method.
     * The complexity of the following method is O(E+V).
     * where V is the no.of vertices and E is the no.of edges.
     * As the method executes for the iterations of two for loops
     * upto their end values.
     */
    public void print() {
        String str = "";
        str += v + " vertices, " + e + " edges" + "\n";
        if (e > 0) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    str += matrix[i][j] + " ";
                }
                str += "\n";
            }
            System.out.println(str);
        } else {
            str += "No edges";
            System.out.println(str);
        }
    }
}
