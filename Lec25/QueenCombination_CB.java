package Lec25;

public class QueenCombination_CB { //Done in CB live

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int tq = 2;
		boolean[] board = new boolean[n];
		Combination(board, tq, 0, "");

	}

	public static void Combination(boolean[] board, int tq, int qpsf, String ans) { // qpsf = queen placed so far
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				Combination(board, tq, qpsf + 1, ans + "b" + i + " q " + qpsf);  //"b" o/p me km space ayega// "  b  " o/p me jada space ayega
				board[i] = false;
			}
		}

	}

}
