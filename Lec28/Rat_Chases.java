package Lec28;

import java.util.Scanner;

public class Rat_Chases {
	
	static boolean flag = false;//global variable bna diya

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // n= row input  5
		int m = sc.nextInt();//m= colum input  4
		char[][] maze = new char[n][m]; // O X ko alag alag lena h isliye char me le rhe hai //n m ko alg alg lene ke liye char usr kr rhe hai 
		for (int i = 0; i < maze.length; i++) {  // i/p for row "n"// i=n
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				maze[i][j] = s.charAt(j);  // yha eg "O X O O " first time then 2nd row ke liye O O O X and so on
			}
		}
		int[][]ans=new int[n][m];
		path(maze,0,0,ans);
		if(flag ==false) {
			System.out.println("NO PATH FOUND");
		}
	}
	public static void path(char[][] maze, int cr, int cc,int[][] ans) {
		if(cc==maze[0].length-1 && cr== maze.length-1) { //Base case
			
//			if(maze[cr][cc]=='O') {
//		    flag = true;  
			ans [cr][cc]= 1; //last wale index pr 1 print krane ke liye
			Display(ans);   //display wale maethode ko call kiya h
			ans[cr][cc] =0; // last wale index ko wapas 0 bnane ke liye
	//		}
			return;
		}
		if (cc < 0 || cc >= maze[0].length || cr < 0 || cr >= maze.length || maze[cr][cc] == 'X') { // wapas same direction me retur move n kre//rat current position se matrix ke edge or range se bhr nhi jane dene ke liye  // maze[cr][cc] == 'X'  ye check krega ki rat ke path me X h ki nhi agr hoga then return  
			return;
		}	
		int r[] = {0,-1,0,1};  //see in notebook
		int c[] = {1,0,-1,0};  //see in notebook
		
		//  path(maze, cr, cc + 1,ans); // right
		//	path(maze, cr - 1, cc,ans);//  up
		//	path(maze, cr, cc - 1,ans); // left
		//	path(maze, cr+1, cc,ans);   // down
		
		maze[cr][cc]='X';  // current cell pr X mark kr diya then usi same cell pr revisit nhi kr skte eg arf right move krdiya then wapas left move nhi kr skte
		ans[cr] [cc]=1;  // visited cell me 1 daldiya bcoz o/p me visited cell me 1 print hoga
		for (int i =0; i <c.length; i++) {      // 4 direction me move krna h then 4 br recursive cl legi
			path(maze,cr+r[i],cc + c[i], ans); //recursive call
		}
		maze[cr][cc]='O';  //Backtracking - 1st possible o/p ke bd next o/p ke liye visited cell ko wapas se 'O' mark krne ke liye yha backtracking use ki h
		ans[cr][cc]= 0;    //Backtracking 	
		}
//	}
	public static void Display(int[][]ans) {
		for (int i =0; i <ans.length; i++) {
			for (int j=0; j<ans[0].length; j++) {
				System.out.print(ans[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("***********");

	}
}
 
//i/p =
//5 4
//O X O O
//O O O O
//X O O X
//X X O O
	


