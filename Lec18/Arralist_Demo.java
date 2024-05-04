package Lec18;
import java.awt.List;
import java.util.*;
import java.util.ArrayList;

public class Arralist_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		
		// Add -- last me add karega
		list.add(10);
		list.add(20);
		System.out.println(list);
		
		//add at index
		// range 0 to size
		list.add(0,30); // index 0 pr 30 print hoga
		System.out.println(list);
		System.out.println(list.size());
		
		list.add(2,90); // index 2 pr 90 print hoga
		System.out.println(list);
		
		//delete
		//range 0 to size -1
		System.out.println(list.remove(1)); // print 10  , 1 is index
		System.out.println(list); // rest of the array printed accept 10

		list.add(60);
		list.add(-20);
		System.out.println(list); // it will include 60,-20 in arraylist
		
		
		//get
		//range 0 to size -1
		System.out.println(list.get(3));// will print 60
		System.out.println(list);
		
		//set --> update index pe jaa kr
		list.set(1, -5);  // index 1 pr -5 print hoga
		System.out.println(list);
		for (int i = 0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");//arr[i]
		}
		System.out.println();
		
	
         for(int i = list.size()-1; i>=0; i--) {
	       System.out.print(list.get(i)+" ");//arr[i] print in reverse order
}
         System.out.println();
         
         // Enhance for loop(EFL)
         for (int val : list) {
        	 System.out.print(val+" ");
         }
         System.out.println();
         int [] arr = {10,20,30};
         for(int Sumaiya:arr) {
        	 System.out.print(Sumaiya+" ");
         }
         System.out.println();
         
         //Array.sort(arr)
         Collections.sort(list);//sort  , it will sort out the arraylist
         System.out.println(list);
         }
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
		
		
		
		
		
		
		
		
		
		
	


