package Lec2;

import java.util.Scanner;

public class Star_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = n;
		while (row<= star) {
			
			int i=1;
			while(i<= star) {
				System.out.print("*" + " ");
				
				i= i+1;
			}
			row =row+1;
			System.out.println();
			
			
		}

	}

}
