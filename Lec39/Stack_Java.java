package Lec39;

import java.util.Stack;    // ******hme ye wala ->" java.util."  Stack use krna h bcause ye inbuilt (Library)/(framework) hota h java me // Ye Stack Dynamic hoti h means jitne element dalo usi hisab se stack ka sizr bdhega // Stack inbuilt libarary h java me // "Library" means == Inbuilt(bni bnai chij in java)*******

public class Stack_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> st = new Stack<>(); //integer means integer  data type ka array h //isme wraper/refer class ko rkhte h // isme sare non premitive data rkhte h
		st.push(10); //"push" se stack me 10 add hojaega
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		st.push(70);
		
		System.out.println(st.peek()); // "peek" se stack me sbse upr konsa data h ye pta chlega //70
		System.out.println(st);// stack and arraylist me toString methode @Override hota h isliye ye Stack print ho jati h
		System.out.println(st.pop());  // pop krne pr peek pr jo data hoga wo nikl jaega eg- 70
		System.out.println(st);  // up stack me 10, 20, 30, 40, 50, 60 bchega
		System.out.println(st.size()); // stack ka size pta krne ke liye
		System.out.println(st.isEmpty()); // stack khali h ya nhi pta krne ke liye
				

	}

}
