package Lec7;

public class Loop_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 //for(byte b = 0; b<= 128; b++) { //b++; -> b=(byte)(b+1) then b 127 hote hi typcast hoga and b ki value -128 hogi = isliye infinite loop chlega
		 //System.out.println(b);  // infinite loop

		
		// for(byte b = 0; b< 128; b++) {  // isme b typecastion hori h tbi infinite loop chlra h
		// System.out.print(b); //infinite loop 

		
		//for (byte b = 0; b <= 20; b--) {
		//System.out.println(b); //b negative me print hoga
		
		
		for (byte b = 0; b <= 127; ++b) {
	    System.out.println(b); 
	
	    
	    byte j = 8;
	    byte a = 12;
	    byte c = (byte)(j+a); // typecasting
	    System.out.println(c);
	    
	    short s1 =89;
	    short s2 = 99;
	    short s3 = (short) (s1+s2); // typecasting
	    System.out.println(s3);
		
		
		}

   }

}
















