package Lec11;

public class Array_Prodouct_itsElf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub{
		int[] arr = {2,5,7,4};
		int[] ans = product(arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

	public static int[] product(int arr[]) {
		int n = arr.length;
		int[] left = new int[n];
		int[] right = new int[n];
		left[0] = 1;  //-------------------------------
		for (int i = 1; i < n; i++) { //              |
			left[i] = left[i - 1] * arr[i - 1];  //index1=1, index2 1*2=2  ,ind3 2*5=10  ,ind4 10*7=70
			                                       //left array ki updated value ke sth "arr" multiply hora h

		}
		right[n - 1] = 1;
		for (int i = n - 2; i >= 0; i--) {
			right[i] = right[i + 1] * arr[i + 1];  //this will initialize from last index =index1 28*5=140, index2 4*7=28  ,ind3 1*4=4 ,ind4 =1
		}                                           //right array ki updated value ke sth "arr"  multiply hora h
		for (int i = 0; i < right.length; i++) {
			arr[i] = left[i] * right[i];
		}
		return arr;
	}

}
//