/**
 * import java Scanner class.
 */
import java.util.*;
/**
 * Class for percolation.
 */
class Percolation {
    int openSiteCount;
    boolean[][] arr;
    Graph graph;
    int n;

    /**
     * Constructs the object.
     * @param      n     integer value.
     */
    public Percolation(int n) {
        this.n = n;
        arr = new boolean[n][n];
        graph = new Graph((n)*(n) + 2);
   }

   /**
    * 
    *By the analysis the the time constant of the following method
    *is O(1).
    *The statment of the method executes only once when the method calls.
    * @param      i     integer value
    * @param      j     integer value
    */
   public void open(int i, int j) {
        arr[i][j] = true;

        // Top site.
        if(i == 0) graph.addEdge(n*n, cal(i,j));

        // Bottom site.
        if(i == n-1) graph.addEdge(n*n+1, cal(i,j));

        // bottom site
        if (i < n-1 && arr[i+1][j] == true)
            graph.addEdge(cal(i, j), cal(i+1, j));

        // top site
        if (i > 0   && arr[i-1][j] == true)
            graph.addEdge(cal(i, j), cal(i-1, j));

        // right site
        if (j < n-1 && arr[i][j+1] == true)
            graph.addEdge(cal(i, j), cal(i, j+1));

        // left site
        if (j > 0   && arr[i][j-1] == true)
            graph.addEdge(cal(i, j), cal(i, j-1));
   }
   /**
    **By the analysis the the time constant of the following method
    *is O(1).
    *The statment of the method executes only once when the method calls.
    *
    * @param      i    integer value.
    * @param      j    integer value.
    *
    * @return     integer value.
    */
   public int cal(int i, int j) {
        return (n*i)+j;
   }

   /**
    *By the analysis the the time constant of the following method
    *is O(1).
    *The statment of the method executes only once when the method calls.
    *
    * @return    boolean value.
    */
   public boolean percolates() {
        CC cc = new CC(graph);
        if (cc.connected(n*n, n*n+1))
            return true;
        return false;
    }
}
