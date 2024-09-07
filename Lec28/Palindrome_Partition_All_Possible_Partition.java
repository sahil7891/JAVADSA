package Lec28;

public class Palindrome_Partition_All_Possible_Partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "nitin";
		String ans = " ";
		PrintPartition(str,ans);
	}
	public static void PrintPartition(String ques, String ans) {
		if(ques.length()==0) {//base case
			System.out.println(ans); 
		}
		for(int i =1; i<=ques.length(); i++) { //str(ques) ki jitni length hogi utni hi recursive call lgegi isliye for loop use kiya h
	
			
			PrintPartition(ques.substring(i),ans+ ques.substring(0,i)+" ,"); //0,i => substring ka index no. 0 h // i varie kr kr rha hai code ke acording
		}

	}

}
// is code me all possible partion ho rhe hai
//Palindrome_Partition wale come sirf palindrome partition wala code run hoga

