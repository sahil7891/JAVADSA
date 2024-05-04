package Lec8;

public class Global_variable2 {

	static int val;     // In this the val is global variable which can be accessed in every function , Global variable bnane ke liye "Static" lgana pdta h

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		val = 50;        //val global variable bn gya hai then we can give it a value
		System.out.println("hey");

		int x = 90;
		System.out.println(val);   //Yha "val" ki value 50 hi rhegi bcoz ise function se pehle hi print krwaya h
		fun(x);
		System.out.println(val);                                         //liye print hogi
	}                                                                      //\
	public static void fun(int x) {                                       //|
		//int val= 18; //isme "val" local variable ban gya ab              //\
		val=140;     // Yha "val ki value change ho jayegi, or fir yhi value iske|
		int a = 90;
		System.out.println(x);
		System.out.println(val);

	}

}







// GLOBAL VARIABLE KI VALUE "HEAP" MEMORY ME REHTI HAI
