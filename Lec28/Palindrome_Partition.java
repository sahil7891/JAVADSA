package Lec28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Palindrome_Partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "nitin";
		//String str = " ";str=ans
		List<String> list = new ArrayList<>(); //1D list
		List<List<String>> ans = new ArrayList<>();
		PrintPartition(str,list,ans); //isme ans me empty string(" ") nhi diya bdle me 2D string dedi jisme list ko rkhenge
		System.out.println(ans);
	
	}
	public static void PrintPartition(String ques,List<String> list,List<List<String>> ans) {
		if(ques.length()==0) {
			//System.out.println(ans);
			ans.add(new ArrayList<String>(list)); //*** sara data new location pr copy hoga (new ArrayList<>(list) then base case hit hone pr run hoga bcoz "backtracking" ki wjh se ans ke elements subtract ho rhe h
			
		}
		for(int i =1; i<=ques.length(); i++) { //str(ques) ki jitni length hogi utni hi recursive call lgegi
	
			String s=ques.substring(0,i);  // ans me jo add ho rha th All_possible.. me //0,i => 0 substring ka index no. 0 start ho rha h // i varie kr kr rha hai code ke acording
			
			if(isPalindromeString(s)) {// isPalindrome call // eg. n|  iti|  n|   isme "iti" palindrome h then "if" wali line chlegi
				list.add(s);  // 1d list me store kr rhe hai //pehle str me store kr rhe the ab list me kr rhe hai
			PrintPartition(ques.substring(i),list,ans);
			list.remove(list.size()-1); 
		}
	
	}

}
   public static boolean isPalindromeString(String s) { //ye code Lec16 se liya h check krne ke liye ki palindrome h ki nhi
	    int i = 0;
	    int j = s.length() - 1;
	    while (i < j) {
		if (s.charAt(i) != s.charAt(j)) {
			return false;
		}
		i++;
		j--;
	}
	return true;
}

}










