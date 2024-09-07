package Lec27;

import java.util.ArrayList;
import java.util.List;

public class Combination_sum { //leetcode 39

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 6, 7 };// there no. should be different different
		int amount = 7;
		List<Integer> list = new ArrayList<>(); //argument me 1D list bhejne ke liye
		List<List<Integer>> ans = new ArrayList<>(); //1D list ko 2D list me dalne ke liye
		printcombination(arr, amount, list, 0 , ans); //ans 2D list ke liye h
	
		System.out.println(ans);
	}

	public static void printcombination(int[] arr, int amount, List<Integer> list, int idx, List<List<Integer>> ans) {
		if (amount == 0) {
			//System.out.println(list);
			ans.add(new ArrayList<>(list)); //*** sara data new location pr copy hoga (new ArrayList<>(list) then base case hit hone pr run hoga bcoz "backtracking" ki wjh se ans ke elements subtract ho rhe h
			// 1D list ka address 2D list rkhke  print krne ke liye base case hit hote hi //(new ArrayList<>(list) isse original list me change nhi ayega new list creat hogi hr bar
			
			
			return;
		}
		for (int i = idx; i < arr.length; i++) {
			if (amount >= arr[i]) {
				list.add(arr[i]); // ye 1d list me add krega
				printcombination(arr, amount - arr[i], list, i, ans);
				list.remove(list.size() - 1);   //Backtracking  , see in notebook
			}
		}

	}

}
