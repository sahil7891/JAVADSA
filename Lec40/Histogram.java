package Lec40;

import java.util.Stack;

public class Histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,3,5,4,6,1,7};
		System.out.println(Area(arr));
	}
	public static int Area(int[] arr) {
		
		Stack<Integer> st = new Stack<>(); // st name ka new stack liya h
		int ans =0;
		for (int i = 0; i < arr.length; i++) { // i == index no. of arr
			
		while(!st.isEmpty() && arr[i] < arr[st.peek()]) {
			
					int r = i;  //r-> right
					int h = arr[st.pop()]; //Stack se peek wala element pop hoga and "h" me stack ka peek wala element ajaega (eg:-5 , for index no. 2)
					
					if(st.isEmpty()) {  // ye wali line tb chlegi jb stack khali hoga
						ans = Math.max(ans, h*r); //Math.max ki help se ans me jo highes value aegi whi ans me store rhegi 
					}
					else {
						int L = st.peek(); //L "left" ko dinote kr rha hai means stack me  ab jo element top pr hoga (eg:- 5niklne ke bd , ab 1st index bchega) isliye 1st index left minimum ko show kr rha hoga (eg:- 1st index(L = 1) for calculating area of 2nd index)
						ans = Math.max(ans, h*(r-L-1)); 
				}
		}
		st.push(i);
			}
		
		//jb upr wala "for loop" arr.length tk chl jaega then ye niche wala code chlega "Stack me bche hue elements ke liye"
		//"Stack me bche hue elements ke liye" niche wala code hai See in notebook
		int r = arr.length;
		while(!st.isEmpty()) { //Stack se peek wala element pop hoga
			int h = arr[st.pop()]; //Stack se peek wala element pop hoga
			
			if(st.isEmpty()) { // ye wali line tb chlegi jb stack khali hoga
				ans = Math.max(ans, h*r); //Math.max ki help se ans me jo highes value aegi whi ans me store rhegi 
			}
			else {
				int l = st.peek(); //l "left" ko dinote kr rha hai means stack me jo element top pr hoga wo left minimum ko show kr rha hoga
				ans = Math.max(ans, h*(r-l-1)); 
		}
			
	  }
		return ans;
		
	}
 
  }


