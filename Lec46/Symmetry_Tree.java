package Lec46;

public class Symmetry_Tree { //Leetcode - 101
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
		public boolean isSymmetric(TreeNode root) {
			 return Mirror(root.left, root.right); // (root.left, root.right) isse niche mirror wale method me root node ka left and right bhej rhe h // and "return Mirror" ki help se Mirror wale  code ka jo O/P hoga wo "isSymmetric" ka o/p hoga         
       }
		public boolean Mirror(TreeNode root1, TreeNode root2) { //root node ka left and right bhej rhe h  argument me 
			if(root1==null && root2 == null) {   // agar dono nodes null h then // case 1 see in notebook
				return true;                     // return true
			}
			if(root1 == null || root2 == null) { // agar dono nodes me se koi ek hi node null h then // case 2 see in notebook
				return false;                    // return false
			}
			if(root1.val != root2.val) {         // agar dono nodes ki value(data) same nhi h then   // case 3 see in notebook
				return false;                    // return false
						
			}
			
			boolean left = Mirror(root1.left, root2.right); //recursive call
			boolean right = Mirror(root1.right, root2.left);//recursive call
			return left && right; // agar dono (left subtree & right subtree) hi true return kr rhe h then o/p b true hoga
		}
	}
}

















 
