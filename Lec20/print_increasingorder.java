package Lec20;

public class print_increasingorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		Pi(n);
	}
	public static void Pi(int n) {
		if(n==0) {
			return; // return when n=0 then "return ki wjh se nicke ki line nhi chalegi" and code end hojaega
		}
		
		Pi(n-1);
		System.out.println(n);  //syso wali line recursion ke bad hai isliye ye recusion niche ate time print hoga
	}

}
