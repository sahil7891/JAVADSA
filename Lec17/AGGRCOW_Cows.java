package Lec17;

import java.util.*;

public class AGGRCOW_Cows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			// stall -- > n
			int nos = sc.nextInt();// number of stalls
			int noc = sc.nextInt(); // number of cows
			int[] stall = new int[nos];
			for (int i = 0; i < stall.length; i++) {
				stall[i] = sc.nextInt();
			}
			Arrays.sort(stall);

		}
	}

	public static int LargestMidDistance(int[] stall, int noc) {
		int low = 0;
		int high = stall[stall.length - 1] - stall[0];// 9-1
		int ans = 0;
		while (low <= high) {
			int mid = (low = high) / 2;
			if (isitpossible(stall, mid, noc) == true) {
				ans = mid;
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return ans;
	}

	public static boolean isitpossible(int[] stall, int mid, int noc) {
		int cows = 1;// count of cow
		int position = stall[0];
		int i = 1;
		while (i < stall.length) {
			if (stall[i] - position >= mid) {
				cows++;
				position = stall[i];
			}
			if (cows == noc) {
				return true;

			}
			
		}

		return false;
	}

}
