package Lec38;
  
public class Child extends Parent {  //****extends Parent - ye line likhne se child class parent class ki properties ko access kr paega
	int d= 2;    //data member  
	int d2 = 20;  //data member  
	
	@Override           //@override likhane se ye ensure hota h ki same name ka function parent class me bhi exist krta h  wrna error dega  eg:- fun name ka function // agr fun ke bdle kuck or likhenge then error dega
	public void fun() {  //parent class me bhi same function h isliye @Override hokr Client class me fun wale function parent class ke bdle child class wala method call hoga eg:- client class me fun function me ye print hoga->"Fun In Child" print hoga
		System.out.println("Fun In Child"); 
		
	}
	public void fun2() {
		System.out.println("Fun2 In Child");
		
	}

}
