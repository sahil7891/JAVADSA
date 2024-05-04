package Lec15;

public class String_Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdefg";
		
		System.out.println(str.charAt(3));  // .charAt - is for getting the character from string index, eg=3=d= d printed
		System.out.println(str.substring(2,5)); // .Substring - is for getting the characters between the string , it prints one less element that is the reason we put 5 instead of 4
		String s1 = str.substring(2,5); // new string created form index 2 to 5

		System.out.println(s1);
		System.out.println(str.substring(2)); // it prints all the contents after index no 2
		System.out.println(str.substring(1,1)); //this case not be printed
		
		System.out.print(str.concat(s1)); // .concat will add s1 to str
		String s2 = "1bz";
		System.out.println(str.compareTo(s2)); // str is  bigger than s2 then output will be 1, if small hota then ouput -1 hota
		
		if (str.compareTo(s2)>0) {
			System.out.println(str);
		}else {
			System.out.println(s2);
		}
	}

}
