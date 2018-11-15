public class BoggleSolver {
	TST<Integer>st = new TST<Integer>();

	// Initializes the data structure using the given array of strings as the dictionary.
	// (You can assume each word in the dictionary contains only the uppercase letters A through Z.)
	public BoggleSolver(String[] dictionary) {
		for (int i = 0;i < dictionary.length;i++) {
			if ((dictionary[i]).length()==3 ||(dictionary[i]).length()==4) {
				st.put(dictionary[i],1);	
			}else if ((dictionary[i]).length()==5) {
				st.put(dictionary[i],2);
			} else if ((dictionary[i]).length()==6) {
				st.put(dictionary[i],3);
			} else if ((dictionary[i]).length()==7) {
				st.put(dictionary[i],5);
			} else if ((dictionary[i]).length()>=8) {
				st.put(dictionary[i],11);
			} 
		}
	}

	// Returns the set of all valid words in the given Boggle board, as an Iterable.
	public Iterable<String> getAllValidWords(BoggleBoard board) {
		return new Bag<String>();
	}

	// Returns the score of the given word if it is in the dictionary, zero otherwise.
	// (You can assume the word contains only the uppercase letters A through Z.)
	public int scoreOf(String word) {
		return st.get(word);
	   }
    }