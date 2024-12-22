package Lec39;

import Lec38.DynamicStack;

public class Queue_Using_Stack {

	public DynamicStack data; // Storage ke liye DynamicStack class ko data name se use kr rhe hai
	
	public Queue_Using_Stack() {
		this.data = new DynamicStack(); //data member ko initialize kr rhe hai
		
	}
	public boolean isEmpty() {
		return this.data.isEmpty();
	}
	public int size() {
		return this.data.size();
	}
	public void Enqueue(int x) throws Exception {
		this.data.push(x);
	}
	
	public int Dequeue() throws Exception {  // see steps in notebook
		DynamicStack temp = new DynamicStack(); // Step 1
		while (this.data.size() !=1) {  //Step 2
			temp.push(this.data.pop()); //Step 2 //temp.push - isse temp me original data ayega until !==1 //data.pop - isse original stack se data niklega until !=1
		}
		int x = this.data.pop(); //step 3
		while (temp.size() !=0) { //step 4
			this.data.push(temp.pop()); // step 4
		}
       return x; //means x nikl gya
	}
	//------------------------------
	
	public int getFront() throws Exception { 
		DynamicStack temp = new DynamicStack();
		while (this.data.size() !=1) {
			temp.push(this.data.pop());
		}
		int x = this.data.peek();
		while (temp.size() !=0) {
			this.data.push(temp.pop());
		}
       return x; //means x nikl gya
   }

}

