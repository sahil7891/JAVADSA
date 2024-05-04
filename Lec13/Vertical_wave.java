package Lec13;

public class Vertical_wave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3, 4 }, 
			        	{ 9, 5, 6, 8 }, 
			    	     { 5, 6, 8, 4 } };
		print(arr);

	}

	public static void print(int[][] arr) {
		for (int colum = 0; colum < arr[0].length; colum++) {

			if (colum % 2 == 0) {
				for (int row = 0; row < arr.length; row++) {
					System.out.print(arr[row][colum] + " ");

				}
			}
			else {
				for (int row = arr.length - 1; row >= 0; row--) {
					System.out.print(arr[row][colum] + " ");
				}

			}
		}
	}

}

//intput=  { 1, 2, 3, 4 }, 
//          { 9, 5, 6, 8 }, 
//          { 5, 6, 8, 4 }
//          
// output= 1 9 5
//		   6 5 2 
//		   3 6 8
//		   4 8 4
