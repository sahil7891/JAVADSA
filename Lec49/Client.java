package Lec49;

public class Client {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack_Interface_Use cs = new Stack_Interface_Use(); // now yha "Stack_Interface_Use" class ka object bnaya h jisse hm (Stack_Interface) & (DSA_Interface) dono class ke functions ko use kr skte h eg:- see below  // because ->Stack_Interface_Use me Stack_Interface ko implement kr rhe h and Stack_Interface me DSA_Interface , DynamiStack_Interface ko inherite kr rhe h  
		
		cs.display(); //☺☺ this line is eg of multiple inheritance because - yha sirf "Stack_Interface_Use" wali class me jo "display method" usi ko use kr rheh jisse conflict nhi ho rha 
		cs.push();
		System.out.println(Stack_Interface.val); // 9
		
	}

}
