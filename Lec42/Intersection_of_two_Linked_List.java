package Lec42;

public class Intersection_of_two_Linked_List { //LeetCode 160         

	public class ListNode {
		int val;         // data ka name val hai
		ListNode next;   // address ka name next de diya
		ListNode() {
		}
		ListNode(int val) { // constructor bna diya
			this.val = val;
		}
		ListNode(int val, ListNode next) {  // ise parameterised bna diya
			this.val = val;
			this.next = next;
		}
		
//------------------------------------------------------------
	  
		// upr wala code Middle of the linked list wali cali class se uthaya h isi package ke 
		
		  public class Solution{
			  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
				  ListNode A = headA; //Linked List A start poin
				  ListNode B = headB; //Linked List B start poin
				  
				  while(A != B) { // jb tk  A and B same node pr nhi ate
					  
					  if(A == null) { //jb A last node ke bad null pr phuch jaega then
						  A=headB;    // A ki starting B wali node hogi
					  }
					  else {
						  A=A.next;   //ek se age bdhana
						  
					  }
					  if(B==null) {   //jb B last node ke bad null pr phuch jaega then
						  B = headA;  // B ki starting A wali node hogi
					  }
					  else {
						  B=B.next;   //ek se age bdhana
						  }
					  }
				  return A; // agar dono node is not intercepting each other then at the end both will be in null then A & B dono me se kisi ko b return kro null hi hoga          
				  }
			  }
		  }
	}


