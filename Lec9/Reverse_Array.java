package Lec9;

public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]arr= {23,4,5,67,89,10,12};
		ReverseArray(arr);
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void ReverseArray(int[]arr) {
		int i=0;
		int j=arr.length-1;
		while (i<j) {       // condition
			int temp=arr[i];        //SWAPING
			arr[i]=arr[j];         //SWAPING
			arr[j]=temp;           //SWAPING
			i++;
			j--;
		}
	}
}

// is code me swaping  ho rhi hai examp.
//23,4,5,67,89,10,12
//23&12
//4&10
//5&89 then the fina outpu is 12 10 89 67 5 4 23 