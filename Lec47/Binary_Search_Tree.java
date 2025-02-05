package Lec47;

public class Binary_Search_Tree {
	
	public class Node{
		
		int data;
		Node left;
		Node right;
		
	}
	private Node root;
	
	public Binary_Search_Tree(int [] in) { //" in " sorted array wala input h jime ek sorted array given hoga and uska inOrder traversal bnana h //ye method automatically type krne ke liye binary likhke cntr+space then --> enter 
		                                
		this.root=CreateTree(in , 0 , in.length-1); // 0 me start index aega  &&  in.length - 1 me last index aega  // ye line likhne ke bad line number 15 pr click krke enter kro then niche wala method automatically type ho jaega      
	}
	private Node CreateTree(int[] in, int si, int ei) { //si(start index) me upr se 0th index aega  &&  ei(end index) me upr se "in.length-1" iski help se last index aega
		
		if(si>ei) {
			return null;
		}
		int mid = (si+ei)/2; // mid me array ka middle index aega
		Node nn = new Node(); // new node bna reh h tree create krne ke liye
		nn.data = in[mid];    //new node ke data me mid rkh rhe h
		
		nn.left = CreateTree(in, si, mid-1);  //recursive call
		nn.right = CreateTree(in, mid+1, ei); //recursive call

		return nn; // node create hone ke bad upr wale node se connection kr rhe h
	}

}














