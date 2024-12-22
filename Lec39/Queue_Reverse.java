package Lec39;

import Lec38.DynamicQueue; //Lec 38 me DynamicQueue wali class ki properties ko use krenge isliye import kiya h

public class Queue_Reverse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// Queue java me inbuilt interface h and interface ko new nhi kr skte and isliye java me inbuilt queue ko abhi ke liye use nhi kr paenge
		
		DynamicQueue dq = new DynamicQueue();
		
		dq.Enqueue(10);
		dq.Enqueue(20);
		dq.Enqueue(30);
		dq.Enqueue(40);
		dq.Enqueue(50);
		
		System.out.println(dq);
		System.out.println("***********************");
		Reverse(dq);   //method call
		dq.Display();  //Display method call to print
	}

	private static void Reverse(DynamicQueue dq) throws Exception { // see in notebook
		
		if(dq.isEmpty()) {  // Queue Empty hote hi
			return;         // " dq.Enqueue(x); " wali line chlegi and elements reverse form me return hojayenge
		}
		int x = dq.Dequeue(); // Queue me se elements niklenge
		Reverse(dq);          //recursive call
		dq.Enqueue(x);        // Queue Empty hote hi "return" wali line chlegi and queue ka data reverse form me insert hojaega
		
	}

}
