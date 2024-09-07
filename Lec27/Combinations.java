package Lec27;

import java.util.ArrayList;
import java.util.List;

public class Combinations { //leetcode 77

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean [] board = new boolean[4]; // boolean ka Array/board liya ab by defoult false fil hoga 
		// boolean ke array  me by default false fill hota h// jis jis cell me queen present h wo true hoga baki array ke cell false

		int n = 2; //n = number of queen
		List<Integer> list = new ArrayList<>(); //1D list
		List<List<Integer>> ans = new ArrayList<>(); //2D list
		printcombination(board, n,0,0,list, ans);
		System.out.println(ans);

	}
                                                  // string ko 1d list se replace kiya (List<Integer> list)          //1D list ko 2D list me daldiya List<List<Integer>> ans
	public static void printcombination(boolean [] board, int tq , int qpsf, int idx,List<Integer> list, List<List<Integer>> ans) {
		   // tq = total queen (n) 2 
		   //qpst = queen placed so far // ye maximum 1 tk jaega bcoz 2 queen h 2 pr base case hit hoga
		  // str for ans ,ans will be printed
		 // idx = index no. 0
				if(tq==qpsf) {
					System.out.println(list);
					ans.add(new ArrayList<>(list));
					return;
				}
				for (int i=idx; i<board.length; i++) {
				if(board[i]==false) { //if queen is not present // or queen is not placed means F in array cell
					
					board [i] = true;  //then we can place queen there
				    list.add(i+1);
				    printcombination(board,tq,qpsf + 1,i+1,list,ans);//ans +(i+1)index 1 ko base manne ke liye h //and the queen is placed there //b is for board see in notebook
				list.remove(list.size()-1);
				board [i] = false;// un do (backtracking) krna  // true(T) ko wapas false(F) kr rhe h // queen is not present or placed krna wapis
				}
				
			}
}
}









