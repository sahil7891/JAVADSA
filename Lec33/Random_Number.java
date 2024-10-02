package Lec33;

import java.util.Random;

public class Random_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int si= 10;
		int ei = 50;  // Random number b/t 10 to 50
		Random_number(si,ei);
		
	}
	public static void Random_number(int si,int ei) {
		
		Random rand = new Random(); // " new Random(); " this is the inbuilt class to generate random no. 
		int lo = si;
		int hi = ei;
		for (int i = 0; i < 10; i++) {
			int ri = rand.nextInt(hi-lo+1)+lo;  // formula to generate random no.
			System.out.println(ri);
			
			
		}
		
	}

}
//in this code 10 to 50 ke b/t  10 random no. generate ho rha hai







