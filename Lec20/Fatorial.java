package Lec20;

public class Fatorial {

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
		int fn = fact(n-1); // recursion (n-2)! //it will give 4! // recursive call
		return fn*n;        //4!*5 main me return hoga  // head recursion bcoz return me fn*n horha h and agar sirf return hota toh "tail" recursion hota
		}
		

	}
//output=5!==120
//see stack frame in notebook 
//head recursion type
