package Lec21;

public class Facto1_Self_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n= 5; // n ki value 4000 ke under honi chahiye warna stack over flow hoga or stack ke bahar 
		System.out.println(fact(n));
		
	}
	public static int fact(int n) {
		//base case
		if(n==0) { // base case jha recursion ko rokana hai
			return 1;
		}
		 // small problem = n-1 which is 4 then 4! ka answer
		//int fn = fact(n-1); // recursion (n-2)! //it will give 4! // recursive call
		return n*fact(n-1);   //it will still be head recursion bcoz return me still stack upar se nichi ate time o/p calculate hora h
		
		//return n*fact(n-1);ke badle we can also write see below
		//int fn = n*fact(n-1);
		//return fn;
		
		
		
		
	}

}
