package Lec49;
                                                                                  // ye interface h isliye public ke bd "interface" likha h
public interface Stack_Interface  extends DSA_Interface , DynamiStack_Interface { // ye interface bnane ke liye Lec49 pr right click krke - new pr jake "Interface" pr click krna h - then interface ka name dena h eg:- Stack_Interface    
	                             //extends DSA_Interface <- ye line DSA_Inteface class ko inherit krne ke liye likhi h jisse hm -DSA_Interface- "interface" ke functions ko use kr skte h
	                             //extends DynamiStack_Interface <- iss line "DynamiStack_Interface" class ko inherit krne ke liye likhi h
	
	public abstract void push(); //ye method by default ""public abstract"" h and agar "public abstract" na b likhe fir b ye "public abstract" hi rhega because "interface" me bnaya hua method by default "abstract" method hota h
	public int  pop();           //ye method by default ""public abstract"" h and agar "abstract" na b likhe fir b ye "abstract" hi rhega
	int peek();                  //ye method by default ""public abstract"" h and agar "public abstract" na b likhe fir b ye "public abstract" hi rhega
	 
	int val = 9; // agar "interface" me hm koi variable bnate h then uska type -> "public static  final"  type ka hota hai
	             // isme "static" ki help se agr iss variable ko kisi class me access krna h then ""Interfa.val""  krke access krenege
	             // and agar ise kisi interface me access krna h then variable ke name se access kr skte h eg:- int x = Stack_Interface.val;
	             // isme final ka meaning h ki iss variable ko update nhi kr skte
	//-------------------
	//FROM JAVA (JDK) 8 ke bd se "default and static" function me  "body" dena allow hogya h
	default void Sayhey() {       // interface me *default* function ko "Body" de skte h
		System.out.println("hey");
	}
    public static void Hellow() { // interface me *static* function ko "Body" de skte h 
		System.out.println("hey");
	}
    //-------------------
	//FROM JAVA (JDK) 9 ke bd se private function me "body" dena allow hogya h
    private int World() {         // interface me *private* function ko "Body" de skte h 
    	return 9;
    }
}

	 //interview ques - interface ke under jin method ko body nhi dete h wo kis type ke method hote h 
	 //answer  - uska by defaut nature ""public abstract"" type ka hota h and ""public abstract"" ko likhna jruri nhi h because wo by default ""public abstract"" hota h
	 
	 // interface me multiple inheritance ki functionality achieve kr skte h eg:- extends DSA_Interface , DynamiStack_InterfaceS	 
	 // interface ka Object nhi bna skte but class ka Object bna skte h



