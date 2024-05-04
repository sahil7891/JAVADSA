package Lec7;

public class Demo_DataType2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch = '9';
		System.out.println(ch);
		System.out.println((int)(ch)); //It is typecased to print integral value of 9 
	
		char c= '0';
		System.out.println((int)(c));//integral value of 0
	
		int i=78;
		System.out.println((char)(i));// int ko char me typecast kiya h
	
		
		char chh = 'c';
		System.out.println(chh);
		chh = (char) (chh+1); // next numeric value add hogi
		System.out.println(chh); //d
		chh++;
		System.out.println(chh);// chh++ se d ke baad e print hoga
		
		System.out.println(ch+chh);// dono ka ASCII(unicode) value add hoke print hoga
		
		
		
	}

}
