package Lec38;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		//Case 1
//		Parent obj = new Parent();
//		
//		System.out.println(obj.d);  //1
//		System.out.println(obj.d1); //10
//		
//		obj.fun();  //parent class me fun wala function call hoga
//		obj.fun1(); // parent class me fun wala function call hoga

		
//-------------------------------------------------------------------------------
		
//		//Case 2   parent  child    see in notebook
//		Parent obj = new Child();  // jb ye code chlega then sbse phle JBM me ye ->" new Child();" line chlaegi and STACK me parent class ka blueprint eg:- d=1 d1=10 ,fun ,fun1   _AND_   child class ka blueprint eg:- d=2 d1=20 ,fun ,fun1  __dono ki properties HEAP me ajayegi
//		
//		System.out.println(obj.d); // upe wali line me obj parent type ka hai(eg- Parent obj ) isliye parent class me jo d ki value hai whi print hogi eg =1 //obj p type ka h isliye ye parent class ka sra variable access krega
//		System.out.println(obj.d1); //10 //variable me @Override ko use nhi krte eg- d d1 d2 , @Override function me work krta hai eg- fun , fun1 , fun2
//		
//		System.out.println(((Child) (obj)).d2);//20 //yaha obj ko Child type ka bna diya isliye error nhi de rha (referance ko typecast kiiya h)  //esa hmse isliye likha h bcos "run time(JBM) pr child class and parent class dono ko access mil rha hai"
//		System.out.println(((Child) (obj)).d);  //2 //or u can say yaha obj ko Typecast krke child me convert kr diya wrna pehle obj parent type ka th isliye typecast krna pda wrna error ata // child class ke variables ko run time me JBM ke through access kiya ja skta h***		
//		
//		obj.fun();  // yha sbse phle "new child();" wali line chlegi and and Child class ke blueprint me check krega ki wha fun name ka function h ki nhi and hoga toh @Override ki help se child class ka fun wala function chlega and pritn hoga//yha "methode overriding" ka concept use ho rha hai isliye child class ko reflect kr rha h 
//	              	// see child class me fun wale function me commente out wali line me @Override ko explain kiya h
//		obj.fun1(); // child class me jb @Override check kraga ki usme fun1 name ka function h ki nhi then child class me fun1 function nhi h isliye parent class me check krke fun1 fuction print krega 
//		
//		((Child) (obj)).fun2(); //yaha bhi obj ko Typecast krke child me convert kr diya //typecast kiya bcos child class me @Override kiya h and parent class me fun2 name ka function nhi h // typecast kiya h wrna compilation error dega bcos likhte waqt control compiler ke ps hota h and agar likhte wqt control complier ke ps nhi hota then ""obj.fun2"" ye bhi likh sakte th 
//		                        // Typecast krna pd rha h bcoz code likhte wqr control compiler ke ps hota h and run hote wqt jbm ke ps then jbm code chla dega
//	
//	
		
		
//--------------------------------------------------------------
	 
//		//Case 3  seen in notebook  ////******* this case invalid --see below
//		
//		Child obj = new Parent();
//		System.out.println(obj.d);
//		System.out.println(obj.d1); //parent class ko access kr rha hai  //10
//		System.out.println(obj.d2); //child class ko access kr rha hai   //20  //yha run time error ajaega bcos "new Parent();" ye child class ki property access nhi kr skta bcos "Child extends Parent" sirf child hi parent class ki property access kr skta hai -- now that is the reason this case not possible
//		                            //compile time error is always better than run time error  //******* this case invalid
//		obj.fun();                    
		 
	
//------------------------------------------------------------------	
	
		//Case 4  seen in notebook  ////******* this case invalid --see below
		
		Child obj = new Child();
		System.out.println(obj.d); //2
		System.out.println(obj.d1);//10 , new Child(); yha child class parent class ko inherit kr rha h eg:-" new Child();" isliye d1 me 10 print hoga
		System.out.println(obj.d2);//20
		System.out.println(((Parent)obj).d);  // (((Parent)obj).d)  yha obj ko typecast krke parent type ka bna diya ab parent class wala d print hoga eg:-1

		obj.fun(); // new Child() isliye child wala fun name ka function call hoga
		obj.fun1();// child me fun1 name ka function nhi h is isliye parent class me check krke fun1 ko print krega
		obj.fun2(); //child class ka fun2
	
	}

}














//Case 2 //jb hm code likhte h then pura control compiler ke pas hota hai
//Compiler always LHS(Left hand side) dekhta hai eg:- Parent obj  // isliye obj parent type ka h
//Compiler code ka grrametical error dekhta hai  eg- synthetic error eg:- e==c  and etc..

//Case 2 // and jb hm code run krte hai then pura control jbm ke pass hota hai
//JBM always RHS(Right hand side) dekhta hai eg:- new Child();

// Methode overriding INHERITANSE ke case me use hota h 2 d/f class ke bich me //Rule 1 -> same name ka function child and parent class me hona chahiye // child class ka function parent class ke function ko override krta h bcoz child class me "Child extends Parent" likha k


//List<> ll = new Arraylist   // ye 2nd case ka eg h//yha List PARENT h and Arraylist CHILD hota h






















