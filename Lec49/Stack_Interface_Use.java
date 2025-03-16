package Lec49;
// ek "class ke" function me dusri class ke function ko use krne ke liye "Inheritance" ka use krte h **extends**

// In the same way ek "Interface" ke function me dusri Interface ke function ko use krna h then "Inheritance" ka use krte h **implements**
// interface ko kisi b class me "implement" kr skte h but "extends" nhi kr skte // interface me "Inheritance" ka use krne ke liye "extends" nhi likhte "implement" likhte h


public class Stack_Interface_Use implements Stack_Interface { //yha ("Stack_Interface" <-interface ) ko iss class me "implent" kr rhe h // iss line pr click krke "Add unimlemented methods" pr click krna h 
// ye class bnai h isliye yha public ke bd "class" likha h                                                                              // then  Stack_Interface class ke sare methods @Override hojaenge and unhe **body** mil jaegi ,see below esa krne se error nhi dega                       
	                                                                                                                                    // eg:- now esa krne se ab hm uss "Stack_Interface" class ke methods me apna logic likh skte h
	//----------------------------                                                                                                      // but **hm un methods ka "return type" change Nhi kr skte ( eg. of return type :- int / boolean , etc) that's why we use Interface
	//niche "Stack_Interface" class ke functions @Override horhe h
	
	@Override
	public void push() {
		
	}

	@Override
	public int pop() {
		return 0;
	}

	@Override
	public int peek() {
		return 0;
	}  
	//-----------------------------
	//niche "DSA_Interface" class ke functions @Override horhe h because "Stack_Interface" class me "DSA_Interface" ko *extend* kiya h

	@Override
		
	public void display() { //☺☺ ******yha display method ko "body" dedi jisse "client class" me yehi wala "display" method use hoga and conflict nhi hora - bhlehi (DSA_Inteface & DynamicStack_Interface)<- inn dono class me display method ho , that is how "interface" me multiple  "Inheritance" possible h******
	}

	@Override
	public int size() {
		return 0;
	}
	//-----------------------------
	//niche "DynamiStack_Interface" class ke functions @Override horhe h because "Stack_Interface" class me "DSA_Interface" ko *extends* kiya h

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		
	}

}





