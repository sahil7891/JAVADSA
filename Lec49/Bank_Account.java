package Lec49;

public abstract class Bank_Account {
	
	public abstract boolean payment(); // isse abstract method bnaya h then upr class se pehle abstract likhna pdega vrna error dega     
	
	public int accountbalance() {   
		
		return 1000;  // 1000 accountbalance return hoga
	}

		public final int coding() { // now iss method ko "final" bnadiya isliye ab iss method ko - Payment_Method class me @override nhi kr skte
			return 200;             // "final" means constant (eg:- iss coding method ko update nhi kr skte)
		}
	}


