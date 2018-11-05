import java.util.Scanner;
/**
 * @author :gvnaakhilsurya.
 */
/**
 * Class for solution.
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
     * main method to read input.
     *In the  main method,we can read the input from the
     * input files gives by the user and split as tokens and
     * then passes as arguments to the specific method to get
     * the exact output of the solution.
     * @param args String
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = Integer.parseInt(scan.nextLine());
        Percolation percolobj = new Percolation(size);
        while (scan.hasNext()) {
            String[] tokens = scan.nextLine().split(" ");
            percolobj.open(Integer.parseInt(tokens[0])-1,
                      Integer.parseInt(tokens[1])-1);
        }
        System.out.println(percolobj.percolates());
    }
}
