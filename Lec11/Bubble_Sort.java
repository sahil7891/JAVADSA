package Lec11;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,13,-4,5,1};
		Sort(arr);
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+  " ");
		}
	}

	public static void Sort(int[] arr) {

		for (int turn = 1; turn < arr.length; turn++) { // length ki value 5 h then ye 4 bar proceed krega
			for (int i = 0; i < arr.length - turn; i++) { // ye wala i hr line(digit) ke liye 0 se start hoga, last me
															// 13 yhi line pahucha rhi hai
				if (arr[i] > arr[i + 1]) { // if o/p ko decreasing order me krna hai to "greater than wala sign change
											// hoga"(arr[i]<arr[i+1]) istrha
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}
}

// 1st line =2,13,-4,5,1-->2,-4,13,5,1--->2,-4,5,13,1--->   final->2,-4,5,1,13
//2nd = 2,-4,1,5,13  so on