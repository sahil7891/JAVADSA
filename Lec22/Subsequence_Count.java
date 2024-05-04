package Lec22;

public class Subsequence_Count {
    static int count =0; //static variable is globle variable // it is written in main //subsequence ke count ko print krne ke liye
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="abc";
		printSubSeq(str,""); //  " " is for khalil(empty) string ke liye
		System.out.println(count); // no. of subsequence printed
		// for creating method click line no. 9 then click creat method
	    System.out.println("\n"+printSubSeq1(str," "));//ye printSubSeq1 wale method ko run kr rha h 
	                     //"\n"+ isse count wali line alas se print hogi // isse print wali line change hojati h "IMPORTANT"
	
	}
      //1st Way to print count//easy also
	public static void printSubSeq(String str, String ans) { //str and ans isme argument hai
		// TODO Auto-generated method stub
		if (str.length()==0) {  // jb jb base case hit horha h them character print ho rha hai // then fir pehle wala code stack se ht rha h and another stack generate hogi fir uska character alag se print hoga
			System.out.println(ans);
			count++; //when a character printed (eg=c) count+1 hoga //count ko argument me likhne ki need nhi h bcoz wo global variable h
			return;
		}
		char ch = str.charAt(0);  //a
		printSubSeq(str.substring(1),ans);
		printSubSeq(str.substring(1),ans+ch);
		

	}
	//2nd way to print count
	public static int printSubSeq1(String str, String ans) { //void ke bdle int liya h
		// TODO Auto-generated method stub
		if (str.length()==0) {  // jb jb base case hit horha h them character print ho rha hai // then fir pehle wala code stack se ht rha h and another stack generate hogi fir uska character alag se print hoga
			System.out.print(ans+" ");	//base case hit hone pr print hora h		
			return 1; // jb jb base case hit hoga return 1 hoga count ke liye  
		}
		char ch = str.charAt(0);  //a
		int f1=printSubSeq1(str.substring(1),ans);
		int f2=printSubSeq1(str.substring(1),ans+ch);
		return f1+f2;         //count ke liye f1+f2 bhej re h

	}
	

}
