package Lec22;

public class Count_Toss {

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
		CoinToss(n-1, ans +"H");
		CoinToss(n-1, ans +"T");
		
		
	}

}
