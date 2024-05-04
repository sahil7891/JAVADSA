package Lec9;

public class Maximum_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,-3,90,7,-9,79,-18,902};
		System.out.print(Maximum(arr));
	}
	public static int Maximum(int[] arr) {
		int min = arr[0];
		for (int i=1; i <arr.length; i++) {
			if (arr[i]>min) {
				min=arr[i];
			}
		}
		return min;

	}

}
