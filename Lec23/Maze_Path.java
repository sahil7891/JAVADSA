package Lec23;

public class Maze_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m = 3;
		int n = 3;
		Printpath(m - 1, n - 1, 0, 0, ""); // m-1(er), n-1(ec), 0(cr), 0(cc), ""(string)
	}

	public static void Printpath(int er, int ec, int cr, int cc, String ans) {
		// er = end row // ec = end column // cc= currnet column // cr = current row
		if (cc == ec && cr == er) {
			System.out.println(ans);
			return;
		}
		if (cc > ec || cr > er) { // ye line cc matrix ke bhr n jaye isliye likh h eg. agr cc 2 se jada hua toh return hoga((0,3) in notebook)
			return;
		}
		Printpath(er, ec, cr, cc + 1, ans + "H"); // recursive call for horizontal step
		Printpath(er, ec, cr + 1, cc, ans + "V"); // recursive call for vertical step
	}

}
//see in notebook