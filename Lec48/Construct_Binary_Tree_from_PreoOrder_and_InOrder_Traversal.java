package Lec48;

public class Construct_Binary_Tree_from_PreoOrder_and_InOrder_Traversal { // See Recording
	// Leetcode 105

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
		public TreeNode buildTree(int[] preorder, int[] inorder) {
			return Create(preorder,0,preorder.length-1, inorder, 0, inorder.length-1);

		}

		private TreeNode Create(int[] preorder, int plo,int phi, int[] inorder, int inlo, int inhi) { // int[] preorder, int plo,int phi <-- isme preorder wala array(input) bhejenge   // int[] inorder, int inlo, int inhi <-- isme inorder  wala array(input) bhejenge   
			//plo== preorder ka low means 0th index //phi== preorder ka high means last index //inlo== inorder ka low means 0th index inhi== inorder ka high means last index

			if(inlo>inhi || plo>phi) { //base case
				return null;
			}
			TreeNode nn = new TreeNode(preorder[plo]); //ek new node bnigi jisme preorder ka 0th index hoga 
			int i = Search(inorder, inlo ,inhi, preorder[plo]);  // i me inorder wale array me jis index pr upr preorder wala data hoga wo i me ajaega
			int net = i-inlo; // isse ye pta chlega ki kitne elements(nodes) h tree me
			nn.left = Create(preorder, plo+1, phi+net, inorder, inlo, i-1); 
			nn.right = Create(preorder, plo+net+1, phi, inorder, i+1, inhi);
					
			return nn;
		}
		public int Search(int []inorder , int si ,int ei , int item) {
			for(int i = si; i<=ei; i++) {
				if(inorder[i] == item) {
					return i;
					
				}
			}
			return 0;
		}
	}

}
