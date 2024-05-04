package Lec6;

public class Fun_demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		addtwonumbers();     // <---- | to use funtion write this
		
		System.out.println("bye");
                                                //   |
	}                                          //    |
	public static void addtwonumbers() {   //addtwonumbers is a function name--by using this we dont need to rewrite program
		int a=9;
		int b=8;
		int c=a+b;
		subtwonumbers();
		System.out.println(c);

	}
	public static void subtwonumbers() {
		int a=100;
		int b=30;
		int c=a-b;
		System.out.println(c);
	}

}
