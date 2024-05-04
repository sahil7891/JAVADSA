package Lec7;

public class Dec_to_Oct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=41;
		int sum=0;
		int mul=1;
		while(n>0) {
			int rem= n%10;
			sum = sum+rem*mul;
			n=n/10;
			mul=mul*2;
		}
		int a=041;
		System.out.println(sum);
		System.out.println(a);


	}

}
