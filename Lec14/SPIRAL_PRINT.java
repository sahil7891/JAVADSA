package Lec14;

public class SPIRAL_PRINT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 }, 
                      { 9, 10, 11, 12 },
                      { 13, 14, 15, 16 } };
		SprialPrint(arr);
                     
	}

	public static void SprialPrint(int[][] arr) {
		int minrow = 0;
		int maxrow = arr.length - 1;
		int mincolumn = 0;
		int maxcolumn = arr[0].length - 1;
		int toatal = arr.length * arr[0].length;
		int count = 0;
		while (count < toatal) {
			for (int i = mincolumn; i <= maxcolumn && count < toatal; i++) {  // this squar matrix but for rectangular matrix you have to put "&& count < toatal" in all loop
				System.out.print(arr[minrow][i] + " ");

			}
			minrow++;
			for (int i = minrow; i <= maxrow && count < toatal; i++) {
				System.out.print(arr[i][maxcolumn] + " ");
				count++;

			}
			maxcolumn--;
			for (int i = maxcolumn; i >= mincolumn && count < toatal; i--) {
				System.out.print(arr[maxrow][i] + " ");
				count++;

			}
			maxrow--;
			for (int i = maxcolumn; i > mincolumn && count < toatal; i--) {
				System.out.print(arr[i][mincolumn] + " ");
				count++;
			}
			mincolumn++;

		}
	}

}

//is code me minr,maxr  & maxr, minc  apne index change kr rhe hai hr itretion me
//to understand the output of the code see note book notes
