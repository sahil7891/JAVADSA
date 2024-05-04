package Lec_4;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a = 0;
		int b = 1;
		for(int i =1; i<=n; i++) { 
			int c = a+b;           //1st iteration = c =1     //2nd c= 2         //3rd c = 3   so on
			a =b;                   // 1st iteration = a=1    //2nd a= 1         //3rd a = 2   so on
			b=c;                   //1st iteration = b =1     // 2nd b= 2       // 3rd b = 3    so on
		}
		System.out.println(a);
	}

}
// i/p me fibonacci ka index dena h then it will print the no. present on that index
// eg = i/p = 6  and o/p = 8

//-----------------------------
//hard code
//int n = 6;
//int a = 0;
//int b = 1;
//for (int i = 1; i <= n; i++) {
//	int c = a + b;
//	a = b;
//	b = c;
//}
//System.out.print(a);
//}
//}

//-----------------------------
      // coument out all above befor runing this below


//int n1=0,n2=1,n3,i,count=6;
		// System.out.print(n1+" "+n2);//printing 0 and 1

		// for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
		// {
		// n3=n1+n2;
		// System.out.print(" "+n3);
		// n1=n2;
		// n2=n3;
		// }
        //}






















