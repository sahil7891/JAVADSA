package Lec30;

public class Merge_Two_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {3,5,7,9,11};
		int [] arr2 = {1,2,3,4,6,7};
		
		int [] ans = MergeTwo_Sorted_Array(arr1,arr2); //return ans ka me 1D array ko store kiya then
		for (int i = 0; i < ans.length; i++) {//loop laga kr print kr diya
			System.out.print(ans[i]+" ");  //o/p me dono array ka single sorted arrat print ho rha hai  
		}
	}
	public static int [] MergeTwo_Sorted_Array (int[]arr1 , int []arr2) {
		
		int n = arr1.length;
		int m = arr2.length;
		int [] ans = new int [n+m]; 
		int i=0;// arr1 ka index track rhega
		int j=0;// arr2 ka index track rhega
		int k=0;// ans n+m
		
		while (i<n && j<m) {
			
			if(arr1[i] <= arr2[j]) { // agar i bda hua the ans me i add hoga
				ans[k] = arr1[i];
				k++;
				i++;//i ka index bdhega
			}else {
				ans[k] = arr2[j];// agar j bda hua the ans me j add hoga
				j++;//j ka index bdhega
				k++;
				
			}
		}
		while(i<n) {
		ans[k] = arr1[i]; //last me agar i wala array bcha the wo pura print hoga
		k++;
		i++;
		
	}
		while(j<m) {
			ans[k] = arr2[j];//last me agar j wala array bcha the wo pura print hoga
			j++;
			k++;
		}
		return ans; //1D array ka address return hoga
  }

}
