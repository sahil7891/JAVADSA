package Lec45;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Traversal {
	
	Scanner sc = new Scanner(System.in); //Scanner type krke ctr+space dbane pr -> import java.util.Scanner; ye line automatically upr type ho jaegi

	public class Node{ // 3 information rkkne ke liye Node class bnai hai eg:- data , left , right
		
		//see in notebook
		int data;   //data int type ka h isliye usme integer vali value rkhenge 
		Node left;  // left -> Node type ka h isliye usme address rkhenge
		Node right; // right -> Node type ka h isliye usme address rkhenge
		
	}
	private Node root; //for starting point of tree //root ko private bnaya h taki koi dusri class se ise null na krde jisse pura binary tree loss hojaega             
	
	public Traversal() { //constructor bna diya
		
		root = CreateTree(); // ye pehla Node ka address dega // ye tree ko construct krega            
	}
	
	
	
	private Node CreateTree() { // see in notebook // iss method se Tree create krenge
		
		int item = sc.nextInt(); // data enter kraenge eg:- 10  and item me data jaega eg:- 10 (step 1)
		Node nn = new Node(); // yha "nn" me 1k address gya h where (nn)data - 0 , left - null , right - null //(step 2)
		nn.data = item; // nn ke data me 10(item) ajaega  (step 3)
		
		boolean hasLeftSide = sc.nextBoolean(); // see in notebook
	  	 if (hasLeftSide) {
				 
			 nn.left = CreateTree(); // nn ke left me data rkhdenge // yha recursive call lg rhi h and jb recursive call lgti then function frame creat hota h  // this will create left subtree(left wale sare tree)
			 
		 }
		 boolean hasRightSide = sc.nextBoolean();  // see in notebook
		 if (hasRightSide) {
			 nn.right = CreateTree(); // this will create Right subtree (right wale sare tree)
		 } 
		 return nn;	 
	}
	
	//------------------------------
    
	//upr wala code Lec44 - Binary_Tree class se liya hai
	
	
	public void PreOrder() { //see in notebook 
		PreOrder(this.root); //preorder mehtod me root ka address bhejne ke liye
		System.out.println();
	}
	private void PreOrder(Node node) { // node me root ka address aega // Pre Order traversal // traversal => it means the process of visiting each node in the tree and processing its data
		
		if(node == null) { 
			return;
		}
		System.out.print(node.data+" "); //(1)sbse pehle if wali line chlegi and node null nhi h then 10 print hoga // node ki present position ko print kr rhe h
		
		PreOrder(node.left);   // (2)then left subtree ka call lgega and if wali condition check hogi then syso wali line se 20 print hoga 
		                       // (3) then again left ki call lgegi and if wali line chlegi then syso se 40 print hoga and if wali line firse chlegi and 40 ka left and right dono null h isliye stack me wapas jake 20 ke right wali call lgegi       
		PreOrder(node.right);  // (4)then right side ki call lgegi and if wali line chlne ke bd syso wali line se 70 print hoga so on.. //recursive call for right subtree
		
		
	}
	//------------------------
	
	public void PostOrder() { //see in notebook 
		PostOrder(this.root); //PostOrder method me root ka address bhejne ke liye
		System.out.println();
	}
	private void PostOrder(Node node) {  // node me root ka address aega // Post Order traversal // traversal => it means the process of visiting each node in the tree and processing its data
		
		if(node == null) { 
			return;
		}
		
		PostOrder(node.left); 
		PostOrder(node.right);  
		System.out.print(node.data+" "); //syso wali line last me likhi h isliye sari call lgne ke bd print hoga means stack se waps ate time //jb parent node ke left and right dono print ho jaenge then parent node print hoga //stack bnake solve krne pr jese notebook me o/p aya h wese hi aega
	}
	//-----------------------------------
	
	public void INOrder() { //see in notebook 
		INOrder(this.root); //INOrder method me root ka address bhejne ke liye
		System.out.println();
	}
	private void INOrder(Node node) {  // node me root ka address aega // IN Order traversal // traversal => it means the process of visiting each node in the tree and processing its data
		
		if(node == null) { 
			return;
		}
		
		INOrder(node.left);
		System.out.print(node.data+" "); //syso wali line Bich me likhi h isliye pehle left node print hoga then parent node print hoga then right node //stack bnake solve krne pr jese notebook me o/p aya h wese hi aega
		INOrder(node.right);  
	}

	//-----------------------------------
	
	public void LevelOrder() {
	//	Queue<Node> queue = new LinkedList<>(); // Queue<Node> queue -> it also means LinkedList  (for interview purpose)
	//  *****  agar "Queue" pr right click krke "Open declaration" pr click krenge then --> ""public interface Queue<E> extends Collection<E> "" ye line likhe aegi it means queue ek **interface** hai
		System.out.println("Lever Order Treversal :- ");
		
		LinkedList<Node> queue = new LinkedList<>(); //<Node> :-queue ka address Node type ka hoga isliye <Node> likha h----------|
		queue.add(this.root); //root ka address(1k) queue me daldiya (step 1) //  ye add last krega linked list se                |
		while(!queue.isEmpty()) {      //                                                                                         | these 4 lines is to make "QUEUE" using LINKELIST by remove 1st and add at last    
			Node rv = queue.remove(); // then ye remove 1st krke queue se 1k ko nikal dega (step 2)  _____________________________|    // queue se remove kr rhe (work 2)                                                
			
			System.out.print(rv.data+" "); //rv me 1k tha and uska data(10) print kr rhe hai(step 3)   // queue remove kiya data print kr rhe (work 3 bs)
			if(rv.left != null) { // agar rv ka left child h then                                     // queue me add kr rhe (work 1)
				queue.add(rv.left); // queue me rv ka left ko add krde
			}
			if(rv.right != null) { // agar rv ka right child h then                                   // queue me add kr rhe (work 1)
				queue.add(rv.right); // queue me rv ka right ko add krde
			}
		}
		System.out.println();
		
	}
	
	//------------------------------------
	
	public static void main(String[] args) { //isi class me main method bna diya taki client class bnane ki need na ho 
		
		Traversal tt = new Traversal(); // tt is variable name
		
		tt.PreOrder();
		tt.PostOrder();
		tt.INOrder();
		tt.LevelOrder();
	}

}

// input:-    10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false

// PreOrder   :- syso wali line Dono recursive call ke upr         //Complexity :- O(N) , because every each node ko ek br hi visit kr rhe hai
// Post Order :- syso wali line Dono recursive call ke Bich me     //Complexity :- O(N) , because every each node ko ek br hi visit kr rhe hai
// INsOrder   :- syso wali line Dono recursive call ke niche       //Complexity :- O(N) , because every each node ko ek br hi visit kr rhe hai
// Level Order:- See the code                                      //Complexity :- O(N) , because every each node ko ek br hi visit kr rhe hai











