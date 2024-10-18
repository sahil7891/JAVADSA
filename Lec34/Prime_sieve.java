 package Lec34;

public class Prime_sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Primesieve(100);
	}
	public static void Primesieve(int n) {
		// false --> means index pr jo no. hai wo prime hai suppose
		boolean [] prime = new boolean[n+1];  //boolean ka array isme by default false value fill hoti hai // we assume if index me false hai then it's prime //[n+1] this is for 1 extra index bcour iss array me 0 se indexing hoti h and n-1 tk index ate hai
		prime[0] = true; // bcouse 0 prime nhi hota
		prime[1] = true; // bcouse 1 bhi prime nhi hota
		
		for (int i = 2; i*i<=n; i++) {  // i= 2 is for 2 se start krne ke liye // i*i<=n eg agar n=13 hai then i=4 tk hi chlega because 4*4=16 where 14>13  
			if (prime[i]== false) { // if i wala index false hai then niche wali line chlegi and nhi hai then i 1 index increase hoga upper wale for loop se//if i prime hai then false //prime wale index pr false hoga // and iske multiple bhi false honge
				
				for (int mul = 2; mul*i<=n; mul++) { // ye 2 to n index tk ith index ko multiply krayega
					prime[i*mul]= true; // i ke mulple not prime // ye i ke multiple sare index ko true kr dega means not prime last index tk
					
				}
			}
		}
		
		for (int i =2; i<=n; i++) { 
			if(prime[i]==false) { // jis jis index pr false hai wo sare prime index or no. hai ans false index wale sare index print honge
				System.out.print(i+" ");
			}
		}
	}

}
