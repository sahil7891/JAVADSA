 package Lec44;

public class Binary_Tree_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Binary_Tree bt = new Binary_Tree();
		
		bt.Display(); // Binary Tree class se Display method ko call kiya h
		
		System.out.println(bt.max()); //50
		
		System.out.println(bt.find(30)); // true aega because 30 present hai tree me
		System.out.println(bt.height()); // height = 2

	}

}


// Input:-        10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false




