package Lec42;

public class Middle_of_the_Linked_List {  //Leet code ques -> 876       
	
	
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
	}
	class Solution {
		public ListNode middleNode(ListNode head) { //head me 1st node ka address given hai  //jese hme LinkedList class me  - class ka name node diya the wese hi yha class ka name ListNode diya hai                 
			//upr wala code already likha tha leet code me hamne bs niche solve ki hui line likhi hai
			
			ListNode slow = head; //starting me slow head ko point krega see in notebook
			ListNode fast = head;  //starting me fast head ko point krega see in notebook
			while (fast != null && fast.next != null) { //fast ke upr condition lga di ki fast null na ho and fast ka next b null na ho

//			while (fast != null && fast.next.next != null) { // Even nodes or 2 middle node wale case me 1st middle ko return krne ke liye ye line hai eg:- 3 (see in Even wale nodes in notebook)
				
				slow = slow.next;     // slow ko 1 node se age bdha rhe hai eg:- next
				fast = fast.next.next;// fast ko 2 node se age bdha rhe hai eg:- next.next
			}
			return slow; //jb while loop ki condition true hogi means fast wala jb null hote hi - slow jis node pr hoga uss node ka address return hoga
		}
	}
}
	








	