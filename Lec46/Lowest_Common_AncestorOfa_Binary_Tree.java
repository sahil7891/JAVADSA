package Lec46;

public class Lowest_Common_AncestorOfa_Binary_Tree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	class Solution {
		public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
			
			
			if(root == null) {
				return null;
			}
			if(root == p || root==q) {
				return root;
			}
			TreeNode left  = lowestCommonAncestor(root.left, p, q);  // sare left node se p&q dono me se kisi ko b dhundle
			TreeNode right = lowestCommonAncestor(root.right, p, q);// sare right node se p&q dono me se kisi ko b dhundle
			
			if (left != null && right != null) {
				return root;  //p & q ka closest parent //agar left and right dono hi null nhi then dono(root) ko return krde
			}
			if(left == null) { //agar left null h then
				return right; // return right //**agar hm leaf node pr phuche jha left&right dono null h then return right se  leaf node pr right b null hoga then null return hojaega and extra code likhne ki need nhi pdegi       
			}
			else {            //agar left null nhi h then
				return left;  //return left
			}
		}
	}

}

