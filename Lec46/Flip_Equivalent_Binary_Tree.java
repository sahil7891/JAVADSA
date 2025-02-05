package Lec46;

public class Flip_Equivalent_Binary_Tree { //Leetcode 951
	
	  public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode() {}
		      TreeNode(int val) { this.val = val; }
		      TreeNode(int val, TreeNode left, TreeNode right) {
		          this.val = val;
		          this.left = left;
		          this.right = right;
		      }
		  }
		 
		class Solution {
		    public boolean flipEquiv(TreeNode root1, TreeNode root2) { // dono tree ka root bhej rhe h root1 and root2 me
		    	
		    	if(root1==null && root2 == null) {   // agar dono nodes null h then // case 1 see in notebook                     ---------
					return true;                     // return true                                                                        |
				}                                    //                                                                                    |
				if(root1 == null || root2 == null) { // agar dono nodes me se koi ek hi node null h then // case 2 see in notebook         |
					return false;                    // return false                                                                       | ye sali line check krne ke liye h ki left and right tree ka data and null same h ya nhi  jo hm niche dono recursive call se bhej rhe h  
				}                                    //                                                                                    |
				if(root1.val != root2.val) {         // agar dono nodes ki value(data) same nhi h then   // case 3 see in notebook         |
					return false;                    // return false                                                               ---------
							
				}
				boolean flip = flipEquiv(root1.left, root2.right)   &&   flipEquiv(root1.right, root2.left);   // see in in notebook // ek br mirror se check kr rhe h and
		    	
				boolean noflip = flipEquiv(root1.left, root2.left)   &&   flipEquiv(root1.right, root2.right); // see in in notebook // and ek br bina  mirror ke check kr rhe h and
				
				return flip || noflip; //indo me se koi true ya false dega but agar kisi ne true bheja hoga then hm true wale ko hi return krenge
		    }
	  }
}











