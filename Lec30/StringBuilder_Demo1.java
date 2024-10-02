package Lec30;

public class StringBuilder_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    StringBuilder sb= new StringBuilder();//string builder is a builtin class in java //StringBuilder String se fast hota hai
	    sb.append("Hellow"); //StringBuilder me append ka means add hota hai // Hellow 'Builder' me ake store ho jayega
	    System.out.println(sb);
	    
	    sb.append("Hellow");  //append function piche piche add krta hai// hey ke piche hellow add krdiga
	    System.out.println(sb);  
	    
	    
	    System.out.println(sb.length());  //12   // Hellow and hellow ki length sath me print hogi
	    System.out.println(sb.capacity()); //Builder me 16 length ka char store kr skte hai
	    System.out.println(sb.reverse());   // reverse kr dega
	    sb=sb.reverse();
	    sb.append("Hellow");
	    System.out.println(sb.length());  //18
	    System.out.println(sb.capacity()); // length 16 upr jate hi capacity = length *2 +2 ayegi jo yha 34 hogi

	   // String s= sb; //wrong hoga
	    String s = sb.toString(); //Builder to String convert honge
	    System.out.println(sb);//sb and niche wala s same print hoga
	    System.out.println(s);//s and upr wala sb same print hoga
	
	   
	
	}

}
