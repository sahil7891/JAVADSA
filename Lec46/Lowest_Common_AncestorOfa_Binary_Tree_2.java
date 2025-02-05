package Lec46;

public class Lowest_Common_AncestorOfa_Binary_Tree_2 { // leetcode 1644
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	class Solution {
		public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) { // root me tree ka root node aega && p me tree ka koi bi node && q me tree ka koi bi node
			//upr wala code from leetcode 
			
			if(find(root,p) == false  ||  find(root,q) == false) { //find method se check kr rhe h ki p and q tree me h ki nhi and agar p and q available h then "LCA" wala method call hoga && agar available nhi h then
				return null; // return null
			}
			return LCA(root, p, q); // LCA method call hoga and uka O/P "lowestCommonAncestor" iss method me return krega
		}
		public TreeNode LCA(TreeNode root, TreeNode p, TreeNode q) {
			
			if(root == null) {
				return null;
			}
			if(root == p || root==q) {
				return root;
			}
			TreeNode left  = LCA(root.left, p, q);  // sare left node se p&q dono me se kisi ko b dhundle
			TreeNode right = LCA(root.right, p, q);// sare right node se p&q dono me se kisi ko b dhundle
			
			if (left != null && right != null) {
				return root;  //p & q ka closest parent //agar left and right dono hi null nhi then dono(root) ko return krde
			}
			if(left ==null) { //agar left null h then
				return right; // return right //**agar hm leaf node pr phuche jha left&right dono null h then return right se  leaf node pr right b null hoga then null return hojaega and extra code likhne ki need nhi pdegi       
			}
			else {            //agar left null nhi h then
				return left;  //return left
			}
		}
		public boolean find(TreeNode root, TreeNode p) { // same as find function in binary tree class 
			if(root==null) {
				return false;
				
			}
			if(root==p) {
				return true;
			}
			return find(root.left, p) || find(root.right, p);
		}
	}

}




