package Lec19;

import java.util.Scanner;

public class Kartik_Bhaiya_And_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); // code ko hardcode me run krne ke liye  ye line commentout krni hogi or sc.next ko bhi
		String str = sc.next();// "ababbbaaba";
		int k = sc.nextInt();// 3
		int flipa = maximumlength(str, k, 'a');  // first a ke liye run hoga // a ko b me flip(convert) kerega
		int flipb = maximumlength(str, k, 'b');  // then b ke liye run hoga // b ko a me flip(convert) kerega
		System.out.println(Math.max(flipa, flipb));// a or b me se jiska count jada hoga uska count print hoga
	}

	public static int maximumlength(String str, int k, char ch) {// b
		int si = 0;//si = start index
		int ei = 0;// ei = end index   // initially si and ei ka index 0 hoga then ei ka index phle badhega 
		int ans = 0;
		int flip = 0; // flip means a tob or b to a

		while (ei < str.length()) {

			// window grow
			if (str.charAt(ei) == ch) {
				flip++;                    // flip k(3) ke equal tk hi increase hoga otherwise //window shrink wali line chalegi

			}

			// window shrink
			while (flip > k && si <= ei) {
				if (str.charAt(si) == ch) {
					flip--;              // isme flip ka size 3 pr maintain rhega bcos k ka size 3 denge input me
				}
				si++;                    //si ka index increase hoga

			}
			// ans calculate
			ans = Math.max(ans, ei - si + 1);

			ei++;                           // ei ka index badhane ke liye
		}
		return ans;
	}

}
// see notebook , that ques is on code skiller(ques name = Kartik Bhaiya And Strings)
// input = ababbbaaba
// next input = 3

//ques below
//Kartik Bhaiya has a string consisting of only 'a' and 'b' as the characters.
//Kartik Bhaiya describes perfectness of a string as the maximum length substring 
//of equal characters. Kartik Bhaiya is given a number k which denotes the maximum number of
//characters he can change. Find the maximum perfectness he can generate by changing no more than k characters.










//below are the steps for vriable size window
//String str = "abbbaababab";
//int k=3;
//}
//public static int maximumlength(String str, int k) {
//int si =0;
//int ei =0;
//
//while (ei<str.length()) {
//	
//	//window grow
//	
//	//window shrink
//	
//	//ans calculate
//	
//	ei++;
//}
