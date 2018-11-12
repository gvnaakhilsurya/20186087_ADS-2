import java.util.*;
public final class Solution {
	private Solution() {

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nfstrings =Integer.parseInt(sc.nextLine());
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i< nfstrings;i++) {
			sb.append(sc.nextLine() + "::");
		}
		String[] lines = sb.toString().split("::");
		Quick3string q3 = new Quick3string();
		q3.sort(lines);
		String str = "[";
		for ( String line:lines) {
			// System.out.println(line);
			str += line +", ";
		}
		System.out.println(str.substring(0,str.length() - 2) + "]");
	}
}