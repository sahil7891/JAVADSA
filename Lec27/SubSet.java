package Lec27;

import java.util.ArrayList;
import java.util.List;

public class SubSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
		List<Integer> list = new ArrayList<>(); //1D list
		subset(arr,0,list); //" "(ans) ke bdle list for 1D list
	}
	public static void subset(int[] arr, int i , List<Integer> list) {
		if( i == arr.length) {
			System.out.println(list);
			return;
		}
		subset(arr, i+1, list);
		list.add(arr[i]);
		subset(arr, i+1,list);
		list.remove(list.size()-1);
		}

	}
                


            