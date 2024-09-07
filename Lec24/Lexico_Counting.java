package Lec24;

public class Lexico_Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000;
		Lexicographical(0, n);
	}

	public static void Lexicographical(int curr, int end) {
		if (curr > end) {
			return;
		}
		System.out.println(curr);
		int i = 0; //for loop ke i ko yha initialize kiya h
		if (curr == 0) {
			i = 1; //if(curr==0) then for loop ka i=1 se initialize hoga
		}
		for (; i <= 9; i++) {
			Lexicographical(curr * 10 + i, end);
		}
	}

}
//see in notebook
