import java.util.Scanner;
class WebSearch {

}


public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		// read the first line of the input to get the number of vertices
		int vertices = Integer.parseInt(sc.nextLine());
		Digraph dp = new Digraph(vertices);
		// iterate count of vertices times
		for (int i = 0;i < vertices;i++) {
			String[]adjlist =sc.nextLine().split(" ");
			for (int j =1;j < adjlist.length;j++) {
				dp.addEdge(Integer.parseInt(adjlist[0]),Integer.parseInt(adjlist[j]));
			}
			
		}
		System.out.println(dp);
		// to read the adjacency list from std input
		// and build the graph
		// Create page rank object and pass the graph object to the constructor
		PageRank pgrk = new PageRank(dp);
		
		// print the page rank object
		
		// This part is only for the final test case
		
		// File path to the web content
		String file = "WebContent.txt";
		
		// instantiate web search object
		// and pass the page rank object and the file path to the constructor
		
		// read the search queries from std in
		// remove the q= prefix and extract the search word
		// pass the word to iAmFeelingLucky method of web search
		// print the return value of iAmFeelingLucky
		
	}
}
