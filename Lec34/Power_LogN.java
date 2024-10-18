package Lec34;

public class Power_LogN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println(powerlogn(2,9));  // o/p = 2 ki power 9

	}
	public static int powerlogn(int a, int n) {
		if(n==0) {
			return 1;
		}
		int ans = powerlogn(a,n/2);//recursive call //for even power
		
		ans = ans*ans; // a^n --> a ki power n // for even power 
		
		if(n%2 != 0) {   // to check ki power odd hai ki nhi
			ans = ans*a; //if power odd hui then ans*a
		}
		return ans;
		
	}

}
