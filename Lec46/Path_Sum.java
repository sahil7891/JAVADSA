package Lec46;

public class Path_Sum {

	public class TreeNode { //leetcode = 112
		
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
		    public boolean hasPathSum(TreeNode root, int targetSum) { // binary tree ke root ka address 'root' me denge & target me (eg:-22)
		    	//upr wala code from leetcode 
		    	
		    	if(root == null) { // agar root hi null h then
		    		return false;  // false
		    	}
		    	if(root.left == null  && root.right == null) { //agar present node leaf node h then
		    		return targetSum - root.val == 0;         // LEAF node tk phuchte hi agar target 0 hogya h then return "true"
		    	}   	
		    	return hasPathSum(root.left, targetSum -root.val) || hasPathSum(root.right, targetSum -root.val); // in dono recusive call ka kam - tree me call lgte hue niche jate time target se node ka data subtract kr rhe h  
		    	
                //instead of niche wali 3 line hmne upr wali 1 line likhi h

		    	//hasPathSum(root.left, targetSum -root.val) <--  upr wali line me se ye left wali recursive call h
		    	//hasPathSum(root.right, targetSum -root.val <--  upr wali line me se ye right wali recursive call h
		    	//return ate time " || "<- iski help se right subtree ki call nhi lgegi and o/p true aega 
		    	
	    }
	}
}


 












