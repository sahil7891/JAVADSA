package Lec7;

public class Dec_To_Bin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=26; //o/p me 26 ki binary value print hoggi  
		int sum=0;
		int mul=1;
		while(n>0) {
			int rem= n%2;  //bin to dec me n*10
			sum = sum+rem*mul;
			
			mul=mul*10;  // 1st iteration me 1*10=10 ,, 2nd iteration me 10*10=100 ,, 3rd me 10*100=1000 so on -- basicaly 10 ki power increase hori h
			n=n/2;
		}
		System.out.println(sum);
  
	}

}
//see in notebook
