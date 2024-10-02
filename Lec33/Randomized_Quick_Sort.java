package Lec33;

import java.util.Random;

public class Randomized_Quick_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {7,5,3,1,9,4};
		//	int idx= Partition(arr,0,arr.length-1); //method call
		//	System.out.println(idx); // o/p me 4 ka index no.

			QueckSort(arr , 0, arr.length-1);
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" , ");
			}
			
		}
		public static void QueckSort(int [] arr, int low, int high) {
			if(low>=high) {
				return;
			}
			int idx = Partition(arr,low ,high);  // demo wale code ke o/p 3 , 1 , 4 , 5 , 9 , 7 in which 4 is idx and the index no. of 4 is 2 then niche wale code ka stack frame bhi isi ke according bnega and final o/p =1 , 3 , 4 , 5 , 7 , 9
			
			QueckSort(arr,low,idx-1); //left wale ko sort krne ke liye
			QueckSort(arr,idx+1,high);//right wale ko sort krne ke liye

			
		}
		public static int Partition(int [] arr, int low, int high) {
			//low= index no. 0 // high= last index 
			Random_number(arr, low, high);  // function call
			int pivot= arr[high];
			int idx=low; // see in notebook
			for(int i=low; i<high; i++) {
				if(arr[i]<=pivot) { //for swaping //pehle ye wala loop pura chlega then int t =arr[idx]; wali line chlegi
					// swap between = i and idx
					int t = arr[i];
					arr[i] = arr[idx];
					arr[idx]=t;
					idx++;
				}
			}
			// swap between = idx and high 
			int t  = arr[idx];
			arr[idx] = arr[high];
			arr[high] = t;
			return idx; // idx ka index return ho rha hai pritn krne ke liye which is 2
			 

	}
		public static void Random_number( int []arr, int si,int ei) {     // uper wala code same quick sort wala hai and ye code random no. wala h
			
			Random rand = new Random(); // " new Random(); " isme arr bhejenge
			int lo = si;
			int hi = ei;
			int ri = rand.nextInt(hi-lo+1)+lo; // ye random index ke sath last element ki swapping kr dega
			int temp = arr[ei];
			arr[ei] = arr[ri];
			arr[ri] = temp;
			// is function se complexity "NlogN" milgi
				
			}
    	}

 
