package Lec2;

import java.util.Scanner;

public class pattern_28self {

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
				System.out.print("\t");
				i=i+1;
			}
			int val = row;
			int j=1;
			while (j<=star) {
				System.out.print(val+"\t");
				if(j<(star/2)+1){
				
				val++;
				
			}else {
				val--;
			}
			j++;
		}
			row = row+1;
			space =space-1;
			star = star+2;
			System.out.println();
		}

	}

}
