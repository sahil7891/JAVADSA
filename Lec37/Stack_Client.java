package Lec37;

public class Stack_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Stack s = new Stack();  //eg Stack ka size == 5
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		System.out.println(s.pop()); //ye stack se 50 ko nikal dega		
		s.Display();                 // stack print hogi
		System.out.println(s.peek());// ab stack me peek 40 print hoga bcos 50 ko pop line me extract kr diya h means wo stack se ht gya h
		
		s.push(60); //stack me 40 ke baad 60 add ho jayega
		s.push(70); // stack ka size 5 hai and 60 ke bad 70 ko dalenge toh 'Stack' wale class me push wale code me 'Exception' wali line chl jaegi

	}

}


//basically hm stack ko array ki help se bna rhe hai bt ye baat hmare client ko nhi pta chalni chahiye


//s.push(70); => iska output => Exception in thread "main" java.lang.Exception: Sun be pgl hai?, Stack full hogya hai
                               //at Lec37.Stack.push(Stack.java:26)
                               //at Lec37.Stack_Client.main(Stack_Client.java:20)