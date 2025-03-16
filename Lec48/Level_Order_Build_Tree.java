package Lec48;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Level_Order_Build_Tree {

	Scanner sc = new Scanner(System.in); // Scanner type krke ctr+space dbane pr -> import java.util.Scanner; ye line automatically upr type ho jaegi

	public class Node { // 3 information rkkne ke liye Node class bnai hai eg:- data , left , right

		// see in notebook
		int data; // data int type ka h isliye usme integer vali value rkhenge
		Node left; // left -> Node type ka h isliye usme address rkhenge
		Node right; // right -> Node type ka h isliye usme address rkhenge

	}

	private Node root;

	public Level_Order_Build_Tree() {
		CreateTree();
	}

	private void CreateTree() {  // Creating level order binary tree

		Queue<Node> qq = new LinkedList<>();
		int item = sc.nextInt(); //input:-   10 20 30 -1 -1 40 -1 -1 -1
		Node nn = new Node();
		nn.data = item;

		this.root = nn;

		qq.add(nn);
		while (!qq.isEmpty()) {
			Node rv = qq.remove();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if (c1 != -1) {       //for adding left child
				Node n = new Node();
				n.data = c1;
				rv.left = n;
				qq.add(n);
			}
			if (c2 != -1) {       //for adding right child
				Node n = new Node();
				n.data = c2;
				rv.right = n;
				qq.add(n);
			}
		}
	}
	//**************************
	// Lec45 me Traversal wale class me Level Order ke code me binary tree bna bnaya mila tha create tree wale method se and hm usse level order me print kr rhe the
	// but in this code hame ek LevelOrder ke liye input diya hai jisse ham LevelOrder ke according (binary tree)node bna rhe h				
	// Lec45 Traversal wale code me level order wale code se b print kr skte h jisse level order me print hoga  but hmne yaha upr jo level order wala tree bnaya h use print krne ke liye niche "PreOrder" ka use kiya h
	//**************************
	
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
	
	public static void main(String[] args) {
		
		Level_Order_Build_Tree lbt = new Level_Order_Build_Tree();
		lbt.PreOrder();
				
	}
}








