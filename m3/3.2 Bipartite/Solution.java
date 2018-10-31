import java.util.Scanner;
public final class Solution {

	private Solution() {

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Graph g = new Graph(sc);
		Bipartite bp = new Bipartite(g);
		// System.out.println(bp.isBipartite());
		if (bp.isBipartite() == true) {
			System.out.println("Graph is bipartite");
		} else {
			System.out.println("Graph is not a bipartite");

		}

	}
}