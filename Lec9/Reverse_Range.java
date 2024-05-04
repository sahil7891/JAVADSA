package Lec9;

public class Reverse_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 23, 4, 5, 67, 89, 10, 12, 55, 61, 75 };
		int i = 2;
		int j = 5;
		ReverseArray(arr, i, j);
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}

	public static void ReverseArray(int[] arr, int i, int j) {

		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
