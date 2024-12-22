package Lec39;

public class Client_Stack_Using_Queue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Stack_Using_Queue st = new Stack_Using_Queue(); // object bna diya Stack_Using_Queue ka
		
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		
		System.out.println(st.peek()); //50
		st.Display();
		System.out.println(st.pop()); // 50 nikljaega
		st.Display();                // now stack me 40 30 20 10 bchega
		System.out.println(st.peek()); //40

	}

}
