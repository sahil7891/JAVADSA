package Lec47;

public class Delete_NodeInA_BST { // Leetcode 450

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
		public TreeNode deleteNode(TreeNode root, int key) {
			if(root == null) { // agar end me leaf node tk phuchte hi present node null hua then 
				return null; //  return null; and jha return hua hoga uske left ya right ki call lgegi  
			}
			
			if(root.val<key) { //agar key ka data present node ke data se bda h then
				root.right = deleteNode(root.right, key); //right ki recursive call lga
			}
			else if (root.val>key) { //ya fir agar val ka data present node ke data se chota h then
				root.left = deleteNode(root.left, key); //left ki recursive call lga
			}
			
			
			//********* now niche key(element) milte hi delete marenge**********
			//now upr agar "if" "else" dono false hue means present node key wala node h jise delete krna h ab usse bst se delete marne ka code niche
			
			else {
				//Case 1:- agar jis node ko delete krna h uka sirf 1 child h se below code  // CASE 2:- it will have similar code see in notebook
				
				if(root.left == null) {           //case 3 pr jane se pehle ye line b check hogi agar ye line false hui then niche check kr
					return root.right;
				}else if (root.right == null) {   //case 3 pr jane se pehle ye line b check hogi THEN agar ye line FALSE hui then 3rd case wali line chlegi
					return root.left;
				}
				//---------------------------------
				//Case 3
				else {
					int leftmax = maxOfLeftSubtee(root.left);  // maxOfLeftSubtee method ko call kiya and argument me present node(key node) ke left node ka address bheja jisse leftsubtree ka max pta chle and--> iss method se jo node return hogi wo  "leftmax" me ajaegi  
					                                           // agar maxOfLeftSubtee method ko commentout krke minOfLeftSubtee wale method ko likhe to b shi h
					root.left = deleteNode(root.left, leftmax);// maxOfLeftSubtee method jis node ko return krega use deleteNode method call krke delete krde
					root.val = leftmax;                        // now root.val (key node ke data) me "leftmax" jo data dala th wo root.val me dalde
				}
			}
			return root;
		}
		//Method 1 of case 3  , with the help of this code(maxOfLeftSubtee) we also get to know that how to get the node that have " Maximum DATA " in ******BST*****
		public int maxOfLeftSubtee(TreeNode root) {  // yha root me key wale node pr phuchte hi left node ka address bhej rhe h while calling this method see above in Case 3  
			                                         // and iss method se left subtree me jo maximum value hogi usko upr jha ye methode call hua h wha use pass kr rhe h then iss node ko key node ke sath replace krdenge see in Case 3 
			if(root == null) {
				return Integer.MIN_VALUE;
			}
			int right = maxOfLeftSubtee(root.right); // recursive call//BST me right me bigger no. hota h isliye right ki call lgai h  // key wale node ki right ki call lgegi
			return Math.max(root.val, right);        //root.val and right inn dono me jo maximum h sirf whi return hoga
			
		}
	}
}
		
		//***Method 2 of case 3 ***** , Method 2 ki help se we also get to know that how to get the node that have " Minimum DATA " in ******BST***** important for interview purpose
//     else { 
//	int righttmax = minOfLeftSubtee(root.right);  // maxOfLeftSubtee method ko call kiya and argument me present node(key node) ke left node ka address bheja jisse leftsubtree ka max pta chle and--> iss method se jo node return hogi wo  "leftmax" me ajaegi  
//	                                           // agar maxOfLeftSubtee method ko commentout krke minOfLeftSubtee wale method ko likhe to b shi h
//	root.right = deleteNode(root.right, leftmax);// maxOfLeftSubtee method jis node ko return krega use deleteNode method call krke delete krde
//	root.val = righttmax;                        // now root.val (key node ke data) me "leftmax" jo data dala th wo root.val me dalde
//}
//    return root;
//    }
//		public int minOfLeftSubtee(TreeNode root) {//key wale node ka right subtree ka maximum 
//			if(root == null) {
//				return Integer.MAX_VALUE;
//			}
//			int left = minOfLeftSubtee(root.left); // key wale node ki right ki call lgegi
//			return Math.min(root.val, left);       //root.val and right inn dono me jo maximum h sirf whi return hoga
//			
//		}
//	}
//}







