package Lec7;

public class Data_Type_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte b = (134); //byte ki value 127 se km honi chahiye then it will not giver error
		//byte b = (byte)(134); // this is 'Typecasting' in this value range me ajati h	
		
		byte b =14;
		System.out.println(b);//14
		int i = 300;
		b=(byte)i; // in this int ko byte me conver kr rhe h , see in notebook
		System.out.println(b);//44
		
		int i1 = 178;
		int i2 = 184;
		byte b1 =62;
		byte b2 =-4;
		
		i1=b1;  //int byte me convert ho rha h
		System.out.println(i1);//62
		
		i2 =b2;
		System.out.println(i2);//-4
	
		long ll = 845845625; //hardcode me long int jitne size ka hota h eg 10ki power 9 se bda no. nhi rkh skte
	    
		long ii = 5487785668844852l; // long me typecast krne ke liye last L liya hai 2 ke bad jisse iska size(range) bdh gya
		
		float f =7.91f;//float = 32 bit  //last me f likhne se float me typcast hogya wrna error deta bcoz f ke bina ye double type ka data type h// auto float hoga
		double d=67.9; //64bit
		
		
		System.out.println(ll);
		System.out.println(ii);
		System.out.println(f);
		
		boolean bt = true;
		boolean bt1 = false;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
