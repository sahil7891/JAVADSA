 package Lec40;

import java.util.Stack;

public class Stock_Span {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {9,11,13,15,38,42,37};
		SPan_Cal(arr);
	}
	public static void SPan_Cal(int []arr) { //void ka meaning ki integer return kr rhe hai //upr static function ke under call krna hai isliye is function ka bhi static hona jruri h eg:- static --- static ke under hi call ho skta h         
		
		int [] span = new int [arr.length]; // new array leliya - span name ka
		Stack<Integer> st = new Stack<>();  // new stack leliye - st name ka
		
		for (int i = 0; i < arr.length; i++) { // i == index no. of arr
			
			
			//Span calculate
			while(!st.isEmpty() && arr[i]>arr[st.peek()]) {
				st.pop(); 
			}
			if(st.isEmpty()) {
				span[i] = i+1;  //1st itration me 0th index ka span i+1 hokr "1" ho jaega  //span[i] -- new array me calculated span ko ith index pr rkh rhe hai
			}
			else {
				span[i] = i-st.peek(); //4rth iteration me ye line chlegi see in notebook   //span[i] -- new array me calculated span ko ith index pr rkh rhe hai
			}
			st.push(i);
		}
		
		for (int i = 0; i < span.length; i++) {
			System.out.println(arr[i]+ " "+span[i]);
			
		}
	}
}

















