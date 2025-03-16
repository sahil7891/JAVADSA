package Lec49;

public class Function_Demo_Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] arr = { 10, 20, 30, 40, 50, };
		
		Integer[] arr = { 10, 20, 30, 40, 50, }; //now hmne ise non primitive bna diya "Integer" likhkr then hm niche display method ko Generic bna skte h  
		display(arr);
		
		String [] arr1 = {"Ram" , "Raj" , "Riya" , "Rahul" , "Priya" , "Pankaj"}; //String toh already non primirive data h
		display(arr1);
	}	
	//--------------------------
	
	public static <T> void display(T[] arr) {  //  <T>   - it means hmne iss display method ko Generic bna diya then // T[]  <- now isse upr display method ko call krne pr yha - T[] - isme - T  - (Integer ya Stirng) me automatically convert hojaega // yha T ke bdle A ya fir Kuch bhi likh skte h   
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");	
		}
		System.out.println();	
	}
}





















