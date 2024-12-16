package Lec38;

import Lec37.Stack;     //Lec 37 me se Stack class ko import kiya h taki usko use kr ske //Lec37 se Stack class ko import krna pd rha hai because Lec37 other package hai

public class DynamicStack extends Stack { //Lec 37 me se Stack class ko inherit kiya hai eg:- "DynamicStack extends Stack" Taki Stack class ki properties ko use kr ske                                    
                                        //To understanding purpose for eg:- yah DynamicStack == child hai __&__ Stack == parent hai
	@Override
	public void push (int item) throws Exception{
	
		if(super.isfull()) {
			
			int [] arr = new int [2* super.data.length]; // isse Stack ka size double ho jaega
			
			for (int i = 0; i < super.data.length; i++) {
				arr[i] = super.data[i]; // loop ki help se new stack or u can say new size wali stack me purana data copy krde
			}
			super.data = arr; // ye line data me arr ka adderss daldega
		}
		super.push(item);// Stack class se push wale function chlega // "super" likhna pdega wrna  agar sirf "push(item);" likhdenge toh recursive call lag jaegi
			//"super" variable tb use krte h jb same name ka variable child and parent class me ho eg:-data
	        // "super" ki help se always parent class ke variable get hoga
	}
}




// Dynamic Stack bnane ka purpose ye h ki Stack ka size fix na ho for eg:-100 , balki Stack ka size elements dalne ke sath increase hote jaye 
// Normal Stack ka size fixed hota h eg:- 100 and dynamic stack ka size elements input krne ke sath sath badhta h

//4 types ke access modifier hote hai eg 1- default , 2- public , 3- private , 4- Protected
//eg 1- default --> see in Lec 37 Stack class -->     //  int [] data; // ab ye defaul variable or access modifire h jo ki sirf same package me access ho stkta ho another packge me access nhi hoga means another class me inherit nhi kr skte	
// 4- Protected -->  ye same default ki trh hota h but ise inherit kiya ja skta hai another package me
//eg 4- Protected --> see in Lec 37 Stack class --> 	protected int [] data; //  protected ko Lec38 ke liye use kiye hai see there wrna Stack wale code ke liye private hi better h iss code ke liye ye wali line comment out krdena
