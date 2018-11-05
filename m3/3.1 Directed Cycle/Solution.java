import java.util.Scanner;
/**.
 *@author:gvnaakhilsurya.
 *Solution  class.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //unused constructor.
    }
    /**
     * In the  main method,we can read the input from the
     * input files gives by the user and split as tokens and
     * then passes as arguments to the specific method to get
     * the exact output of the solution.
     * By the analysis the the time constant of the following method
     *is O(N).
     *As the while loop iterates upto the no.of the input lines
     *given.
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int vertices = Integer.parseInt(sc.nextLine());
        int edges = Integer.parseInt(sc.nextLine());
        Digraph digraph = new Digraph(vertices);
        while (sc.hasNext()) {
            String[] input = sc.nextLine().split(" ");
            digraph.addEdge(Integer.parseInt(input[0]),
                            Integer.parseInt(input[1]));
        }
        DirectedCycle directedcycle = new DirectedCycle(digraph);
        System.out.println(directedcycle);
    }
}
