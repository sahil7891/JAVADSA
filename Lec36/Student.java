package Lec36;

public class Student {
	private String name = "Shiksha";
	private int age = 89;
	
	public Student (String name, int age) {
		
		this.age = age;
		this.name = name;
	}

	public String getName() { //getter
		return name;
	}

	public void setName(String name) { //setter
		this.name = name;
	}

	public int getAge() {      //getter
		return age;
	}

	
//	public void setAge(int age) { 
	//		if (age<0) {    // if age ki value -ve me hogi then print nhi hoga
//			System.out.println("sunbe pgl 'Age' kbhi -ve nhi hota h");  //we have to write this massage as development point of view for eg - jese ptm and g pay ki transaction fail hone pr wo btata hai ki TRANSACTION IS FAILED
//			return;     //if , syso and return wali line khud type ki hai
//		}		
	
//--------------------------------------------------------		
	
//	//*********1st way of exeption handling**************
//	
//	public void setAge(int age) throws  Exception{ //throws  Exception - it tells exception might be generated and we have to write throws  Exception- bcoz we wrote throw new Exception below , if don't write it there will be error
//
//		if (age<0) {    // eg of exception = if Student_Client class me age 0 se less means -ve hua then o/p me error ayaga  ////Exception means kisi normal code me abnormal kam hona
//			throw new Exception("pgl Age -ve nho hota");  //this line generates Exeption // throw  ka work ye h ki kisi method se explicitly btae ki hm Exeption generate kr rha hai
//			
//		}
//		this.age = age;
	
//------------------------------------------------
	
	// 2nd way of exception handling
	public void setAge(int age) {
		try {            // try ke andar wala code is called "danger code"  //if try me koi exception ata hai mean age ki value -ve ati h then code terminate nhi hoga baliki usse 'catch' me rakhdenge jisse code terminate nhi hoga and o/p me age me constructor wali line me jo age ki value h wahi age print hogi which is 24
			if (age<0) {
				throw new Exception("pgl Age -ve nho hota");  
				
			}
			this.age =age;

		}
		catch (Exception e) { // e is variable jisme "pgl Age -ve nho hota" wala msg pass kr rha hai
			System.out.println(e);  // its o/p => java.lang.Exception: pgl Age -ve nho hota
			e.printStackTrace();  //ye konsi line pr error hai wo b btata hai // eg-> o/p=> at Lec36.Student.setAge(Student.java:50) <- means line no 50
		}
		finally {   // this is called finally block  // this code is mandatory and 'Age' ki value -ve ho ya +ve dono hi case me ye print hoga
			System.out.println("Hey this side Hritik");
		}
	  }
	}






// java me by default "lang package import hota hai" isliye hme import krne ki need nhi hoti

   //e.printStackTrace(); -> its output =>
                                          //java.lang.Exception: pgl Age -ve nho hota
                                          //at Lec36.Student.setAge(Student.java:50)
                                          //at Lec36.Student_Client.main(Student_Client.java:11)

//-----------------------------------------------        

                  //1st way error - if we put -ve value in age in student client class then error like below will be shown
//Exception in thread "main" java.lang.Exception: pgl Age -ve nho hota
//at Lec36.Student.setAge(Student.java:31)                              //** Student.java:31 it means line no 31 pr error hai
//at Lec36.Student_Client.main(Student_Client.java:10)                  //** Student_Client.java:10 it means Student_Client class me line no 10 pr error hai
