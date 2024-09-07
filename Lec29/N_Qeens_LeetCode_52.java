package Lec29;

import javax.crypto.interfaces.DHPublicKey;

public class N_Qeens_LeetCode_52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		boolean [][] board = new boolean[n][n];  //boar n*n ki matrix h
	
		PrintPath(board,0,n);
	}
	public static void PrintPath(boolean [][] board, int row , int tq) {
		//tq(total queen) = n(4)
		if(tq==0) { //base case where tq 0 hote hi possible o/p ayega
			Display(board);
			return;
		}
		if (row==board.length) { //range ke bhr na aye place queen
			return;
		}

		for (int col = 0; col < board.length; col++) { //bloard ki jitni length hogi utni recursive call lgegi
			if(isitpossible(board,row,col) == true) { //see in isitposible methode //agr yha queen place kr skte h then agar ye true hoga then niche wali line chlegi
				board[row][col]=true; //agr 1 queen place ho gyi then niche
				PrintPath(board,row+1,tq-1);// queen -1 hoga
		
				board[row][col]=false; //undo//backtracking bcoz we have to u
			}
		
	}		
}
	public static boolean isitpossible(boolean[][] board, int row, int col) {
		// TODO Auto-generated method stub
		//upper case
		int r =row;
		while(r>=0) {
			if(board[r][col]==true) {
				return false ;
			}
			r--;
		}
		//left diagnol
		 r =row;
		int c =col;
		while(r>=0 && c>=0) {
			if(board[r][c]==true) {
				return false ;
			}
			c--;
			r--;
		}
		//right diagnol
				 r =row;
				 c =col;
				while(r>=0 && c<board.length) {
					if(board[r][c]==true) {
						return false ;
					}
					c++;
					r--;
    	}
				return true;
	}
	public static void Display(boolean[][] board) {
		// TODO Auto-generated method stub
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
			}
			System.out.println("*******************");
			}
		}
	


