package Lec_4;

public class Post_Incremnt_Decrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=9;
//		a++;//a=a+1;  
//		System.out.println(a);//10
		
//		System.out.println(a++);//10 // a++ print hone ke bd hoga or u can say code run hone ke bd
//		int b=a++;
//		System.out.println(b);//11
//		System.out.println(a);//12  //syso(a) wali line me a 11 hogya and int b=a++ me 12 then o/p12
		
	//	----------------------------------------------------------------------
		    // upr wala code run krne ke liye niche wala code commentout krne pr achhi understandig hogi
		
		int c = 8;
		c--;//c=c-1;
		System.out.println(c); //7
		
		
		a++;//a=a+1;  //9+1 = 10 
		System.out.println(a);//10
		int b=a++-9;                //last syso wali me 11 print hoga bcoz isme a++
		System.out.println(b);//1  //o/p 1 bcoz a++ 11 nhi hoga isme bcoz isme a++ code line run(print) hone ke bad increment hoga
		System.out.println(a);//11  //int = a++-9 me a++ se 10+1 hoga then 11 o/p

	}

}
//a++ means post increment
//a-- means post decrement
// post inc_dec me first code run hota h the value change hoti h
//pre(--a) me first value change hoti h then code run hote h