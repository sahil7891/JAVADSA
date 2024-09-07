package Lec29;

public class Word_Search_Leetcode79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] maze = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
			String word = "ABCCED";
			for (int i = 0; i < maze.length; i++) {
				for (int j = 0; j < maze[0].length; j++) {
					if (maze[i][j] ==word.charAt(0)) { //see in note book ** 2D matrix me cr&cc  every cell me row wise check hoga ki 'cr&cc == word.charAt(0)' h ya nhi and jese hi kisi cell me 'word.charAt(0)' or 'A' milta h then 'findword' wala method call hoga
						boolean ans = findword(maze,i,j,word,0); //function call
						if(ans == true) { //ans = true - then print true
							System.out.println(ans); //if(idx==word.length()) agar ye true hua then o/p true print hoga`
							return;
					}	
				}
			}
		}
			System.out.println(false);

	}
	public static boolean findword(char [][] maze, int cr,int cc, String word, int idx){ // idx word(ABCCED) ke 0th index ko mentain krne ke liye
		//cr = current row-> 0th row , cc = current column-> 1st column
		if(idx==word.length()) {// ans word ki length ke equal return hoga and jb length brbr ho jayegi then return true //end me// if (ans == true)
			return true;  //if(ans == true)  ko true bhejega and o/p true print hoga
		}
		if(cc<0 || cc>=maze[0].length || cr<0 || cr>=maze.length || maze[cr][cc]!=word.charAt(idx)) {//maze[cr][cc]!=word.charAt(idx) -> means if cr,cc == word ka index then tabhi call lage // agar cr,cc grid or 2D list ke bhr or range ke bhr ja rhe then return false// same phle wali direction pr move kr rhe hai then return
			return false;//agar upr wali line false hui then yha se 'false return' ho jayega 'main' me and next cell se loop continue hoga
		}
			int[] r = {-1,1,0,0};// for movingn in 4 direction from cr,cc
			                                                                    //r-1 ,c 0 = up //r1, c0 = down// r0 ,c1 = right// r0, c-1 = left
		    int[] c = {0,0,1,-1};// for movingn in 4 direction from cr,cc see in notebook 
		    
		   // int[] r = {-1,1,0,0,-1,1,1,-1};
		   //int[] c = {0,0,1,-1,1,1,-1,-1};  //ye dono line 8 direction me cl dene ke liye mean diagnoly bhi move kr skte hai matlab cross movement bhi
		    
		   maze [cr][cc] ='*'; //visited mark krne ke liye bcos same path pr dobara nhi ja skte and * isliye liya h bcos maxtrix me or 2D grid me already ABC.. or (Alphabets) hai
		
		   for (int i = 0; i < c.length; i++) { // 4ro direction me loop lga diya
	       
			   boolean ans= findword(maze, cr+r[i], cc+c[i], word, idx+1); //4ro direction ke liye call -> int[]r= {-1,1,0,0}; , ansd int[]c   //idx+1 = i+1 jakr character find krna means i0 to i1 in ans so on // ans me word ka age ka index find kr rha hai// recursive call        
			 //2nd charecter find krne ke liye 'UP' ki cl jayegi int r[] intc[] 'A' se up ki call jayegi then out of matrix  or out of range ho jayega  if(|| cr<0 )   isliye wha return false hokr dobara se yha ayega usle bd fir 'DOWN' ki call jayegi and if(|| maze[cr][cc]!=word.charAt(idx) ki wjh se yha se b waps return a jayega  then fir RIGHT ki call lgte hi move hoga 'B' ke liye and b ko visited mark kr dega
			   //***cr+r[i]*** => i0-> -1 UP, i1-> 1 DOWN, i2->0 RIGHT, i3->0   LEFT
			   //***cc+c[i]*** => i0-> 0  UP , i1->0 DOWN, i2->1 RIGHT, i3-> -1 LEFT
			   if (ans == true) { // if ans me word ke charecter milte h then return ans //if(idx==word.length()) ke pass jayega
				return ans;
			}
		}
		   maze [cr][cc] = word.charAt(idx); //Backtracking-> maze [cr][cc] ='*'; ise undo krne ke liye Backtrack kiya hai taki visited wale cell * ke bdle waps se 2D list ke original charecter a jaye
	
		   return false;  // last me agar pure matrix or grid ke liye code run ho jayega then phir bhi word nhi mila then 'main' me return false and next cell se start hoga if uske charecter n mile end me then o/p me false print ho jayega
	}
		
  }

















