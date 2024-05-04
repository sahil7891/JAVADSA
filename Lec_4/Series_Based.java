package Lec_4;

public class Series_Based {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3467;
		int sum=0;
		while (n>0) {
			int rem = n % 10;
			sum = sum * 10+rem;
			
			n = n/ 10;
		}
		System.out.println(sum);  // printing reverse of no.
		


	}

}
// i/p = 3467
//o/p = 7643 series reverse hori h
