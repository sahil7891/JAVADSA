package Lec49;

public class Payment_Method extends Bank_Account{   // yha inheritace use kr rhen h Bank_Account wali class ki properties ko use krne ke liye

	
//  niche @Override wala method auto-write krne ke liye upr Payment_Method pr click krke -> " add unimplemented method " pr click krna h
	
    @Override
    public boolean payment() { // Bank_Account - class me ye method abstract method tha isliye inheritance ka use krke ise @Override kr diya and @Override krne se hmne iss "abstract method" ko "body" dedi   
	   return false;           // Bank_Account wali class ye method abstract method likhne se iss method me hme jb need pde tb khud se kuch b implementation kr skte h inheritance ki help se, isliye abstract method ko use krte h   
	                           // now ab iss method ko body dedi h then ab iska object bna skte h see below
   }    
    public static void main(String[] args) { // now ab payment method ko body dedi h then ab Payment_Method object bnake payment method ko use kr skte h
		
    	Payment_Method pp = new Payment_Method(); // now issi class ka object bna diya jisse - Bank_Account class ke payment wale method ko b use kr ske h because inherit kr rhe h
	}
}
