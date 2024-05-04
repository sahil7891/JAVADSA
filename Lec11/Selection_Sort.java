package Lec11;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,13,-4,5,1};
		Sort(arr);
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
		}

	public static void Sort(int[]arr) {
		
		for (int i=0; i<arr.length; i++) {    // for next element
		
		int mini=i;  // it means index(0,1,2,3,4) 0th index is 2 from data // if for value --mini=arr[0]
		for (int j=i+1; j<arr.length; j++) {
			if(arr[j]<arr[mini]) {
				mini= j;   // yha mini me -4(j) store hoga for first element , isme 2\2 se comparison hoga
				
			}
		}
		int temp =arr[i];
		arr[i]=arr[mini];
		arr[mini]=temp;
		}
	}

}

// is code me swaping ho rhi hai eg
//  2,13,-4,5,1  = -4,13,2,5,1  ( yha 2& -4 me swaping hui hai) we should say index 0 & 2 ke bich swaping h
// this will continue till i=4
