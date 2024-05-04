package Lec12;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 5, 8, 9, 12, 14, 15, 16, 17 };
		
		System.out.print(Search(arr, 14));

	}

	public static int Search(int[] arr, int item) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == item) {
				return mid;

			} else if (arr[mid] > item) {
				high = mid - 1;

			} else {// arr[mid]<item
				low = mid + 1;
			}
		}
		return -1;  //this is for if the given element(item) is wrong or not exist 
	}

}

//output is the index of given item
