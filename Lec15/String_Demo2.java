package Lec15;

public class String_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hellow";
		String str1 = "hellow";    
		String st = new String("hellow"); 
		String st1 = new String("hello");  
		
		System.out.println(st1 == str1); // == compares address
		System.out.println(st1.equals(st)); // .equals - compares content
		
		System.out.println(str == str1); //true bcos both are in the pull(Same address)
		System.out.println(str ==st);
		String s1 = "hell";
		
		String s = "hell"+"o"; // it will create in pull
		System.out.println(str == s); // both in pull mean true

	}

}
