package Lec46;

public class Sum_Root_to_Leaf_Numbers { //Leet code - 129

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
		    public int sumNumbers(TreeNode root) { // root me tree ke root ka address denge
		        	//upr wala code from leetcode
		    	    // val node ka data rkhenge see upr
		    	return sum(root,0);
			}
		    public int sum(TreeNode root , int n) { //int n me 0 aega see upr in "return sum(root,0);" wali line //int n me string na lekr normal variable lenge because string me time complexity jada hogi        
		    	if(root == null) { // starting me agar root node hi null h then
		    		return 0;      // return 0; 
		    	}
		    	if(root.left == null   &&   root.right == null) {//to check ki present node "leaf" node h ya nhi and agar wo node root node h then
		    		return n*10 + root.val; //n*10 + val return krde
		    	}
		    	int ln = sum(root.left,   n*10+root.val); //recursive call
		    	int rn = sum(root.right,  n*10+root.val); //recursive call
		    	return ln+rn; 
		    }
	  }
} 












