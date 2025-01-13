package Lec42;

public class Merge_Two_Sorted_Lists {

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
	//upr wala code leetcode se uthaya hai

 class Solution {
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
				list2 = list2.next;//list2 ke next me list2 ka addre aega
			}
		}
		//---------------------------
		
		if(list1 == null) {   //agar list1 ka nodes khtm ho jae means last me null bhe then
			temp.next = list2;//bche hue list2 ke sare node print ho jae
		}
		//---------------------------
		
		if(list2 == null) {   //agar list2 ka nodes khtm ho jae means last me null bhe then
			temp.next = list1;//bche hue list1 ke sare node print ho jae
		}
		return Dummy.next;	  //new node(Dummy) ke next me head ka address hai isliye Dummy ko return kr rhe hai

	}
  }
}














