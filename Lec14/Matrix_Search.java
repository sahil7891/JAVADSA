package Lec14;

import java.util.Scanner;

public class Matrix_Search {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();      //n is for row
		int m = sc.nextInt();         // m is for column
		int[][] arr = new int[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int x = sc.nextInt();   // no. to be searched
		System.out.println(Search(arr, x));
	}

	public static int Search(int[][] arr, int x) {
		int row = 0;
		int col = arr[0].length - 1;
		while (col >= 0 && row < arr.length) {

			if (arr[row][col] == x) {
				return 1;         // when the no. is present in matrix

			} else if (arr[row][col] < x) {
				row++;

			}
			else {
				col--;
				
			}
			 
		}
		return 0;         		// when the no. is not present in matrix

	}
}
// if the no. is bigger then row will be shifted
//if the no. is shorter then the column will be shifted
// we can either left<-  or down from each cell
//searching will be started from 45(first column last row)
//given matrix = 28,33,45
//               30,34,46
//               57,68,77   

// input  = 
//type 3 which is(N) enter then type 3which is(M)
//then copy past the  matrix below
//3 30 38
//44 52 54
//57 60 69
//then enter the no. that is to be find for eg 62 below
//62==output = 0 because 62 is not present in this matrix


















