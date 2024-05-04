package Lec21;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5; //index no. of fibonacci series // index no. 5  pr 5 hota hai then 2 is o/p ,,see in notebook
		System.out.println(fib(n));
	}
	public static int fib(int n) {
		if(n==0 || n==1) {
			return n;
		}
		int f1 = fib(n-1); // n-1th //recursive call 1
		int f2 = fib(n-2); // n-2th // recursive call2
		return f1+f2; 
		}

	}


