package Lec31;

public class Merge_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {7,3,2,15,7,1};
		int [] ans = mergesort(arr , 0, arr.length-1);
		
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}
	public static int [] mergesort(int [] arr, int low , int high) {
		if(low == high) {
			int [] a = new int [1];
			a[0] = arr[low];
			return a;
		}
		int mid = (low+high)/2; //mid
		
		int [] fs = mergesort(arr,low,mid); // first half array ko sorted or solve  krne ke liye recursive call// fs= first half is sorting 
		int [] ss = mergesort(arr,mid+1, high);// second half sorted array ko sorted or solve krne ke liye recursive call// ss= second half ki sorting
		return MergeTwo_Sorted_Array(fs,ss); 
	}

	
public static int [] MergeTwo_Sorted_Array (int[]arr1 , int []arr2) {  // ye wala methode Lec 30 se liye hai see in Lec 30
		
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


