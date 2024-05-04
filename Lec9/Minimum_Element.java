package Lec9;

public class Minimum_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10,-3,90,7,-9,79,-18,902};
		System.out.print(Minimum(arr));
	}
	public static int Minimum(int[] arr) {
		int min = arr[0];
		for (int i=1; i <arr.length; i++) {     //yha "i" ko 10 assume kiya h,means i 10 ho jayr ga
			if (arr[i]<min) {      //yha "i" se next element compare ho rha h ,   Maximum find krme ke liye ">" ajayega yha
				min=arr[i];    //yha i update hoga
			}
		}
		return min;
	}

}
