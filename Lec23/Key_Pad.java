 package Lec23;

public class Key_Pad {
 
	//DON'T USE CTRL+SHIFT+F (FORMATING)
	
	static String[] key = {"", "abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
//keypad no. equal to index no.  1     2     3     4     5     6     7     8     9
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="12";
		printKeyPad(str,"");
		
	}
	public static void printKeyPad(String ques, String ans) {//12
		 if (ques.length()==0) {
			 System.out.println(ans+" ");
			 return;
		 }
		char ch = ques.charAt(0);// '1' --> 49 to get 0th char of 12(i/p)
		String pressString= key[ch-48];//ch --->49  //[ch-48]; to get index (eg index1) see in notebook
		
		for (int i=0; i<pressString.length(); i++) {
			printKeyPad(ques.substring(1), ans+pressString.charAt(i));
		}	
	}

}

//leetcode ques 17
//static string
