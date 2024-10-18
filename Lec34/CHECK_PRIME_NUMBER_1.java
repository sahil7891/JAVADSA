package Lec34;

public class CHECK_PRIME_NUMBER_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println(isprime(13));

	}
	
	//********complexity = O(srt(N)   / order of square root of N
		public static boolean isprime(int n) {
			
			int div = 2;
			while(div*div<=n) {    //4*4= 16 and 16>13 isliye ye sirf 4 tk chlega ,agar ye condition false hui then no. is prime
				if(n%div == 0) {    //agar ye condition true hui then no. is not prime
					//uper wali while and if wali dono hi condition true hue then no. is prime
					return false; //not prime
				}
				div++;
			}
			return true; // is prime
				}
			}

		



