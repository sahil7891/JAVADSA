  package Lec14;

import java.util.Scanner;

public class Divisible_Subarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt(); //size of array Eg 5
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
				System.out.println(GoodSubArray(arr));
			
		}

	}

	public static long GoodSubArray(int[] arr) {
		int n = arr.length;
		long[] frq = new long[n];
		long sum = 0;
		frq[0]=1;
		for (int i = 0; i < frq.length; i++) {//reminder wala part eg=2,3,0,1,0 see in notebook 
			sum = sum+ arr[i];  //sum = sum+arr[i]
			int idx =(int)( sum % n);
			if(idx<0) {
				sum+=n;
			}
			frq[idx]=frq[idx]+1;

		}
		long ans =0;
		for(int i = 0; i<frq.length; i++) {
			if(frq[i]>=2) {
				ans = ans + (frq[i]*(frq[i]-1)) / 2;  //Nc2 wala formula
				
				
			}
		}
		return ans; 
									
		
    }

}

// input = 5
// intput = 1 2 3 4 6
// o/p =1






















