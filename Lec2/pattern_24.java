package Lec2;

import java.util.Scanner;

public class pattern_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space = n-1;
		int star  = 1;
		int row = 1;
		
		while (row<=n) {
			 
			int i=1;
			while (i<=space) {
				System.out.print("  ");
				i=i+1;
			}
			int j=1;
			while (j<=star) {
				System.out.print(row+" ");
				j=j+1;
			}
			row = row+1;
			space =space-1;
			star = star+2;
			System.out.println();
		}

	}

}