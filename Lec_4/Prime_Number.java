package Lec_4;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int fact = 0;
		for(int i=2; i<n; i++) {
			if(n%i==0) {  // agr ye line true hui then 'fact++' wali line chlegi
				fact++; // fact 1 hote hi loop ki itration stop hogi and'else' wali line print hogi otherwise a nhi hui toh 'if' wali line print hogi
			}
		}
		if(fact>=1) {
		System.out.println("Not prime");
		}
		else {
			System.out.println("Prime");
			System.out.println(n);
			}
		}
	}
//entered i/p prime or not 
// eg i/p = 13
//--------------------------------
     // hardcode

//int n=3;
//int fact = 0;
//for (int i =2; i <n; i++) {
//	if(n%i ==0) {
//		fact++;
//	}
//}
//if (fact >=1) {
//	System.out.println("Not Prime");
//}else {
//	System.out.println("Prime");
//}
//
//}
//
//}
