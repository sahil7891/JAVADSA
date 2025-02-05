package Lec45;

import Lec44.Binary_Tree.Node;
                                      
public class Diameter_of_Binary_Tree {  //complexity -> O(N^2)  // Leetcode - 543

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		    public int diameterOfBinaryTree(TreeNode root) {
		        // upr wala code leetcode se uthaya h
		    	// see in notebook
		    	
		    	if(root == null) { //base case
		    		return 0;
		    	}
		    	int ld = diameterOfBinaryTree(root.left); // ye left tree ka diameter ke liye recursive call
		    	int rd = diameterOfBinaryTree(root.right);// ye right tree ka diameter ke liye recursive call
		    	int sd = height(root.left)+ height(root.right)+2; // root se pass hone wala diameter
		    	
		    	return Math.max(ld, Math.max(rd, sd)); // teeno me se jiska lenght sbse maximum hoga wo return hokr o/p bn jaega
		    }
		    
			private int height(TreeNode node) { // upr "public class TreeNode" h 				
				if(node == null) { // base case jb node equal to null ho then
					return -1;     // return -1 krne se hm yha single node ki height ko 0 assume kr rhe hai // agar return 0 kiya hota then hm single node ki height ko 1 assume krte
				}
				int lh = height(node.left);  //recursive call for left subtree and ye left subtree ki height btaega
				int rh = height(node.right); //recursive call for right subtree and ye right subtree ki height btaega
				
				return Math.max(lh, rh)+1;   //last me left subtree and right subtree dono me se jiski height jada hogi usme +1 hokr o/p aega
			}
	}

}
