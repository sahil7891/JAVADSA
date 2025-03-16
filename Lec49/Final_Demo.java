package Lec49;

public final class Final_Demo { // yha public ke bd "final" use kiya h ab iss class ko ""inheritance""  nhi kr skte

	final int val = 89;         // now ab ye final variable bn gya h ab "val" variable ki value ko ab update nhi kr skte // "final" means constant means ab value update nhi kr skte 
	
	public void fun() {
//		val = val +7;   // upr val ko final me liya h isliye error dera h because val ki value update nhi kr skte , update krne pr error dega , check it iss line ko uncommentout krke  
		System.out.println(val);
		
	}

}
