package Lec20;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =2;
		int b =5;
		System.out.println(pow(a,b));
	}
	public static int pow(int a, int b) {
		if(b==0) {  // base case
			return 1;
		}
		int ans = pow(a,b-1); // a^b-1//sp (2ki power 4)  //that line is called recursive call
		return ans*a; // 2ki power 4  *2 //public static int -> isme main method me return hota h
		
	}

	}

//in this code 2 ki power 5 ka output mil rha h 32
// see in notebook