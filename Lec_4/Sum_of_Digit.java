package Lec_4;

import java.util.Scanner;

public class Sum_of_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int sum = 0;
		while (n>0) {
			int rem = n%10; //it will calculate remender 
			sum += rem; // sum = sum+rem
			n/=10;//n = n/10; // eg 2351/10 =235left for next iteration
		}
		System.out.println(sum);
		}

	}
//------------------------------------
// by for loop
//    for(int n = sc.nextInt(); n>0; n= n/10) {
//    	int rem = n%10;
//    	sum += rem//sum = sum+rem
//    }
//    System.out.println(sum);
//    }
//    }




//i/p =2351
//se in notebook

