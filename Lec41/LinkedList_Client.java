package Lec41;

public class LinkedList_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.addfirst(10); // addfirst method ko call kr rhe hai LinkedList class se
		ll.addfirst(20); // addfirst method ko call kr rhe hai LinkedList class se
		ll.addfirst(30); // addfirst method ko call kr rhe hai LinkedList class se
		 
		ll.Display();   // Display method ko call kr rhe hai LinkedList class se o/p - 30-->20-->10-->.
		 
		ll.addfirst(90); // 1st node pr 90 add hoga // addfirst method ko call kiya hai LinkedList class se
		ll.addlast(40); // last node pr 40 add hoga // addlast method ko call kr rhe hai LinkedList class se

		ll.Display();  //o/p - 90-->30-->20-->10-->40-->.
		
		System.out.println(ll.getfirst()); //90
		System.out.println(ll.getlast());  //40
		
		System.out.println(ll.removeFirst()); //90 nikl jaega LinkedList
	    System.out.println(ll.removelast()); //40 nikl jaega LinkedList
		ll.Display(); //o/p - 30-->20-->10-->.
		 
		
		System.out.println(ll.removeatanyindex(1)); // LinkedList se index no 1 Node 20 nikal jaega
		ll.Display(); 
		
		ll.addatanyindex(70, 1);// index no. 1 pr 70 add hojaega
		ll.Display();

	}

}
