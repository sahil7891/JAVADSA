package Lec8;

public class Array_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[5];
			
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		arr [0]=10;
		arr [1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		System.out.println(arr.length);       //"arr.length" to check the size of the array

		//for(int i=0; i<arr.length; i++) {
		//	arr[i]=(100) * (i+1);
		         //or
		for(int i=0; i<arr.length; ) {
			arr[i]=(100) * (i+1); // here 100*1 then 100* then 100*3 and so on
			i++;
			
		}
		for(int i=0; i<arr.length; i++ ) {
			
			System.out.println(arr[i]);
		}
		
	}

}
