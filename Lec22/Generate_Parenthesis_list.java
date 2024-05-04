package Lec22;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parenthesis_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		List<String> list = new ArrayList<>();  //ye line list ko return krne ke liye likhi h "list and arraylist me d/f hota h"
	   //List<String> => String likha h bcoz List me String return kr rhe h
		Parenthesis_leetcode(n,0,0," " ,list);
	    System.out.println(list);
	
	}

	public static void Parenthesis_leetcode(int n, int opening, int closing, String ans , List<String> list) { // List<String> list ==>ye line list ko return krne ke liye likhi h "list and arraylist me d/f hota h"
		// TODO Auto-generated method stub
		if(opening == n && closing == n) {
			//System.out.println(ans);
			list.add(ans); // adding ans in list
			return;
		}
		if(opening<n) {
			Parenthesis_leetcode(n, opening +1, closing, ans +"(" , list); 
		}
		if(closing<opening) {
			Parenthesis_leetcode(n, opening , closing+1, ans +")",  list);
			
		}
	}

}
//Leetcode22
//for  returning list
//see notebook