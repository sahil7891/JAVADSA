package Lec18;

import java.util.Iterator;

public class Wrapper_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 100; //wrapper class then the address created in "heap memory
		int a1 = 10;// adress created in stack memory
		System.out.println(a);
		System.out.println(a1);
		Short s1 = 78;//Class
		Byte d1 = 19;//class
		System.out.println(s1);
		System.out.println(d1);
		
		a=a1; //int---> Integer => called "AutoBoxing"
		System.out.println(a);
		
		Integer ii = 100;
		int i = 10;
		i=ii;// Integer--> int => unboxing
		System.out.println(i);
		
		//Important
		Integer b1 = 19;
		Integer b2 = 19;
		System.out.println(b1==b2); //true becouse their corresponding velues are under "cache" see notebook
		Integer c1 = 190;
		Integer c2 = 190;
		System.out.println(c1==c2);// false becouse the value is out of cache
		Byte bb=12;
		Byte bb1=12;
		System.out.println(bb==bb1);//true
		
		Long L1 = 128l;
		Long L2 = 128l;
	
	
		System.out.println(L1==L2);//false
		

	}

}
