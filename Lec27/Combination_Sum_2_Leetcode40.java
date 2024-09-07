package Lec27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum_2_Leetcode40 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,1,2,7,6,1,5};
		int target = 8;
		Arrays.sort(arr); //array ko sort kr rhe h bcos arr me same digit firse use ho skta hai eg. 1 do br use hua h
		List<Integer> list = new ArrayList<>(); //argument me 1D list bhejne ke liye
		List<List<Integer>> ans = new ArrayList<>(); //1D list ko 2D list me dalne ke liye
		printcombination(arr, target, list, 0 , ans); //ans 2D list ke liye h
	
		System.out.println(ans);
	}

	public static void printcombination(int[] coin, int amount, List<Integer> list, int idx, List<List<Integer>> ans) {
		if (amount == 0) {
			//System.out.println(list);
			ans.add(new ArrayList<>(list)); //*** sara data new location pr copy hoga (new ArrayList<>(list) then base case hit hone pr run hoga bcoz "backtracking" ki wjh se ans ke elements subtract ho rhe h
			// 1D list ka address 2D list rkhke  print krne ke liye base case hit hote hi //(new ArrayList<>(list) isse original list me change nhi ayega new list creat hogi hr bar
			
			
			return;
		}
		for (int i = idx; i < coin.length; i++) {
			if (i!=idx && coin[i]==coin[i-1]) { // this will check tha whether last element is not same eg. 1,1,2,3
				continue; // for next element
				//upr if and countinue wali code se permutation stop ho gyi
			}
			if(amount>=coin[i]) {
				list.add(coin[i]); // ye 1d list me add krega
				printcombination(coin, amount - coin[i], list, i+1, ans); // i+1 bcoz arr me jo no. h use ek hi br use kr skte h permutation nhi chahiye
				list.remove(list.size() - 1);   //Backtracking  , see in notebook
			}
		}

	}

}















