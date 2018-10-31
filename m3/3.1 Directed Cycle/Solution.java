import java.util.Scanner;
public final class Solution {

	private Solution() {

	}
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