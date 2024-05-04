package Lec8;

public class Global_variable {
	static int val=100;    //In this the val is global variable which can be accessed in every function, Global variable bnane ke liye "Static" lgana pdta h

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");

		int x=90;
		fun(x);
		System.out.println(val);//100
	}
	public static void fun(int x) {
		int a=90;
		System.out.println(x);//90
		System.out.println(val);//100
	}
	

}
