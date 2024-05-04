package Lec15;

public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hellow";
		String str1 = "hellow";     //str and str1 both have same address in pull
		System.out.println(str);
		String st = new String("hellow");  //out of pull
		String st1 = new String("hello");    //out of pull
		str= str+"bye";            //now str is out of pull and have diffrent address
		st1 = st1+"bye";
		System.out.print(str.length()); //str.length() is the function , the lenght of str will be 9 bcoz bye is added
				
				
				
				

	}

}
