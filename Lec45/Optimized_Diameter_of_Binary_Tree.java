package Lec45;

public class Optimized_Diameter_of_Binary_Tree { // complexity = O(N)  // Leetcode - 543
	
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
	public class Pairof_d_ht{
		int d = 0; // d me tree ka diameter rkhenge
		int ht = -1; //ht me tree ka height rkhenge
	}
	class Solution {
		    public int diameterOfBinaryTree(TreeNode root) { // root me root node ka adress jaega     
		        return diameter(root).d; //agar .d ke bdle .ht likhe then height return krega // yha diameter method se jo d return hokr aega use hm Pairof_d_ht wale method ko return kr rhe h
		    	
		    }
		    public Pairof_d_ht  diameter(TreeNode root) { // iss function ka name diameter h and iss function se hm "Pairof_d_ht" method ke data type ko return krenge // means diameterOfBinaryTree wale method ko (d & ht) ka pair return krke dega      
		    	if(root == null) {             //base case
		    		return new Pairof_d_ht(); //Pairof_d_ht isme -> (("d" me 0 return hoga)) & (("ht" me -1 return hoga))
		   
		    	}
		    	Pairof_d_ht ldp = diameter(root.left);    //recursive call //ldp = left diameter pair  
		    	Pairof_d_ht rdp = diameter(root.right);  //recursive call //rdp = right diameter pair
		    	
		    	Pairof_d_ht sdp = new Pairof_d_ht();   // isse present node apne ap ko root mante hue task krega // sdp name ka new Pairof_d_ht method bna liya
		    	sdp.ht = Math.max(ldp.ht, rdp.ht)+1;  //for calculating height
		    	int dia = ldp.ht + rdp.ht + 2;       //iss line se hm present node ko root node mante hue uska "Diameter" calculate kr rhe h
		    	sdp.d = Math.max(dia,Math.max(ldp.d ,  rdp.d));//ye (('dia' , 'ldp.d' , 'rdp.d')) in tino me se jo maximum hoga wo sdp.d me a jaega 
		    	
		    	return sdp;  // yha sdp me ------>    sdp.d(diameter)  &  sdp.ht(height) return kr rheh hai 
		}   
	} 
}

//basically 1st left ke leaf tk phucho 
// and upr ate time jb height and diameter calculate kr rhe hai 
//"ht(height)" - me left tree(ldp)  &  right tree(rdp)  ----inn dono ka maximum "ht" me rkhlo 
//"d(diameter)" - me left tree(ldp)  &  right tree(rdp)  &  present node ko root node mante hue jo diameter nikala h(eg:- int dia ) ----inn tino ka maximum "sdp" me rkhlo 
//upr ate time "heigh and diameter" ek sath calculate kr rhe hai and last me jo -- ht(height) return hoga wo tree ki longest hight hogi && || ese hi last me jo -- d(diameter) return hoga wo tree ki longest diameter hoga 
// return sdp; --> isme d(diameter) & ht(height) ek sath return ho rhe h


















