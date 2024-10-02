package Lec30;

public class Sudoku_Solver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] grid= {{ 3, 0, 6, 5, 0, 8, 4, 0, 0 }, // 0 empty cell ko denote kr rha hai
	                    { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, 
	                    { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
	                    { 0, 0, 3, 0, 1, 0, 0, 8, 0 }, 
	                    { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
	                    { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
	                    { 1, 3, 0, 0, 0, 0, 2, 5, 0 }, 
	                    { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, 
	                    { 0, 0, 5, 2, 0, 6, 3, 0, 0 }};
		
		Sudokusolver(grid,0,0);

	}
	public static void Sudokusolver(int[][] grid, int row, int col) {
		// TODO Auto-generated method stub
		//row =0 th row //col=0th column
		if(col == 9) { // agar column ke index ki value 9 hui (total row and column 0to8 h isliye agar 9 hui) cr,cc ko next row me jana chahiye then
			row++; // then next row me jane ke liye row +1 kiye hai
			col =0;
		}
		if(row ==9) { // row 0to8 tk jayega agar 9 hota hai fir matlab puri matrix fill hogyi then niche
			Display(grid); // then Display method ko call lgegi and o/p print hoga
			return;
		}
		
		if(grid[row][col]!=0) { // agr cell empty nhi h or cell me already number filled hai then niche wali line
			Sudokusolver(grid,row,col+1);  // then move to next column in same row (move forward or right)
		}
		else { // ya fir 0(empty) hai then niche
			
			for (int val = 1; val < 9; val++) { // then check krenge ki us cell me 1to9 tk koi digit fill kr skte ya nhi//instead of 9 recursive call we put the loop
				if(isitpossible(grid,row,col,val) == true) { //isitpossible method check krenge ki us cell me 1to9 tk koi digit fill kr skte ya nhi , agar true hua then value filled in cell then niche
				
				grid[row][col]=val; // then agar upr val true h fir([row][col]) me val(number) rkh denge and cell me value fill krdi then niche
				Sudokusolver(grid, row, col+1);//next cell ki call lgadenge //Sudokusolver+ctr+space type then niche wala arrow click krne pr method autofill hoga
				grid[row][col]=0; //undo ->backtrack kiya hai bcoz if in case previous value pr jakr usko wapas change krna pda then use wapis empty(0) krna pdega
				}
			}
			
		}
	}
	public static boolean isitpossible(int[][] grid, int row, int col, int val) {
		// TODO Auto-generated method stub
		//for checking entire row
		int c = 0;
		while(c<9) {
			if(grid[row][c]==val) {
				return false;
			}
			c++;
		}
		
		//for entire column
		int r =0;
		while(r<9) {
			if(grid[r][col]==val) {
				return false;
			}
			r++;
		}
		
		//3*3 Matrix
		r=row-row%3;
		c=col-col%3;
		for (int i = r; i <r+3; i++) {
			for (int j = c; j < c+3; j++) {
				if(grid[i][j]==val) {
					return false;
				}
				
			}
			
		}
		return true;
	}
	public static void Display(int [] [] grid) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
	}
}
