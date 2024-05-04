 package Lec21;

public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="abc";
		printSubSeq(str,""); //  " " is for khalil(empty) string ke liye
	// for creating method click line no. 9 then click creat method
	}

	public static void printSubSeq(String str, String ans) { //str and ans dono argument hai  // ans me empty string pass hoga
		// TODO Auto-generated method stub
		if (str.length()==0) {  // jb jb base case hit horha h then character print ho rha hai // then fir pehle wala code stack se ht rha h and another stack generate hogi fir uska character alag se print hoga
			System.out.println(ans);
			return;
		}
		char ch = str.charAt(0);  //a
		printSubSeq(str.substring(1),ans);
		printSubSeq(str.substring(1),ans+ch);
		
		}
	}


