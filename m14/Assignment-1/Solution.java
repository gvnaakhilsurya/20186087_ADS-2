import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] words = loadWords();
		for (int i =0;i < words.length;i++) {
			// System.out.println(words[i]);
		}
		//Your code goes here...
		String input = sc.nextLine();
		// System.out.println(input);
		TST<Integer> st = new TST<Integer>();
		int count =0;
		for (int i =0;i < words.length;i++) {
			SuffixArray array = new SuffixArray(words[i]);
			for (int j = 0; j < array.length(); j++) {
				st.put(array.select(j), count++);
			}
			// st.put(words[i].substring(j),count++);
			// System.out.println(st.get(words[i]));for (int i =0;i < words.length;i++) {
			// st.put(words[i],count++);
		}
		
		for (String key : st.keysWithPrefix(input)) {
			System.out.println(key);
		}
	}

	public static String[] loadWords() {
		In in = new In("/Files/dictionary-algs4.txt");
		String[] words = in.readAllStrings();
		return words;
	}
}