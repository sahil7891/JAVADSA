package Lec41;

public class LinkedList {

	public class Node{ // ikathe 2 information ko combine krke rkhna hai(eg:- data & address) isliye class bnana pda // Node bnaya hai to know that "data"(eg:-10) kya hai and "address"(eg- 1k) kya hai see below data ke liye "int data" liye h and address ke liye  Node next likha h                       
		int data;   // data ka data type "integer" type ka hai //Node me data rkhne ke liye (eg:- 10, 20, 30, 40, 50 )
		Node next;  //"next" me address yad rkhege eg:- 1k,2k // "next" Node ka address yad rkh rha hai // address ka data type "Node" type ka hai 
		
		public Node(int data) { //Node ka constructor bna diya 
			this.data = data; // 1st iteration me addfirst wala method chlne ke bad data me 10 add hojega
	} 
}
	
	private Node head; //head me 1st node ka address hoga eg:- 1k for 1st iteration //head me linkedlist ka start point hoga
	private int size;  //linkedlist ka size janne ke liye or to know kitne nodes hai linkedlist me 
	private Node tail; //last node ko point krne ke liye
	
	//-----------------------------------------
	
	public void addfirst(int item) { //item me element denge client class ke through eg:- 10,20,30
		
		Node nn = new Node(item);    //1st iteration me item me 10 aega && nn me 1k address aega //nn name ka new Node liya hai
		
		if(this.size == 0) { // agr node ka size 0 (means ek b node nhi hai) hota then if ke niche wali line chlegi
			this.head = nn;  // 1st iteration me head me item 10 and address 1k ajaega
			this.tail = nn;  // 1st iteration me tail me item 10 and address 1k ajaega
			this.size++;     // Node add hone ke bd LinkedList ka size b increase hoga
			
		}
		else {
			nn.next = this.head; // In 2nd Node(2nd iteration) - nn.next me item 20 aega && this.head me 1k address aega//2nd iteration me address me 1k aega //head me 1k location h eg:- 1k (pehle wale node ka address) for 2nd iteration
			this.head = nn; // In 2nd iteration me now head ab 2k ko poinr krega //yha ye stack ki trh node ko store kr rhe hai means node add hone ke sath sath head bhi new node ko point kr rha hai and jha head hoga LinkedList b whi se start hoga 
			this.size++;    // Node add hone ke bd LinkedList ka size b increase hoga
		}
	 
	}
	//----------------------------------
	
	public void addlast(int item) { // iss method se hm element ko last me add krte hai eg:- 30 ,20 ,10 ke bad "40" add krenge //item me 40 denge
	
		if(this.size == 0) { // agar LinkedList me ek b node nhi hai then
			addfirst(item);  // call addfirst method
		}
		else { //warna
			Node nn = new Node(item); // item me 40 aega
			this.tail.next = nn; //yha tail(last) wale node ka address nn me ajaega and usme item b aega
			this.tail = nn; // now nn wala node tail(last node) bn jaega
			this.size ++;   //size ek se bdh jaega
		}
	}

	//------------------------------
	
	public int getfirst() throws Exception { // head ka data get krne ke liye means jo data sbse pehle hai use get krne ke liye
		if(this.head == null) { // jb linkedlist me ek bhi node nhi hoga then usme null hoga and isliye ye line likh rhe hai taki error na de
			throw new Exception("pagl LinkedList Khali hai"); //agar LinkedList me ek b node nhi hua then ye Exception dega (agar client class me ek b input na diya ho then hmara bnaye hua exception dega)
		}
		return this.head.data; //ye line head me jo data hoga use return kregi
		
	}
	//-----------------------------
	
	public int getlast() throws Exception { // tail ka data get krne ke liye means jo data sbse last me hai use get krne ke liye
		if(this.head == null) { // jb linkedlist me ek bhi node nhi hoga then usme null hoga and isliye ye line likh rhe hai taki error na de
			throw new Exception("pagl LinkedList Khali hai"); //agar LinkedList me ek b node nhi hua then ye Exception dega (agar client class me ek b input na diya ho then hmara bnaye hua exception dega)
		}
		return this.tail.data; // ye line tail me jo data hoga use get krne ke liye hai
	
	}
	//-------------------------------
	
	public int getatindex(int k) throws Exception { // node ke index pr jo data hai uuse get kr rhe hai and k m index no. denge

		return GetNode(k).data;  //GetNode method call ho rha hai see below //ye node ka data return krega(GetNode(k).data;) agar yha data ke bdle next likha hota ye address return krta // k me node ka address aega and uss address ka data return hoga
		}
	
	
	private Node GetNode (int k) throws Exception { // ye node ka address return krega
	      if(k<0 || k>= size){ // Exception ke liyeh ye line and agar k ki value range se bhr hogi
	    	  throw new Exception ("Index out of Bound hai pgl k  ki value range me de");
	      }
	      Node temp = head;  // 1st node ka address temp me aega //agr temp ki value i/p me 0 di hoti then niche wala for loop nhi chlte and temp return ho  jata
	      for (int i = 0; i < k; i++) { //i/p me jina index no.(k) diya hoga utni br ye loop chlega
	    	  temp = temp.next;	// node me data ke sath next node ka address h eg:- 30,2k and "temp.next" se next node ka address eg:- 2k mil jaega and next node pr phuch jaenge
		}
	      return temp; // i/p wale index no. tk phuckne ke bd for loop end ho and temp return hoga
	} 
	
	//-------------------------------
	
	public int removeFirst() throws Exception {  //head wale node ko nikal rhe hai LinkedList se
		if(this.head == null) { // jb linkedlist me ek bhi node nhi hoga then usme null hoga and isliye ye line likh rhe hai taki error na de
			throw new Exception("pagl LinkedList Khali hai"); //agar LinkedList me ek b node nhi hua then ye Exception dega (agar client class me ek b input na diya ho then hmara bnaye hua exception dega)
		}
		Node temp = this.head;  // temp me 1st Node ka address yad rkhenge eg:- 14k 
		this.head = this.head.next; // head.next se head ke next me jo next node ka address hoga eg:- 30 ke side me 2k jo ki next node ka address hai - ab head use point krega means "head" ab next node ko point kreaga
		temp.next = null; // temp me 1st node ka address hai and temp.next me 1st node me data ke sath next node ka address b hai eg:- 2k and wo address = null hokr 1st node and 2nd node ke bich ka connection htadega
		this.size --;     // LinkedList me 1st Node nikle ke bd size 1 se kam ho jaega
		return temp.data; //temp me 1st node ka address hai uska data return krega eg:-30
	}
	
	//-------------------------------
	
	public int removelast() throws Exception {  //tail wale node ko nikal rhe hai LinkedList se
		if(this.head == null) { // jb linkedlist me ek bhi node nhi hoga then usme null hoga and isliye ye line likh rhe hai taki error na de
			throw new Exception("pagl LinkedList Khali hai"); //agar LinkedList me ek b node nhi hua then ye Exception dega (agar client class me ek b input na diya ho then hmara bnaye hua exception dega)
		}
		if(this.size==1) { // agr linkedList ka size equal to 1 hai then
			return removeFirst();  //removeFirst wala method call hoga
		}
		Node temp = GetNode(this.size-2); // temp me "size-2" hokr 2nd last node ka address ajega eg:- 20 ka see in notebook
		int rv = tail.data; // rv me tail(last node) me jo data hai vo aega eg:- 10 see in notebook
		this.tail = temp;   //tail me 20 ka address ajega eg:- 2k see in note book -" Node nn" yha 20 ka origina address 2k hai now tail me 20 ajaega
		this.tail.next = null; //ab yha tail me jo data hai eg:- 20 ab uske sath 1k adress nhi hokr null ho jaega bcos ab usse last node bna diya
		this.size --;
		return rv; // 10 return krdenge jo pehle last node tha
		
	}
	
	//------------------------------
	
	public int removeatanyindex(int k) throws Exception {  //k me index no. btenge ki konsa node remove krna hai//LinkedList me kisi node ko nikal skte hai 
		 if(k<0 || k>= size){ // Exception ke liyeh ye line and agar k ki value range se bhr hogi
	    	  throw new Exception ("Index out of Bound hai pgl k  ki value range me de");
		 }
		 if(k==0) { 
			 return removeFirst(); // removefirst mothod ko call krenge
		 }
		 else if(k==this.size-1) {
			 return removelast(); // removelast mothod ko call krenge
		 }
		 else {
			 
			 
			 Node kth = GetNode(k); // kth 20|1k wale node ko point kr rha hai eg:- GetNode(k) <- isme 20|1k iss node ka index diya hai i/p me and  see in notebook
			 Node k_1th = GetNode(k-1); // k_1th 30|2k wale node ko point kr rha hai eg:- GetNode(k-1)<- isme 20|1k wale or u can say k wale node se 1 node pehle jo node hai jo ki 30 wala node hai use k_1th node me rkh rhe hai see in notebook
			
			 
			 k_1th.next = kth.next;  // now 30 ke next me 2k ke bdle 1k ajega eg:- 30|1k ab 1st node and last node ka connection bn jaega
			 kth.next = null; // pehle kth ka next 1k address tha see in notebook now kth node ke next me means 20 ke next me ab wo null ho jaega
			 this.size--;
			 return kth.data; //kth ka data return hoga eg:- 20
		 }
	}
	
	//--------------------------------
	
	public int addatanyindex( int item, int k) throws Exception {  //k me index no. btenge ki konse index pr node add krena hai and item me element denge //LinkedList me kisi node ko nikal skte hai 
		 if(k<0 || k> size){ // Exception ke liyeh ye line and agar k ki value range se bhr hogi
	    	  throw new Exception ("Index out of Bound hai pgl k  ki value range me de");
		 }
		 if(k==0) { // agr ip me k index no. 0 diya hai then
			 addfirst(item); //addfirst method ko call krenge
		 }
		 else if (k == size) { // agr ip me k index no. LinkedList ke size jitna diya hai then
			 addlast(item);    //addlast method ko call kr
		 }
		 else {
			 Node nn = new Node(item); //new node le liya step(1) see in notebook
			 Node k_1th = GetNode(k-1); //  GetNode(k-1) isse i/p k ka jo index no. diya hoga usse ek node pehle wala node k_1th me a jaega
			 nn.next = k_1th.next; // nn jo new node h uske next me means address me k_1th wale node ke next me jo address tha wo dalde eg:- 70|2k  step(2) see in notebook
			 k_1th.next = nn; // k_1th wale node ke next me(address) me new node(nn) ka address dalde (step(3) see in notebook)
			 this.size++;
			
		 }
		 return item;
		 
	}
	
		

	//--------------------------------
	
	public void Display() {
		Node temp = this.head; // 1st iteration me temp me 14k address aega then see syso wali line and notebook  //2nd iteration me "temp = temp.next;" hokr temp 2k location ko point krega  // head ko temp me rkh rhe h //agar temp nhi lete then head last last node print hote hote head null ko point krta and pura LinkedList khali ho jata
		while (temp != null) { // it means temp jb tk null nhi hota(last node pr nhi phuchta) tb tk
			System.out.print(temp.data + "-->"); // temp me jo 14k address ka jo data h wo print hoga eg:- 30 then see bolow  // 2nd iteration me 2k location ke coresponding jo data hoga wo print hoga eg:-20 // temp.data me head wala element hoga (eg:- 10) then niche // agar temp.data <- iske bdle temp.next likhte then address print krta
			temp = temp.next;  // temp.next me 30 ke coresponding jo addres hai wo point krega eg:- 2K see in notebook // 2nd iteration me 20 ke sath jo address hoga temp ab use point krega eg:-1k//temp.next hokr next node ko point krega eg:-20
		}
		System.out.println(".");
		
	}

}

//LinkedList ka ques hamesha diagram Bnake  // visualize krke solve krte hai eg:- see in notebook jo addfirst method ke liye solve ki huil linkedlist bnai hai in notebook











