package Lec11;

public class Insersion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3,5,2,4,6 };
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}

	public static void Sort(int[] arr) {
                                                //single element always sort hoga due to this reason loop 1 se start hoga
		for (int i = 1; i < arr.length; i++) {   // i=1 is for index no.1
			int picked = arr[i];                 // hand picked card(i)  **picked = i
			int j = i - 1;                       // by this j will be 1 index befor i
			while (j >= 0 && arr[j] > picked) {  //j only compares with picked(i) //this will not work for 3,5 bcoz 3>5 whick is wrong "this is when i=1"
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = picked;                  // then i which is 5 it will be 5 according to this code "for i=1"

		}
		
	}

}
//"this is when i=2"(index no.2 which is 2 ---  3,5,2,4,6 --- 3,5,5,4,6 ----- 3,3,5,4,6 ---=> 2,3,5,4,6
//"this is when i=3"---so on
