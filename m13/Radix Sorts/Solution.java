/**
 * By comparing the other sorting methods,3-way Quick
 * Sort is better than the LSD radix sort and  the MSD
 * radix sort.Because it takes the less time complexity
 * and less space complexity compare to the other methods.
 */
import java.util.Scanner;
/**
 * @author : gvnaakhilsurya.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        /**
         * private Constructor.
         */
    }

    /**
     *In the main method,the input from the user input files
     *is  taken and split into the tokens and then send as 
     *arguments to the particular method of classes.The time
     *complexity of the given method is O(N).As the N is the
     *total no.of inputs. 
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        Quick3string q3s = new Quick3string();
        int n = Integer.parseInt(scan.nextLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(scan.nextLine() + "::");
        }
        String[] lines = sb.toString().split("::");
        q3s.sort(lines);
        String str = "[";
        for (int i = 0; i < n; i++) {
            str += lines[i] + ", ";
        }
        System.out.println(str.substring(0, str.length() - 2) + "]");
    }
}
