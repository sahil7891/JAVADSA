 package Lec49;

public abstract class Abstract_Demo {  //Abstract method or Abstract function //Abstract means "Hide" krna
                              

//	 public void fun() {      //  "  {  " <- it means funtion ko "body" dediya and ab usme implementation kr skte h (eg of implementation:- niche syso wali line) // ye "Abstract" method nhi h  bcos ise "body"__{__ di h   
//		 System.out.println("hey");
//	 }
	
	//-----------------------
	
//	 public void fun1();      //ye abstract method h // esa method jise "body( } ) " nhi dete that type of method is known as "Abstract method "    //     }  <-it means "body"
//	 public int fun1();       //ye abstract method h because yha Angular Bracket( { ) nhi use kiya means body nhi diya iss method ko // esa method jise "body( } ) " nhi dete that type of method is known as "Abstract method " 
	                          
	//------------------------
                               
	public abstract int fun(); // Agar kisi "class" me abstract method h (eg:- isi class me ye "fun" "abstract" method h ) then iss class ko "Abstract" class bnana pdega  
	                           // agar kisi "class" me abstract method h (eg:- yhi class(Abstract_Demo) ) see "fun" wala method abstract method h - then iss class ko "Abstract" class bnana pdega
                               // Abstract class bnane ke liye => Step1 => public int ke bich me ""abstract"" likhna pdega //Step2=> upr "public class Abstract_Demo" isme public ke bd ""abstract"" likhdo (eg:- public abstract class Abstract_Demo { ) 
                               // Step2=> fun(); <- iss pr click krke -> "" Make type 'Abstract_Demo' abstract ""  isspr click krne se -Abstract class bn jaegi and error nhi dega   
	
	public void fun1() { // agar ye class abstract class h(eg- public abstract class Abstract_Demo{ ) -then jruri nhi ki "abstract method" hi iss class me exist krta hoga non abstract method b likh skte h (eg- ye method non abstract h) and agar puri class me "Abstract method " na ho to b chlega   
   
		
	}
}
