package Lec23;

public class Dubplicate_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abac"; // yha string me abca h i/p
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
			
    		
    	//for preventing duplicate print , from here to	
			boolean flag = true;
			for(int j = i +1; j<ques.length(); j++) { // ye puri string ke liye b chlega and call stack ke liye bhi chlega
				if(ques.charAt(j)==ch) { // ye puri string check krega ki same char string me h ya nhi
					flag = false; // if false then skip that index eg = a-0th index and next is b= 1st index
					break;		
				}
			}
			if(flag == true) { //flag -- False
				
				// to here
				
			
				
				
			String ros = ques.substring(0,i) + ques.substring(i+1); // to get ques //a ke bad wale char ayenhe eg bc
			printPermutation(ros, ans +ch); //ros=bc and ans =a then it will be bc,a   where b=0th index and c is 1st index              //bc ,a -- seen in notebook
		}

		}
	}

}


