 package Lec21;

public class First_Occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {2,5,7,2,3,9,5,6,3,9,3};
		System.out.println(FistIndex(arr,0,3)); 
	}
	public static int FistIndex(int []arr,int i, int item) { //arr wali line array ka addres bhejegi // i=0 // item=3 see in syso line
		 if(i==arr.length) {
			 return -1;       //if i ki value array ki lenght se zada hogyi toh "return -1" and -1 print hoga (return -1 main me jayega)  
		 }
		 if(arr[i]==item) {  // array me i ki value item(3) ke equal hogi toh "return i" wali line chlegi
			 return i;      //return the index of i(output)
		 }
		 return FistIndex(arr,i+1,item);
		 
		 
		 }
	}

//output me 3 ka index no. find ho rha h array me se which is 4
// if array me 3 available nhi hota toh -1 return hota
//Tail recursion
