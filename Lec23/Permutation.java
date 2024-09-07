package Lec23;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		printPermutation(str,"");
	}
	public static void printPermutation(String ques, String ans) {
		//base case
		if (ques.length()==0) {
			System.out.println(ans);
			return;
		}
		
		for(int i =0; i<ques.length(); i++) { // i = 0(a) then pehle ye a ke liye sare permutation run krega i++ hoke //then i=1(b)ke liye alg se i++ hoga so on
			char ch = ques.charAt(i); // isme a ajayega 0th char
			
			String ros = ques.substring(0,i) + ques.substring(i+1); // to get ques //a ke bad wale char ayenhe eg bc
			
			printPermutation(ros, ans +ch); //ros=bc and ans =a then it will be bc,a   where b=0th index and c is 1st index              //bc ,a -- seen in notebook
		}

	}

}
