package Lec22;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 4;
		System.out.println("\n" + BoardPath(n, 0, "")); // "" is string

	}

	public static int BoardPath(int end, int curr, String ans) {
		if (curr == end) {
			System.out.println(ans + " ");
			return 1;
		}
		if (curr > end) {
			return 0;
		}
		int fp = BoardPath(end, curr + 1, ans + 1);//recursive call
		int sp = BoardPath(end, curr + 2, ans + 2);//recursive call
		int tp = BoardPath(end, curr + 3, ans + 3);//recursive call
		return fp + sp + tp;
	}

}
