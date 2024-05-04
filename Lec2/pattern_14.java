package Lec2;

import java.util.Scanner;

public class pattern_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space = n - 1;
		int star = 1;
		int row = 1;

		while (row <= 2 * n - 1) {
			
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i = i + 1;

			}
			
			int j = 1;
			while (j<= star) {
				System.out.print("*" + " ");
				j = j + 1;
			}

			// mirroring***
			if (row < n) {
				space = space-1;
			} else {
				space = space+1;
			}
			if (row < n) {
				star = star + 1;
			} else {
				star = star - 1;
			}
			row = row + 1;
			
			System.out.println();
		}

	}

}
