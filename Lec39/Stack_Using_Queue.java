package Lec39;

import Lec38.DynamicQueue;

public class Stack_Using_Queue {    //using "pop" wala sir(sir wala) krwa rhe hai see in notebook
		
		private DynamicQueue data;// Storega ke liye dynamic queue wali class ko use kr rhe hai and uska name "data" rkha h
		
		public Stack_Using_Queue() { //ye constructor h
			
			this.data = new DynamicQueue();
					
	}
		public boolean isEmpty() {        //agar data me kuch nhi h then stack == isEmpty(false)
			return this.data.isEmpty(); 
					
		}
		public int size() {       //jitna dynamicqueue ka size hoga utna stack ka size hoga
			return this.data.size(); //dynamic queue class me size wale method ko call kiya h
		}
		                                    
		public void push(int item) throws Exception { // comlexity -> O(N)  // see steps in notebook for push method
			DynamicQueue temp = new DynamicQueue(); //Step 1 // temp == DynamicQueue (ye temprorat DynamicQueue h)
				while(! this.data.isEmpty()) { // ! ki help se jb tk Stack me element hoga tb tk loop chlega
					temp.Enqueue(data.Dequeue()); //Step 2 // temp.Enqueue ki help se temporary wali Stack(DynamicQueue) me element dal rhe hai // and data.Dequeue ki help se DynamicQueue se data ko nikal rhe hai and jb tk Stack me element hoga tb tk loop chlega
					
				}
				this.data.Enqueue(item);  //Step 3 // Stack khali hone ke bd input(item) ko stack me dalde// input diya hua data khali stack me push krde
				 
				while(! temp.isEmpty()) { //temp wale Stack me purana data hai yafir jb tk temp wala data khali nhi hota
					data.Enqueue(temp.Dequeue()); //Step 4 // tb tk original wale data me temp ka data dalde and temp wale data ko Dequeue krde
				}
			}
		public int pop() throws Exception{ // comlexity -> O(1) 
			return this.data.Dequeue();    // element ko nikalne ke liye
			
		}
		public int peek() throws Exception{
			return this.data.getfont();     // top pr konsa data h janne ke liye
		}
		public void Display() {            // print krane ke liye
			this.data.Display();
		}
}
	










