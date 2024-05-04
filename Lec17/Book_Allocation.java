package Lec17;

public class Book_Allocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []pages = {10,20,30,40};
		int nos = 2;// nos->number of students
	
		System.out.println(minimumpages(pages,nos));
	}
	public static int minimumpages(int []pages, int nos) {
		int low =0;
		int high =0;
		for (int i = 0; i<pages.length; i++) {
			high=high+pages[i];
			
		}
		int ans = 0;
		while (low <= high) {
			int mid = (low = high) / 2;
			if (isitpossible(pages, mid, nos) == true) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}
	public static boolean isitpossible(int [] pages, int mid, int nos) {
		int student =1;
		int read_page=0;
		int i = 0;
		while(i<pages.length) {
			if(read_page+pages[i]<=mid) {
				read_page+=pages[i];
				i++;
				
			}
			else {
				student++;
				read_page=0;
			}
			if (student > nos) {
				return false;
			}
		}
		return true;
		}
	}
















