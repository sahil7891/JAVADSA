package Lec48;

public class Validate_Binary_Search_Tree { //Leetcode 98

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
	
	//---------------------------------------------
	
	public class BstPair{ // ye class niche ki 3 information rkhne ke liye bnai h
		boolean isbst = true; // boolean type ka variable liya h to know bst h ya nhi
		long min = Long.MAX_VALUE; // infinity
		long max = Long.MIN_VALUE; //- infinty
	}
	class Solution {
		public boolean isValidBST(TreeNode root) {
			return validbst(root).isbst;
		}
		public BstPair validbst(TreeNode root) {
			if(root == null) {
				return new BstPair();
			}
			BstPair lbst = validbst(root.left);  //recursive call
			BstPair rbst = validbst(root.right); //recursive call
			
			BstPair sbst = new BstPair();
			if(lbst.isbst == true  &&  rbst.isbst == true  &&  lbst.max < root.val  &&  rbst.min > root.val) {
				sbst.isbst = true;
				sbst.max = Math.max(rbst.max, root.val);
				sbst.min = Math.min(lbst.min, root.val);
				
				return sbst;
			}
			sbst.isbst = false; // agar upr if wali line true nhi hui then it means tree bst nhi h and sbst me false retrun hoga
			                    // niche ki do line isliye likhi h taki bhlehi tree false ho fir b min and max btana ho
			sbst.max = Math.max(rbst.max , Math.max(lbst.max, root.val));
			sbst.min =  Math.min(rbst.min , Math.min(lbst.min, root.val));
			
			return sbst;
		}
	}
}















