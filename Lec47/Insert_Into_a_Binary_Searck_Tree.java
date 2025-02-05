package Lec47;

public class Insert_Into_a_Binary_Searck_Tree { // leetcode 701

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
		public TreeNode insertIntoBST(TreeNode root, int val) { //root me root node ka data bhejenge and val wo data bhejenge jo add krna BST me
			if (root == null) {                 //now leaf node pr ate hi add val node ko tree me add krne ka code further //agar present node null pr h then
				TreeNode n = new TreeNode();    // ek new node bna and
				n.val = val;                    // val ka jo data h wo new node me dalde
				return n;                       // and jha se call ayi h uske left ja right me new node ka data dlade

			}
			if (val > root.val) {               //agar val ka data present node ke data se bda h then
				root.right = insertIntoBST(root.right, val);  //right ki recursive call lga
			} else {                            //ya fir agar val ka data present node ke data se chota h then
				root.left = insertIntoBST(root.left, val); //left ki recursive call lga

			}
			return root;  // upr "return n; " wali line chlne ke bad jha se call ayi thi wha return hoj see in notebook  
		}

	}

}
