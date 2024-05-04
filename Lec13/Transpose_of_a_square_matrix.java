package Lec13;

import java.util.Scanner;

public class Transpose_of_a_square_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int [][] arr=new int [n][n];
		for (int i= 0; i <arr.length; i++) {
			for (int j=0; j<arr.length; i++) {
				arr[i][j]= sc.nextInt();
			}
		}
		Transpose(arr);
		for (int i= 0; i <arr.length; i++) {
			for (int j=0; j<arr[0].length; i++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}
	public static void Transpose(int [][] arr) {
		
		for (int row =0; row<arr.length; row++) {
			for (int col = row+1; col<arr.length; col++) {
				int temp = arr[row][col];
				arr[row][col]= arr[col][row];
				arr[col][row]=temp;
			}
		}
	}
}
	
// Input=   5
//	1 28 6 57 1
//	46 5 48 68 4
//	52 87 6 58 5
//	42 8 55 7 76 



//output
//5
//1 28 6 57 1
// 46 52 33 31 50 
//4 97 62 56 73 
//60 80 42 89 53 
//100 59 12 47 99


