package Lec2;

import java.util.Scanner;

public class pattern17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = 1;
		int star = (n-1)/2;
		while (row <= n) {
			int i = 1;
			while (i <= star) {
				System.out.print("* ");
				i++;
			}
			i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
		    i= 1;
			while (i <= star) {
				System.out.print("* ");
				i++;
			}
			if (row < (n + 1) / 2) {
				star--;
				space += 2;
			} else {
				star++;
				space -= 2;
			}
			row++;
			System.out.println();
		}
	}
}
