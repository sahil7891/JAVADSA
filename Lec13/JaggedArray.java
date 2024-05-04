package Lec13;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//row
		int [][] arr = new int [n] [];
		//teke input
		for (int i = 0; i<arr.length; i++) {
			int c = sc.nextInt();
			arr[i] =new int [c];
			for (int j=0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}

	}

}

//// input me 1st row dalna h
//then column , the colum ki value
//eg =2
//2
//1
//5
//1
//35
//1 5 
//35 
