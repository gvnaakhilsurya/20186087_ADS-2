import java.util.Scanner;
class PageRank {
	Digraph d;
	double[] pageRank;
	PageRank(Digraph d) {
		this.d = d;
		pageRank = new double[d.V()];
		for (int i = 0; i < pageRank.length; i++) {
			pageRank[i] = 1.0 / d.V();
		}
	}
	double getPR(int v) {
		double p = pageRank[v];
		//double finalpageRank=0;
		for(int j = 0; j <= 1000; j++) {
				for (int i: d.adj(v)) {
					if(d.outdegree(i)==0) {
						return 0;
					}
					p = pageRank[i]/d.outdegree(i);
					//finalpageRank+=p;
				}
			}
		return p;
	}
	public String toString() {
		String str = "";
		str += d + "\n";
		for (int i = 0; i < d.V(); i++) {
			str += i + " - " + getPR(i) + "\n";
		}
		return str;
	}
}
class WebSearch {

}

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		// read the first line of the input to get the number of vertices
		int vertices = Integer.parseInt(sc.nextLine());
		Digraph dp = new Digraph(vertices);
		PageRank pgrk = new PageRank(dp);
		// iterate count of vertices times
		for (int i = 0;i < vertices;i++) {
			String[]adjlist =sc.nextLine().split(" ");
			for (int j =1;j < adjlist.length;j++) {
				dp.addEdge(Integer.parseInt(adjlist[0]),Integer.parseInt(adjlist[j]));
			}
			
		}
		System.out.println(dp);
		System.out.println(pgrk);
		// to read the adjacency list from std input
		// and build the graph
		// Create page rank object and pass the graph object to the constructor
		
		
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
