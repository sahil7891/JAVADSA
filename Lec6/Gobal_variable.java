package Lec6;

public class Gobal_variable {
	static int val=100;         //global variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hii");
		int a= 5;
		System.out.println(val);
		System.out.println(add(a,45));
		System.out.println("Bye");
		System.out.println(val);
		
	}
	
	public static int add(int a,int c) {
		int x=a+c;
		System.out.println(c);
		int val = 90;
		Gobal_variable.val +=5;    //Gobal_variable used
		return x-3;
	}

}
