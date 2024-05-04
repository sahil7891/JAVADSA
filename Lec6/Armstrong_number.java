package Lec6;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(IsArmstron(n));

	}
	public static boolean IsArmstron(int n) {
		int c= countofdigit(n);
		int sum=0;
		int p=n;
		while (n>0) {
			int rem=n%10;
			sum=(int)(sum+Math.pow(rem, c));
			n=n/10;
		}
		return sum ==p;
	}

	public static int countofdigit(int n) {
		int count = 0;
		while (n>0) {
			count++;
			n=n/10;
		}
		return count;

	}
}
//input = 371
//o/p = true
