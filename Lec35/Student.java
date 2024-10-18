  package Lec35;

public class Student {
	
	String name;
	int age;
	
	public void Into_yourSelf() {
		String name = "Rajesh";
		
    	//System.out.println("My Name is"  + name+ " and age is"  + age);
		System.out.println("My Name is"  +  this.name + " and age is"  +  this.age);// this.name and ' this.age' --> agar hm yha this keyword ka use na kre then 'student_Client wale code me bhi name me Rajesh print hoga' where 'name= rajesh is the local variable 
		
		
	
		//****** class ke "data member" ko "this." key word ki help se acess krna hai******
	}

}
