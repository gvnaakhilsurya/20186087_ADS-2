import java.util.Scanner;
/**
 * { item_description }
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
	 * The main method takes the input from the input files
	 * and processes and passes as the arguments and send to the
	 * specified methods.
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Digraph dg = new Digraph(sc);
		DirectedCycle dc = new DirectedCycle(dg);
		// System.out.println(dc.hasCycle());
		if (dc.hasCycle()==true) {
			System.out.println("Cycle exists.");
		}else {
			System.out.println("Cycle doesn't exists.");
		}

	}
}