package Lec12;

public class FirstBadVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	public static int badversion(int n ) {
		int low = 1;
		int high= n;
		int ans =0;
		while (low<=high) {
			
			int mid = (low+high)/2;
		if (isBadVersion(mid) == true) {
			ans=mid;
			high=mid-1;
		}
		else {
			low =mid+1;
		}
	}
		return ans;

}
	public static boolean isBadVersion(int mid) {
		// TODO Auto-generated method stub
		return false;
	}
}