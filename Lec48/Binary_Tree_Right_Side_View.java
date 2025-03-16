package Lec48;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class Binary_Tree_Right_Side_View { //leetcode 199

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
    // upr wala code from leetcode
	class Solution {
		static int max_depth; // max_depth ko static liya h because jb recursive call me jb max_depth me jo changes aye the wo function frame terminate hote time max_depth wale changes terminate na ho means chnges reflect kre warna jb function call terminate hogi then max_depth ki value wapas -1 ho jaegi and esa na ho isliye static ko use kiya h   
		
		    public List<Integer> rightSideView(TreeNode root) {
		    	max_depth = -1;
		    	List<Integer> ll = new ArrayList<>(); //o/p ko list me return krna h isliye ye line likhi h
		    	View(root,ll,0); //method call
		    	return ll; //o/p wali list return hogi
		    }
		    public void View(TreeNode root ,List<Integer> ll , int curr_lev){//ek root node given hoga , ek list given hoga , and ek current level diya hai(0) see upr View(root,ll,0); wali line me
		    	
		    	if(root == null) {
		    		return;
		    	}
		    	if(curr_lev>max_depth) {
		    		ll.add(root.val);
		    		max_depth = curr_lev;
		    	}
		    	View(root.right, ll, curr_lev+1);
		    	View(root.left , ll, curr_lev+1);
		}
    }
}












