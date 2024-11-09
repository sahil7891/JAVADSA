package Lec36;

import java.util.Scanner;

public class Person_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
////		Scanner sc = new Scanner(System.in); //'Scanner(System.in)' ye bhi constructor hai // and puri line object hai
////		Person p = new Person();  // Person() - ye part CONSTROCTOR ko call krne ke liye use kiye hai  
//		
//		Person p = new Person("karan",23); //"1  Non parameterised CONSTRUCTOR " wale code ko comment out krne pr ye line uncomment krni pdegi bcoz FIR CONSTRUCTOR KI NEED HOGI
//		p.name= "Kaju"; //updated
//		p.age = 23;     //updated
//		p.fun();  //funtion call
//		
////-------------------------------------
//		
//		Person p1 = new Person("Kumar",24);// if niche wali dono line ko comment krde then name me Kumar and age me 24 print hoga
//		p1.name= "Kunal";
//		p1.age = 45;
//		p1.fun(); //Adhar_no same ayaga
//	}
//
//}
		
		//--------------------------------------
		
		// private name and age wale code ke liye uper wale code ko comment out krke  niche wale code write kiya hai
		// Eg:- private String name = "kriti" ; 
		// Eg:-private int age = 23;
		
		
		Person p = new Person("karan",23);
		p.SetName("Nikita");  //encasulation wale methode ke throgh set kr rhe hai
	  //p.SetAge(-9);    //comment out na krne pr age -9 print hogi
		System.out.println(p.getAge()); //23 ->first p ka age print hoga
		p.fun();
		
		Person p1 = new Person("Kumar",24);
		p1.fun();
	}
}



//   Tasks performed befor Constructor :-
//Step 1 Memory Allocation  //Person p = new Person("karan",23); -> new Person("karan",23); 1st idhr name me null and age me 0 agyega <- memory allocation
//Step 2 Parsing
//Step 3 Constructor
