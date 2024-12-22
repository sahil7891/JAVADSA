package Lec39;

import java.util.Stack;

public class Stack_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>(); //integer means integer  data type ka array h //isme wraper/refer class ko rkhte h // isme sare non premitive data rkhte h
		
		st.push(10); //"push" se stack me 10 add hojaega
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50); 
		
		System.out.println(st);
		System.out.println("***********************");
		Reverse(st);
		System.out.println(st);
		  
	}
	public static void Reverse(Stack<Integer> st) { //st me 2k location capture hoga
		
		if(st.isEmpty()) { //check krega ki given stack empty hui ki nhi //isEmpty isliye liya h bcos Stack Dynamic hai
			return;
			
		}
		int x = st.pop(); // peek wale ko nikalega
		Reverse(st);      //recursive call 1
		Insert_Down(st,x);//Insert_Down function call hoga niche // x pop kiya hua data h
		
		
	}
	private static void Insert_Down(Stack<Integer> st, int x) {  // same class me private access ho skta h 
		// TODO Auto-generated method stub
		
		if(st.isEmpty()) { 
			st.push(x);
			return; 
		}
		int y = st.pop();
		Insert_Down(st, x); // recursive call 2
		st.push(y);			
		
	}

}




