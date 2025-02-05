package Lec46;

public class Balanced_Binary_Tree { // Leetcode 110 

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
	//upr wala code from leetcode
	
	public class BalancedPair{ // self made
		boolean isbal = true;
		int ht = -1;
	}

	class Solution {
		public boolean isBalanced(TreeNode root) {   //  ye code kafi hd ti Optimized_Diameter_of_Binary_Tree wale code ki trh h
			return TreeBalanced(root).isbal;
			
		}
		public BalancedPair TreeBalanced(TreeNode root) {
			 if(root == null) {
				 return new BalancedPair();
			 }
			BalancedPair lbp = TreeBalanced(root.left);
			BalancedPair rbp = TreeBalanced(root.right);
			
			BalancedPair sbp = new BalancedPair();
			sbp.ht = Math.max(lbp.ht, rbp.ht)+1;
			int bf = Math.abs(lbp.ht - rbp.ht);   // " abs " ek positive value dega 
			   
			sbp.isbal = lbp.isbal   &&   rbp.isbal   &&   bf<=1;
			return sbp;	 // sbp me "ht"(height)  and  "isbal"(true/false) return kr rhe h
			
		}
	}
}
			
			//niche wala algorithm b likh skte the but upr wala code jada optimized h
			
//			if (root == null) {
//				return true;
//			}
//			boolean left = isBalanced(root.left);
//			boolean right = isBalanced(root.right);
//			boolean self = Math.abs(ht(root.left) - ht(root.right)) <= 1;
//			return left && right && self;
//		}
//
//		public int ht(TreeNode root) {
//			if (root == null) {
//				return -1;
//			}
//
//			int lh = ht(root.left);
//			int rh = ht(root.right);
//			return Math.max(lh, rh) + 1;
//
//		}
//	}
//}
















