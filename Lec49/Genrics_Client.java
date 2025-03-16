package Lec49;

import java.util.ArrayList;

public class Genrics_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // CASE 1   //yha case 1 me dono me se koi ek hi line uncomment kr skte h eg- integer or String me se and Genrics_Demo wali class se case 1 wale ko uncomment krke case2 wale ko comment out krna pdega

//		Genrics_Demo<Integer> g = new Genrics_Demo<>();  // yha hmara x,y  "Integer" me conver ho gya
//		Genrics_Demo<String>  g = new Genrics_Demo<>();  // yha hmara x,y  "String"  me conver ho gya
//      indo me se kisi ek line ko uncomment kr skte h
		
		
		//CASE 2
		Genrics_Demo<Integer,String> g = new Genrics_Demo<>();      // yha X "Integer" me convert hoga  &&  String Y ko point krega see in "Genrics_Demo class" 
		
		
	    //--------------------		
		LinkedList_Generic<String> ll = new LinkedList_Generic<>(); // yha hme LinkedList_Generic class me LinkedList ko Generic bna diya  // <String>  iski help se LinkedList me String ko add kr rhe h
		ll.Addlast("Ram");
		ll.Addlast("Raj");
		ll.Addlast("Ranjan");
		ll.Addlast("Raju");
		
		ll.Display();
		
		//--------------------
		
	  //ArrayList<Integer> ll = new ArrayList<>();   // <Integer>   <- it means ki ArrayList - Integer type ka h

		ArrayList list = new ArrayList<>(); //yha "ArrayList list" ke bich me __angular bracket__ nhi likha eg:- ArrayList <Integer> list   isliye ab iss list me hm integer and string dono type ka data add kr skte h see below  
		
		list.add(1);
		list.add("Ritik");
		list.add(9.0);
		System.out.println(list); // now list me [1, Ritik, 9.0] add ho jaenge
		
		//unchecked unsave exception  <- on online judj - it means ki code me "Angular bracket"  missing h
	}

}
















