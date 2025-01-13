package Lec43;

public class Cycle_Removal {

	public class Node {
		int data;
		Node next;// address
	}
	private Node head;
	private Node tail;
	private int size;
//O(1)
	public void Addfirst(int item) {
		Node nn = new Node();
		nn.data = item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;
		}
	}
	// O(1)
	public void Addlast(int item) {
		if (size == 0) {
			Addfirst(item);
		} else {
			Node nn = new Node();
			nn.data = item;
			tail.next = nn;
			tail = nn;
			size++;
		}
	}
	private Node getNode(int k) throws Exception {
		if (k < 0 || k >= size) {
			throw new Exception("Bklol size glt de raha hai ");
		}
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}
	public void CreateCycle() throws Exception {
		//Node kth = getNode(2);
		this.tail.next = this.head.next.next;
	}
	
	public Node hasCycle() { //yha boolean ke badle Node type me return krenge unlike Linked_List_Cycle class      
		
	 //upr wala code Lec42 Linked_List_Cycle class se uthaya hai
		
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return slow; //yha se slow return krenge means meetup point ki dono pointer( slow and fast) kis node pr ake mil rhe hai         
			}
		}
		return null;
		
		//----------------------------------------------------
		
		// upr wala code Lec42 Linked_List_Cycle class se uthaya hai
		
	}
	public void removeCycle1() {
		Node meetup = hasCycle(); // meetup me wo node aega jo hasCycle method return krega , see in Lec42 Linked_List_Cycle class
		if(meetup == null) { //and agar LinkeList  me koi meetup point nhi hai then
			return;          // return
		}
		
		Node start = head; // start me head aega
		while(start != null) { //jbtk start != null nhi hota then
			
			Node temp = meetup; //temp me meetup point aega 
			
			while(temp.next != meetup) { // jb tk temp ka address == meetup ka address nhi hota
				if(temp.next == start) { //agr temp ka address == start ka address hua then
					temp.next = null;    //temp ka next wala address null krde
					return;
					
				}
				temp = temp.next; //temp ko ek se age bdha de
			}
			start = start.next;   //start ko ek se age bhda de
		}
	}
	
	//-----------------------------
	
	public void remveCycle2() {
		Node meetup = hasCycle(); // yha hasCycle wala methode se meetup me wo node aegega jha fast and slow dono note ek node pr mil rhe ahi eg 7|8k wala node
		if(meetup == null) { // agar LinkedList me cycle nhi hai then
			return; // return
		}
		
		//step 1 see in notebook
		int count = 1; // count krne ke liye
		Node temp = meetup; // meetup wale node se count start krne ke liye
		while (temp.next != meetup) { //jb tk temp wale node ke next me meetup wale node ka address nhi ata then
			count++; // count +1
			temp = temp.next; //temp ko ek se age bdha
			
		}
		
		//Step 2 below
		Node pin = head; // Pin pointer le liya 
		for (int i = 0; i < count; i++) { // Pin pointer ko jitna count hai 
			pin = pin.next; //utna age bdha diya  
			
		}
		
		Node start = head; //  start - head ko point krega 
		while(start.next != pin.next) { //Step 4 // jb tk start and fast dono ke node ke next me same node ka address nhi ata tbtk
			
			start = start.next; //Step 3 // start ko ek se age bdha
			pin = pin.next; //Step 3 // pointer ko ek se age bhda
		}
		pin.next = null; //Step 4 // pointer ke next me null krde now Linked list se cycle remove hojaegi
	
	}
	
	//-------------------------------------------------------
	
	public void fylodcycleremoval() {
		Node meetup = hasCycle(); // yha hasCycle wala methode se meetup me wo node aegega jha fast and slow dono note ek node pr mil rhe ahi eg 7|8k wala node
		if(meetup == null) { // agar LinkedList me cycle nhi hai then
			return; // return
		}
		
		Node pin = meetup; // pin pointer me meetup wala node aega and meetup me wo node hai jha fast and slow dono note ek node pr mil rhe ahi eg 7|8k wala node
		
		//further steps
		Node start = head; //  start - head ko point krega 
		while(start.next != pin.next) { //Step 4 // jb tk start and fast dono ke node ke next me same node ka address nhi ata tbtk
			start = start.next; //Step 3 // start ko ek se age bdha
			pin = pin.next; //Step 3 // pointer ko ek se age bhda
		}
		pin.next = null; //Step 4 // pointer ke next me null krde now Linked list se cycle remove hojaegi
		
		
	}
	
	//-------------------------------------------------
	
	 public void Display() {       //ye code Lec 41 and LinkedList class se liya h
			Node temp = this.head; // 1st iteration me temp me 14k address aega then see syso wali line and notebook  //2nd iteration me "temp = temp.next;" hokr temp 2k location ko point krega  // head ko temp me rkh rhe h //agar temp nhi lete then head last last node print hote hote head null ko point krta and pura LinkedList khali ho jata
			while (temp != null) { // it means temp jb tk null nhi hota(last node pr nhi phuchta) tb tk
				System.out.print(temp.data + "-->"); // temp me jo 14k address ka jo data h wo print hoga eg:- 30 then see bolow  // 2nd iteration me 2k location ke coresponding jo data hoga wo print hoga eg:-20 // temp.data me head wala element hoga (eg:- 10) then niche // agar temp.data <- iske bdle temp.next likhte then address print krta
				temp = temp.next;  // temp.next me 30 ke coresponding jo addres hai wo point krega eg:- 2K see in notebook // 2nd iteration me 20 ke sath jo address hoga temp ab use point krega eg:-1k//temp.next hokr next node ko point krega eg:-20
			}
			System.out.println(".");
			
		}
		public static void main(String[] args) throws Exception {            //isi class me "main class" bna di , upr wale methods ko run krne ke liye client class bnane ki jrurat nhi pdi
			Cycle_Removal cl = new Cycle_Removal(); // iss class ka name - constroctor
			
			cl.Addlast(10);
			cl.Addlast(20);
			cl.Addlast(30);
			cl.Addlast(40);
			cl.Addlast(50);
			cl.Addlast(60);
			cl.Addlast(70);
			
		
			cl.CreateCycle(); //LinkedList me cycle bnegi yha  //iss method ke baad agar directly Display wala method call kiya then infinite loop chlega because linked list me cycle hogi
		  //cl.removeCycle1(); // LinkedList se cycle remove hogi isse
			cl.remveCycle2();  // LinkedList se cycle remove hogi isse
			cl.Display();     // ab loop infinite nhi chlega bcouse ab removeCycle wale method se cycle remove ho gyi hai
    }
}














