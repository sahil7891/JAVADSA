package Lec16;

public class Palindrome_Subtring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "nitin";
		printSubString(str);
	}

	public static void printSubString(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {

				String s1 = str.substring(i, j);
				if (isPalindromeString(s1)== true) {
					System.out.println(s1);
				}
			}

		}
	}

	public static boolean isPalindromeString(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
