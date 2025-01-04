package Lec40;

import java.util.Stack;

public class Next_Greater_Element { //Comlexity == O(N)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 11, 2, 3, 23, 13, 9, 15 };
		NGE(arr);
		
		}
		public static void NGE(int[] arr) {
			
			int [] nge = new int [arr.length]; // Step 1 //array leliya
			Stack<Integer> st = new Stack<>(); // ek stack leliya
			
			for (int i = 0; i < arr.length; i++) { // i= index // ye loop jitne elements h utni br chl rha hai isliye comlexcity O(N) hai
				//nge
				while(!st.isEmpty() && arr[i]> arr[st.peek()]) { //!st.isEmpty() - ye check krega ki stack khali h ki nhi // isEmpty && i>peek <-- jb ye dono true honge then while loop ke niche ye dono line --> ii=st.pop and ii= arr[i]  chalegi
					//1st iteration me-> i =0 me 11 ajayega eg:- i=11 and (!st.isEmpty())-then ye stack khali hai isliye -(st.push(i))<- ye line chlegi and iski wjh se Stack me index no 0 (11) jaye
					//2nd iteration me-> (arr[i])-  yha i me 2 aega && (arr[st.peek()) isme peek me 11 aega and ye false hoga then //st.push(i) - iski help se stack me index no 1 (2)bhi ajaega
					//3rd iteration me-> (arr[i])- yha i me 3 aega && (arr[st.peek()) isme 2 aega and ye true hoga then // int ii = me stack ka index (eg:-"stack ke top index jo ki ""1st"" index hai wha pr 3 hai)see in notebook 3rs iteration and isliye "nge[ii]=arr[i]" ki help se ""array"" me 1st index me 3 ayaega      
					//Another eg for 3rd iteration :- (int ii=st.pop();) ->stack ke index no 1 me (eg-3)) hai// and (nge[ii] = arr[i]) -iski help se array me index no 1 pr 3 ajaega means same stack wala format array ma cope hogega // jb while loop chlega then array me stack wale elements add honge
					// so on
					int ii = st.pop(); //stack ka top index pop kr rhe hai bcoz uss index ka next greater element mil gya h
					nge[ii] = arr[i]; // nge wale array ke index me element store kr rhe hai
					
				}
				st.push(i);
			}
			while(!st.isEmpty()) { // ye loop last me bche hue Stack ke sare elements ki value -1 krdega
				int ii = st.pop();
				nge[ii] = -1;
				
		}
		  for (int i = 0; i < nge.length; i++) { //ek ek krke sare elents ko print krane ke liye
			  System.out.println(arr[i] +"   " + nge[i] ); //arr[i] <- isse original array ke elements print honge  //  nge[i] <-- isse stack ke corespondin jo value aegi wo elements print honge
			  
		}
				
	}

}
