package Lec22;

public class Coin_Toss_Without2Heads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3;
		CoinToss(n, "");
	}
	public static void CoinToss(int n , String ans) {
		if (n == 0) {
			System.out.println(ans); // subsequence wale code ki trh print hoga base case hit hone pr
			return;
		}
		
    //if( ans.charAt(ans.length()-1) !='H'){ // iss case me string ka lenght 0 h isliye error dega
		if(ans.length()==0 || ans.charAt(ans.length()-1) !='H') {//!='H' //this line check ki last index H h ya nhi //length-1 last character ko get krne ke liye use krte h
		CoinToss(n-1, ans +"H");
	}
		CoinToss(n-1, ans +"T");
		
	}

}
