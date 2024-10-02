package Lec32;

public class Time_and_Space_Complexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000;
		int m = 1000000000;
		System.out.println(3+4); //in this time complexity is => "O(1)"  means order of 1 bcouse ise frk nhi pd rha ki n ki value kya hai
		System.out.println("bye");
		System.out.println("bye hey");
		System.out.println("bye");
		System.out.println(n);
		System.out.println(m);  // constant time "O(1)"  le rha hai bcoz n = 100000000 hai but code sirf ek br hi chl rha hai 10000000 br nhi chl rha hai
		System.out.println("bye");
		// upr wali sri line ko same time lg rha hai run hone me means order of 1 "O(1)"
		//-----------------------------------------
		
		for (int i = 0; i < args.length; i++) {
			System.out.println("hey");  // now the time complexity is order of n "O(n)" because o/p time n pr depend kr rha hai // O(n) is for worst case 
		}
		//--------------------------------------
		int i = 0;
		while(i<n) {
			System.out.println("Hey");  
			i++;
			// Time Complexity => O(n)
		}
		//------------------------------------
		while (i<n) {
			System.out.println("Hey");
			i*=2;
			// Time Complexity => O(log(N))  //order of log N
		}
		//---------------------------------------
		while (n>0) {
			System.out.println("Hey");
			n/=2;
			//O(log(N)
		}
		//------------------------
		while (i<=n) {
			System.out.println("Hey");
			i+=2;
			i+=3;
			//2 and 3= (5)jo add ho rha hai wo constant hai 
			// O(N)       //addition wale case me complexity jada tr  Log me nhi hoti hai
			
		}
		//---------------
		while (i<=n) {
			System.out.println("Hey");
			// O(log(N)   // base 6  //multiplication wale case me complexity jada tr  Log me hoti hai
			i*=2;
			i*=3;
			
			
		}
		while (i<=n) {
			System.out.println("Hey");
			// O(log(N)   // base 6
			i/=2;
			i/=3;
		}
		//---------
		while (i<=n) {
			System.out.println("Hey");
			// complexity => n/k
			
			//i+=k;
			
		}
		while (i<=n) {
			System.out.println("Hey");
			// log N   base k
			//i *=k;
		}
		//-------------
		while (n>0) {
			System.out.println("Hey");
			// O(n)
			
			n= n-1;
		}
		//------
		while (n>0) {
			System.out.println("Hey");
			// O(n)
			n= n-2;
			n= n-3;
			
		}
		//------------
		while (n>0) {
			//complexity => n/k
		//	n= n-k;
			
		}
		//-------
		 
		// NESTED LOOP
		 
		for (i = 1; i <= n; i++) {  // n times chl rha hai
			for (int j = 1; j <= n; j++) {  //ye under wala loop bahar wale variable pr depend nhi kr rha then == ye loop n times chal rha hai and uper wala loop bhi n times the time complexity = n squere
				//dono loop independent hai isliye constant work ho rha hai the complexity = n*n means N square (N^2)
				System.out.println("hey");  // yha constant work ho rha hai
				// complexity = n^2
				
			}
			
		}
		for (i = 1; i*i <=n; i++) {
			System.out.println("hey");
			
			// comlexity = square root of N
			
		}
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				for (int k = 1; k <=1000; k++) {
					
					//complexity = 1000*N^2		
	    	}
	     }
      }
		
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i*i; j++) {
				for (int k = 1; k <=n/2; k++) {
					System.out.println("hey");
					//complexity = N^4					
				
	    	}
	     }
      }
		
		for ( i = 1; i <=n; i*=2) {
			System.out.println("hey"); //while loop ki trh iski comlexity same hi hogi means log n
			// log(N)
			
		}
		for (i = n/2; i <= n; i++) {
			for (int j = 1; j <=n/2; j++) {
				for (int k = 1; k <=n; k=k*2) {
					System.out.println("hey");
					// N^2 log(n)
					
				}
			}
		}
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <=n; j+=i) {
				System.out.println("hey");
				//complexty = O N*Log(N)
			}
		}
	}
 }
















