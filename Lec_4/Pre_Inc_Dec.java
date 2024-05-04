package Lec_4;

public class Pre_Inc_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7;
		++a; //a=a+1;
		System.out.println(a);
		//System.out.println(--a);//pre dec // isme pehle value change hogi then code run hoga
		
		int b = a++ +9 -a - --a; //8+9-8-8 =0 
		System.out.println(b); //0
		
		int c = a++ +7 + a + a-- +3; //8+7+  9(a++ -> 8+1 ->9)   +9+3=36
		System.out.println(c); //36
		
		
		
	}

}
