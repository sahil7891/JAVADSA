package Lec34;

public class Palindromi_Substrings_Leetcode_647 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "nitin";
		System.out.println(countpalindromic(str));
	}

	public static int countpalindromic(String str) {
		int count = 0;
		// odd
		for (int axis = 0; axis < str.length(); axis++) {
			for (int orbit = 0; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) { // for boundary
				if (str.charAt(axis - orbit) == str.charAt(axis + orbit)) {
					count++;
				} else {
					break;
				}
			}
		}
		// even
		for (double axis = 0.5; axis < str.length(); axis++) {
			for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {  // for boundary
				if (str.charAt((int) (axis - orbit)) == str.charAt((int) (axis + orbit))) {
					count++;
				} else {
					break;
				}

			}
		}
		return count;
	}

}
