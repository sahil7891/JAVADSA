package Lec25;

public class Queen_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean [] board = new boolean[4]; // boolean ka Array/board liya ab by default array me false fill hoga 
		// boolean ke array  me by default false fill hota h// jis jis cell me queen present h wo true hoga baki array ke cell false

		int n = 2; //n = number of queen
		Queen(board, n,0," "); //board is for array
	}
	public static void Queen(boolean [] board, int tq , int qpsf, String ans) {
   // tq = total queen (n) 2 
   //qpst = queen placed so far // ye maximum 2 pr base case hit hoga bcoz 2 queen h
  // str for ans ,ans will be printed
		if(tq==qpsf) { //base case
			System.out.println(ans);
			return;
		}
		for (int i=0; i<board.length; i++) {
		if(board[i]==false) { //if queen is not present // or queen is not placed means F in array cell
			
			board [i] = true;  //then we can place queen there
		    Queen(board,tq,qpsf + 1, ans+"b" +i+"q" +qpsf+" "); //and the queen is placed there //b is for board see in notebook
		board [i] = false;// un do (backtracking) krna  // true(T) ko wapas false(F) kr rhe h // queen is not present or placed krna wapis
		}
		
	}
  }
}