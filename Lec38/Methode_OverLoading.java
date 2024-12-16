package Lec38;

public class Methode_OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(add(2,4));
		System.out.println(add(2,4,9));
		System.out.println(add(2,4,9.7));
		System.out.println(add(2,3,9,5,8,81,79,566,81,87,25,8,52,58,7,8,5,2));
	}
	public static int add(int a, int b) {  //ye apne according argument me 2,4 lelega
		return a+b;
		
	}
	public static int add(int a, int b, int c) {  //ye apne according argument me 2,4,9 lelega
		return a+b+c;
		
	}
	public static int add(int a, int b , double c) { //ye apne according argument me 2,4,9.7 lelega
		return (int) (a+b+c);
	}
	public static int add(int... a) { // "... a" ise """variable number of argument"" bolte h and "a" isme variable ka name h and int ke bldle Stirng, float bhi leskte h // yha "... a" means ki ye array ki trh behave kr rha h
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];	
		}
		return sum;
	}
	 
}


//function OverLoading me:-
//1- same class me hoga       //eg- isi class me hoga
//2- function name same hoga  //eg- add
//3-return type same hoga     //eg- a+b; (+)
//4- bas number of argumet and type of argument me difference hoga


//*****OverLoading ka concept same class me use hota h
//Overriding ka concept  2 different class eg:- parent class and child class ke bich me lgta h
 
//static function ko override nhi kr skte















