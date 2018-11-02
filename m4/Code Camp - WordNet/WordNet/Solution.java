import java.util.Scanner;
class Solution {
	private Solution() {

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String synsets = sc.nextLine();
		String hypernyms = sc.nextLine();
		String line = sc.nextLine();
		WordNet wrdnet = new WordNet("\\Files\\" + synsets, 
			"\\Files\\" + hypernyms);
		switch (line) {
			case "Graph":
			wrdnet.printGraph();
			break;
			case "Queries":
		}

	}
}