package Lec9;
import java.util.Scanner;
public class Linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i=0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
			
		}
		int item=sc.nextInt(); //search wala item
		for (int i=0; i<arr.length; i++) {
			
		}
		System.out.println();
		System.out.println(Search(arr,item));
	}

	public static int Search(int[] arr,int item) {
		for (int i=0; i<arr.length; i++) {
			if(arr[i]==item) {
				return i;
			}
		}
		return -1;
	}
}
//user input  = length of arr(eg=5)
//then give 5 array input (eg=1,2,3,4,5)
//then ask the number in array among(1,2,3,4,5) it will tell you the index no.
