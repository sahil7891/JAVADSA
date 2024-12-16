package Lec38;

import Lec37.Queue;

public class DynamicQueue extends Queue { //To understanding purpose for eg:- yah DynamicQueue == child hai __&__ Queue == parent hai


	@Override
	public void Enqueue(int item) throws Exception {
		
		if(super.isfull()) {
		int[] arr = new int [2*super.data.length]; //Queue ka size double ho jaega
			
			for(int i = 0; i<data.length; i++) {
				int idx = (this.front + i) % this.data.length; //queue ke form me data rkhne ke liye
				arr[i] = data[idx]; //new size wale queue me purana data daldega
			
			}
			this.data = arr; // ye line data me arr ka adderss daldega
			this.front = 0;  // front index no 0 pr set hojaega
		}
		super.Enqueue(item); //Enqueue ki help se Queue me data or element dalskte hai and "super" ki help se parent class ka enqueue hoga
		
	}
}


//now ye Queue dynamic h jisme elements ke according Queue ka size increase ho rha hai
