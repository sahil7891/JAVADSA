package Lec42;

public class Linked_List_Cycle { //Leetcode 141

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
	
	
//*****************************--------------------------------------------------------------------*************************************
		
	
		//upr wala code Lec 41 se liya h Linked list class se Linked list bnane ke liye
		
		
	 public void CreateCycle() {
		 
		 //this.tail.next = this.head; // now yha last node ke address me zero rkh diya isliye ye Linked List ab "Circular LinkedList" bn gya // this makes linkedlist circular
		 this.tail.next = this.head.next; // for creating "cycle" in linkedlist
		 
	 }
	 
	 //--------------------
	 // this algorythm is called "floyed cycle detection algorythm"
	 public boolean hasCycle() {// now upr tail ke next me head ke next ka address daldiya h isliye "head" ab "local variable" bn jaega // iss methode se ye check krenge ki Linked List me cycle h ki nhi
		 
		 //niche wala code middle of the linkedlist se uthaya h 
		 
		    Node slow = head; //Node likhenge bcos class ka name Node likha hai yha //starting me slow head ko point krega see in notebook
			Node fast = head;  //Node likhenge bcos class ka name Node likha hai yha //starting me fast head ko point krega see in notebook
			while (fast != null && fast.next != null) { //fast ke upr condition lga di ki fast null na ho and fast ka next b null na ho				
				slow = slow.next;     // slow ko 1 node se age bdha rhe hai eg:- next
				fast = fast.next.next;// fast ko 2 node se age bdha rhe hai eg:- next.next
				
				if(slow == fast) {
					return true; // agar linkedlist me cycle hai then return true
				}
			}
			return false; // agar linkedlist me cycle nhi hai then return false
	 }
	 
	 //------------------------------------------------
	 
	 public void Display() {  //ye code Lec 41 and LinkedList class se liya h
			Node temp = this.head; // 1st iteration me temp me 14k address aega then see syso wali line and notebook  //2nd iteration me "temp = temp.next;" hokr temp 2k location ko point krega  // head ko temp me rkh rhe h //agar temp nhi lete then head last last node print hote hote head null ko point krta and pura LinkedList khali ho jata
			while (temp != null) { // it means temp jb tk null nhi hota(last node pr nhi phuchta) tb tk
				System.out.print(temp.data + "-->"); // temp me jo 14k address ka jo data h wo print hoga eg:- 30 then see bolow  // 2nd iteration me 2k location ke coresponding jo data hoga wo print hoga eg:-20 // temp.data me head wala element hoga (eg:- 10) then niche // agar temp.data <- iske bdle temp.next likhte then address print krta
				temp = temp.next;  // temp.next me 30 ke coresponding jo addres hai wo point krega eg:- 2K see in notebook // 2nd iteration me 20 ke sath jo address hoga temp ab use point krega eg:-1k//temp.next hokr next node ko point krega eg:-20
			}
			System.out.println(".");
			
		}
		public static void main(String[] args) {            //isi class me "main class" bna di , upr wale methods ko run krne ke liye client class bnane ki jrurat nhi pdi
			Linked_List_Cycle cl = new Linked_List_Cycle(); // iss class ka name - constroctor
			
			cl.addlast(10);
			cl.addlast(20);
			cl.addlast(30);
			cl.addlast(40);
			cl.addlast(50);
			cl.addlast(60);
			cl.addlast(70);
			
			//cl.Display();
			
			cl.CreateCycle();
			
			//cl.Display();
			System.out.println(cl.hasCycle()); // ye true aega bcos CreatCycle wale method  ki wjh se Linked list me cycle create ho gyi hai
			
		}
		

}

//




















