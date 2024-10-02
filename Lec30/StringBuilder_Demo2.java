package Lec30;

import java.util.ArrayList;

public class StringBuilder_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Hellollo"); //StringBuilder time complecity bchata hai //StringBuilder is more optimized  // SrtiringBuilder is more fast then string
		System.out.println(sb.capacity()); //yha capactiy 16 + length hoga 5 which will be 21

		ArrayList<Integer> list = new ArrayList<>(90);
		System.out.println(list); //array list ki capacity 90 hogi  furthe list full hone bd b grow kregi
	
		 System.out.println(sb.charAt(2));//to get the charecter
		    System.out.println(sb.substring(2));// index no 2 ke bd sb print hoga
	
		    System.out.println(sb.substring(2,5));// index no 2 to 5 tk print hoga
	}

}
