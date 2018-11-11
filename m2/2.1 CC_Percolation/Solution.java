
import java.util.Scanner;
/**
 *@author:gvnaakhilsurya.
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        // Unused Constructor.
    }
    /**
     * {Client Program}.
     *It is thge main method in this we can read the
     * inputs from the input files and then converted into
     * the tokens and then send as parameters to the spcified
     * methods of the classes.
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        Percolation p = new Percolation(number);
        while (scan.hasNext()) {
            String[] tokens = scan.nextLine().split(" ");
            int a = Integer.parseInt(tokens[0]);
            int b = Integer.parseInt(tokens[1]);
            p.open(a, b);
        }
        System.out.println(p.percolates() && p.numberOfOpenSites() != 0);
    }
}