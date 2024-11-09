package Lec36;

public class Student_Client {  
	
//	public static void main(String[] args)throws  Exception{       //1st way -> throws  Exception - it tells exception might be generated and we have to write throws  Exception - bcoz stdent class me bhi throws exception likha hai
	public static void main(String[] args) {                       //2nd way wale code run krne ke liye yha se "throws Exeption"  ko htana pdega niche wali line se
		// TODO Auto-generated method stub
		Student s = new Student ("Rohit", 24);
      //s.setAge(-22);  //setAge <- student wale code me if,syso and return, wali ki wjh se -22 print nhi ho rha iske bdle constructor ki value print hogi which is 24  //if , syso and return wali line comment out kiya hai islye ise b krna pdega student wale class se
		s.setName("Kumar");
//		s.setAge(22);  //1stway-> if we put -22 then code will not run bcos hmne student class wale code me throws exception dala hai
		s.setAge(-22); //2nd way-> hmara khudka bnaya exception dega
		System.out.println(s.getAge()+" "+s.getName());

	}

}
