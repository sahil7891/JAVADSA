package Lec7;

import java.util.Scanner;

public class Inverse_of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		int n =32145;  //sc.nextInt();
		int pos =1;
		int sum=0;
		while (n>0) {
			int rem=n%10;
			sum =(int)(sum +pos*Math.pow(10,rem-1)); //pow pr right click krke--open declaration--isee code ka internal working pta chlega
			n=n/10;
			pos++;
			
		}
		System.out.print(sum);

	}

}
