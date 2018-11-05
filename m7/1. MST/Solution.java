import java.util.Scanner;
/**
 * Class for solution.
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
   * Main method.
   *
   * @param      args  The arguments
   */
  public static void main(final String[] args) {
    Scanner scan = new Scanner(System.in);
    int vertices = Integer.parseInt(scan.nextLine());
    int edges = Integer.parseInt(scan.nextLine());
    EdgeWeightedGraph eg = new EdgeWeightedGraph(vertices);
     while (edges > 0) {
            String[] tokens = scan.nextLine().split(" ");
            int a = Integer.parseInt(tokens[0]);
            int b = Integer.parseInt(tokens[1]);
            double weight = Double.parseDouble(tokens[2]);
            Edge e = new Edge(a, b, weight);
            eg.addEdge(e);
            edges--;
        }
        LazyPrimMST l = new LazyPrimMST(eg);
        System.out.printf("%.5f\n", l.weight());
    }
}



