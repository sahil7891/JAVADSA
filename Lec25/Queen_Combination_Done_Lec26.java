package Lec25;

public class Queen_Combination_Done_Lec26 { //Final

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean [] board = new boolean[4]; // boolean ka Array/board liya ab by defoult false fil hoga 
		// boolean ke array  me by default false fill hota h// jis jis cell me queen present h wo true hoga baki array ke cell false

		int n = 2; //n = number of queen
		Queen(board, n,0," ",0);
	}
	public static void Queen(boolean [] board, int tq , int qpsf, String ans, int idx) {
   // tq = total queen (n) 2 
   //qpst = queen placed so far // ye maximum 1 tk jaega bcoz 2 queen h 2 pr base case hit hoga
  // str for ans ,ans will be printed
 // idx = index no. 0
		if(tq==qpsf) {
			System.out.println(ans);
			return;
		}
		for (int i=idx; i<board.length; i++) { // i=idx which is index
		if(board[i]==false) { //if queen is not present // or queen is not placed means F in array cell
			
			board [i] = true;  //then we can place queen there
		    Queen(board,tq,qpsf + 1, ans+"b" +i+"q" +qpsf+" ",i+1);//i+1 isme code i+1 index se chlega where i=index //and the queen is placed there //b is for board see in notebook
		board [i] = false;// un do (backtracking) krna  // true(T) ko wapas false(F) kr rhe h // queen is not present or placed krna wapis
		}
		
	}

  }

}
//Queen combination same "/Queen permutation ki trh same h bs isme same permutation print nhi honi chahiye
// EG. b0q0 b1q1  and b1q0 b0q1 in dono me se koi ek hi print hona chahiye











