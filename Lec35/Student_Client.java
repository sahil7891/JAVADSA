package Lec35;

public class Student_Client { // java me class ka name generally 'capital letter se hi start hota hai ya krte hai'

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student  s = new Student();  //  new Student(); ->this line is called "Object" or "instaanse"  //'s' is the reference variable //object ka meanig h ki class ke data member ko initialise krwana // ye line ye b showcase kr rhi ki ye code student class pr depend kr rha h
//                                   // new Student(); -> ye line student class ka blue print rkhegi ki usme 'name' and 'age' hai // name ki by defaoulf value 'null' hogi and age ki '0' and dono kisi bhi 2k location pr rkhenge where "s" name ka jo reference variable hai usme "2k Address ata hai"
//		System.out.println(s.age);  //0
//		System.out.println(s.name); //null
//		
//		s.age= 90; //data member ko access krne ke liye referece variable ko " . " krke access krna hoga  //ye age pr 0 ko update krke 90 kr dega
//		s.name= "Nitish"; // ye name pr null ko update krke Nitish krdega
//		                   // age and name is 'data member
//		System.out.println(s.age); //90
//		System.out.println(s.name);//Nitish

		
		//-------------------------------------	
		
//		Student  s = new Student(); //uper wala code comment out hai isliye ye wala object write kiya h
//		s.age= 90;
//		s.name= "Nitish";
//		
//		Student s1 = new Student();  // new object // every object may have different different name and age
//		s1.age = 25;
//		s1.name = "Bhavya";
//		System.out.println(s1.age);  //25
//		System.out.println(s1.name); //Bhavya
//		
//		
//		s.Into_yourSelf();  //student class ka function call hua hai  //to Debug double click on 25 and single click on Debug(uper chota sa kida hai us pr) corner me step into or step next ke liye small arrow bne honge click on that
//		s1.Into_yourSelf(); //student class ka function call hua hai
		
		
		
//------------------------------------------------		
		
		
		
		Student s2 = new Student();      //s2 on 3k location
		Student s3 = new Student();      // s3 on 5k location
		s2.name = "kunal";
		s2.age  =  28;
		
		s3.name = "Hardik";
		s3.age  = 26;
		System.out.println(s2.name+ " "+ s2.age);//kunal,28
		System.out.println(s3.name+ " "+ s3.age);//Hardik,26
		System.out.println("...............");

				Test1(s2,s3);    //swap nhi ho paya because stack se sara code udgya

		System.out.println(s2.name+ " "+ s2.age);//kunal,28
		System.out.println(s3.name+ " "+ s3.age);//Hardik,26
		
	}
	public static void Test1(Student s2, Student s3) {
		Student t = s2;
		s2 = s3;
		s3 = t;
		
		

		
		//-------------------------------------
		
		
//		Student s2 = new Student();      //s2 on 3k location
//		Student s3 = new Student();      // s3 on 5k location
//		s2.name = "kunal";
//		s2.age  =  28;
//		
//		s3.name = "Hardik";
//		s3.age  = 26;
//		System.out.println(s2.name+ " "+ s2.age);  //kunal 28
//		System.out.println(s3.name+ " "+ s3.age);  //Hardik 26
//		System.out.println("...............");
//		
		//Test2(s2,s3); 
		
//		System.out.println(s2.name+ " "+ s2.age);  //kunal 28
//		System.out.println(s3.name+ " "+ s3.age);  //Hardik 0
//		
//	}
//	public static void Test2(Student s2, Student s3) {  // s2 and s3 ka adress pass kiya hai , eg 2k and 3k
//		
//		s2 = new Student();  // new age 0 
//		int tempa = s2.age;
//		s2.age = s3.age;
//		s3.age = tempa;
//		
//		
//		s3 = new Student();
//		String tempn = s2.name;  //new name = null(default value) 
//		s2.name = s3.name;
//		s3.name = tempn;

		
		//-----------------------------------------------------------------------
		
		
//		
//		Student s2 = new Student();      //s2 on 3k location
//		Student s3 = new Student();      // s3 on 5k location
//		s2.name = "kunal";
//		s2.age  =  28;
//		
//		s3.name = "Hardik";
//		s3.age  = 26;
//		System.out.println(s2.name+ " "+ s2.age);  //kunal 28
//		System.out.println(s3.name+ " "+ s3.age);  //Hardik 26
//		System.out.println("...............");
//		
//		int my_age = 20;
//		String my_name = "c";
//		
//		Test3(s2,s3.age, s3.name , my_age, my_name);
//		
//		System.out.println(s2.name+ " "+ s2.age); // _ 0
//		System.out.println(s3.name+ " "+ s3.age); // Hardik 26
//		
//	}
//	public static void Test3(Student s,int age, String name, int myAge, String myName) {  // Student s me s2 ka adress pass hoga means age 28 and name kunal // ye code bs 'S2' wale object ke liye run hoga mean S2 ke heap me jake changes honge
//		
//	s.age = 0;
//	s.name = "_";
//	age = 0;
//	name = "_";
//	myAge = 0;
//	myName = "_";
			
		
	}

}
//to Debug double click on 25 and single click on Debug(uper chota sa kida hai us pr) corner me step into or step next ke liye small arrow bne honge click on that
// Debug se hm code ko kisi bhi line pr break krke or stop krke check kr skte h ki wo kese run ho rha h step by step














