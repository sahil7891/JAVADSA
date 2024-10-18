package Lec34;

public class CHECK_PRIME_NUMBER_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 2; i <=100; i++) {  //i/p me 2 to 100 tk ke no i/p diye hai
			if(isprime(i)==true) {
				System.out.print(i+" ");  //100 tk ke sare prime no print honge
			}
			
		}
		
	}
	//complexity = O(srt(N)   / order of square root of N
	public static boolean isprime(int n) {
		
		int div = 2;
		while(div*div<=n) {
			if(n%div == 0) {
				return false;  
			}
			div++;
		}
		return true;  
			}
		}

	
