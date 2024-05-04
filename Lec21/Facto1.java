package Lec21;

public class Facto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n= 5; // n ki value 4000 ke under honi chahiye warna stack over flow hoga or stack ke bahar 
		System.out.println(fact(n,1));
		
	}
	public static int fact(int n, int ans) { // n me 5 pass hoga ,,// and ans me 1(see in syso line)(base case me argument pass krte h tail recursion bnane ke liye(ans =1))
		//base case
		if(n==0) { // base case jha recursion ko rokana hai
			return ans;
		}
		 // small problem
		return fact(n-1, ans*n);   // this is tail recursion //see in notebook
		
	}
	

}
//Tail recursion