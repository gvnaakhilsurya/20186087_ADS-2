import java.util.Scanner;
/**
 * @author : gvnaakhilsurya
 */
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
    }
    /**
     * It is thge main method in this we can read the
     * inputs from the input files and then converted into
     * the tokens and then send as parameters to the spcified
     * methods of the classes.
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        switch (type) {
        case "List":
            GraphList gplist = new GraphList(sc);
            System.out.println(gplist);
            break;
        case "Matrix":
            GraphMatrix lisMat = new GraphMatrix(sc);
            lisMat.toString();
            break;
        default :
            break;
        }
    }
}



