package Lec38;

import java.util.ArrayList;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student("Ram Lal", 78); // new Student("Ram Lal", 78); ye line object hai hai student class me static count = 0 se 1 ho jaye ye run hone ke bd
//		System.out.println(s); //ye address print krega eg:- Lec38.Student@4517d9a3 <-- ye toString methode hai
		                       //jb hm kisi bhi referende variable(eg:- s) ko print krate h then toString method by default chlta h jisme package name, class name ,@ some haxagonal values hoti h
		System.out.println(s);  //yha adress ke bdle content ko print krane ke liye toString methode ko @Override kiya hai  see in student class// student class me "public String toString()" @Override hokr ye line likhne se ab content print honge  and adderess print nhi hoga
		
	//	Object b = new Object();  // ****open declaration - krne ke liye upr Navigate pr click krke "open declaration" pr click krna hai
	//	ArrayList<E>
		
//		s.   // s. krne pr student class ke function and datamember dikhenge and kuch object class ke dikhenge 		
		//Student_Client ye object class hai ,, isliye object class ke  bhi data member access ho rhe hai
		// student class ---- Student_Client class ko inherit kr rha hai bydefault 

		Student s1 = new Student("Shiksha byb", 24); 
		System.out.println(Student.count);  //static count 1 se bdhke 2 ho jayega upr syso(s) me count 1 hogya th and is line se count 2 hojayega
		
		Student.Hellow(); //Hey // static method ko class ke name  ke through(eg:- class name -Student , and methode name -Hello) access kiya jata h & student class me -"public static void Hellow()" name ka method h
		//Static method sare object ke liye common hota h means isme name and age count nhi hote pura line count hoti h

	}

}


//java me hr class ka parent class "object" class hota hai  isliye object(Student) class ke data member access ho rhe hai &&& ye bni bnai class h java me





