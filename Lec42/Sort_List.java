package Lec42;

public class Sort_List { //leetcode 148 -- solving using mergesort concept

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

    //upr wala code leet code se uthaya hai	

	class Solution {
		    public ListNode sortList(ListNode head) {
		    	if(head == null || head.next == null) { //base case
		    		return head;
		    	}
		    	ListNode mid = middleNode(head); // mid me middle of linked list milega
		    	ListNode headB = mid.next;  //headB me mid ka address yad rkhenge
		    	mid.next = null; // ye line likhne se mid ke next me null ho jega and linkedList 2 part me divide ho jaega
		    	
		    	ListNode A = sortList(head);  //A me -> divede hone ke bd 1st LinkedList jo bni uska head aega
		    	ListNode B = sortList(headB); //B me -> divede hone ke bd 2nd LinkedList jo bni uska head aega
		    	
		    	return mergeTowList(A,B); // yah mergeTowList ko call kiya and A & B dono LinkedList sort hokr return ho jaega ***********
	}		
		    //------------------------------
		    
		    public ListNode middleNode(ListNode head) { //head me 1st node ka address given hai  //jese hme LinkedList class me  - class ka name node diya the wese hi yha class ka name ListNode diya hai		    
				ListNode slow = head; //starting me slow head ko point krega see in notebook
				ListNode fast = head;  //starting me fast head ko point krega see in notebook
				while (fast.next != null && fast.next.next != null) { //fast ke upr condition lga di ki fast null na ho and fast ka next b null na ho 
					
					slow = slow.next;     // slow ko 1 node se age bdha rhe hai eg:- next
					fast = fast.next.next;// fast ko 2 node se age bdha rhe hai eg:- next.next
				}
				return slow; //jb while loop ki condition true hogi means fast wala jb null hote hi - slow jis node pr hoga uss node ka address return hoga //upr while loop me jo condition di h usse ye 1st millde node ko return krega
			    
				//upr wala method middle_of_the_linkedList class se uthaya hai

			}
		    //-------------------------------
			public ListNode mergeTowList(ListNode list1, ListNode list2) {

				ListNode Dummy = new ListNode(); //dummy node le liya
				ListNode temp = Dummy;
				while(list1 != null  &  list2 != null) { //range me rkhne ke liye
					
					if(list1.val<list2.val) { // agar list1 ka data list2 ke data se chota hai then
						
						temp.next = list1;  //temp ke next me list1 ka data rkhde
						temp = temp.next;   //now temp me data ke sath jo address tha uske sath jo address h wo temp rkhde
						list1 = list1.next; //list1 ke next me list1 ka addre aega
					}
					else {
						temp.next = list2; //temp ke next me list2 ka data rkhde
						temp = temp.next;  //now temp me data ke sath jo address tha uske sath jo address h wo temp rkhde
						list2 = list2.next;//list1 ke next me list1 ka addre aega
					}
				}
				if(list1 == null) {   //agar list1 ka nodes khtm ho jae means last me null bhe then
					temp.next = list2;//bche hue list2 ke sare node print ho jae
				}
				if(list2 == null) {   //agar list2 ka nodes khtm ho jae means last me null bhe then
					temp.next = list1;//bche hue list1 ke sare node print ho jae
				}
				return Dummy.next;	  //new node(Dummy) ke next me head ka address hai isliye Dummy ko return kr rhe hai
				
				//upr wala method Merge_Two_Sorted_Lists class se uthaya hai


		}
	}

}
