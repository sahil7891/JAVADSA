package Lec20;

public class print_Dec_Inc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		Pdpi(n);
	}
	public static void Pdpi(int n) {
		if(n==0) {
			return; // return when n=0 then "return ki wjh se nicke ki line nhi chalegi" and code end hojaega
		}
		System.out.println(n);
		Pdpi(n-1);                 // recursive call  // iske niche code wali line h isliye ye "head recursion h
		System.out.println(n);
	}

}
