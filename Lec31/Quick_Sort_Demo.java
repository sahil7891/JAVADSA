package Lec31;

public class Quick_Sort_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {7,5,3,1,9,4};
		int idx= index(arr,0,arr.length-1); //method call
		System.out.println(idx); // o/p me 4 ka index no.
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" , ");
		}
		
	}
	public static int index(int [] arr, int low, int high) {
		//low= index no. 0 // high= last index 
		int last_element= arr[high];
		int idx=low; // see in notebook
		for(int i=low; i<high; i++) {
			if(arr[i]<=last_element) { //for swaping //pehle ye wala loop pura chlega then int t =arr[idx]; wali line chlegi
				// swap between = i and idx
				int t = arr[i];
				arr[i] = arr[idx];
				arr[idx]=t;
				idx++;
			}
		}
		// swap between = idx and high 
		int t  = arr[idx];
		arr[idx] = arr[high];
		arr[high] = t;
		return idx; // idx ka index return ho rha hai pritn krne ke liye which is 2
		
			

	}

}
