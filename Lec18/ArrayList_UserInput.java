package Lec18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList_UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ll = new ArrayList<>();
			for(int i =0; i<4; i++) {
				ll.add(sc.nextInt());
			}
			for (int i=0; i<ll.size(); i++) {
		
				System.out.println(ll.get(i));
				
				
				
			}
		}
		

	}

//Array input --4
//then  input as array -- 5 87 65 87 
//ouput me array print hoga
