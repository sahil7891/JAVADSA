package Lec37;

public class Stack {     // How to imlement STACK // STACK kese banana hai se below ye code me hm stack bna rhe hai
	private int [] data; // data name ka array // ise private bnaya hai taki other class me diricty access na ho jisse kisi bhi index pr jisse LIFO SIMETRY ORDER mentain nhi paega ,see in oops
	private int top =0;          // class ka data member // top ye bataega ki konse index pr element rkhna hai taki STACK mentain rhe , top 0 se start ho rha hai means (eg - 0th index)

	public Stack() { //stack constructor
		this.data = new int [5]; // 5 size ka array or capacity is 5  **made by us
	}
	
	public Stack(int cap) {      // agar user intially hme koi capacity dega then
		this.data = new int[cap];// ham utne size or capacity ka array bna denge  ** made by user  //  made by us and  made by user dono me se ek use hoga
	}
	
	 
	public boolean isEmpty() { 
		return top == 0;           //TOP data member hai or u can say 'pointer' & ye btaega ki value or element kha rkhni hai , TOP == peek (see in note book) and top ke upr konsa data ya element rkhna hai iski help se rkhte h
	}                             
	public boolean isfull() {      // see in notebook
		return this.top == this.data.length; //jab top array ke last index pr pahuck jayega
	}
	
	public void push(int item) throws Exception {   // see in notebook(function)
		
		if(isfull()) { //if stack is full//ye true or false dega stack_Client ko push wali line me
			throw new Exception("Sun be pgl hai?, Stack full hogya hai");  //Exception line likhi h bcos agar stack ke size se jada elements input de diye then ye exception ayga
		}
		
		this.data[this.top] = item; //stack me data rkhenge then
		this.top++;  // top ko ek index age bdha denge taki agla element rkh ske means top ka index increase hote rhega eg 1,2,3.. until limit is reached
	}
	public int pop ()  throws Exception {  // see in notebook(function)
		
		if(isEmpty()) { //yha bhi Exception lgana pdega bcos agr Stack khali hui then stack Client wali class me fir bhi pop ka code likhne Exception a jaye
			throw new Exception("Sun be pgl hai?, Stack Empty hai"); 

		}
		this.top--;      //top= toop-1// top ka 1 index waps jana pdege bcos push wale code TOP++ horha h // TOP jis index pr present hoga wo index khali assume hota hai means waha kuch bhi data dal skte h and privious data apne ap ht jaega(overwriting)
		return this.data[this.top]; // then top ka present index wala data return hojauga
	}
	public int peek () throws Exception{  // see in notebook(function)
		
		if(isEmpty()) { //yha bhi Exception lgana pdega bcos agr Stack khali hui then stack Client wali class me fir bhi peek ka code likhne Exception a jaye
			throw new Exception("Sun be pgl hai?, Stack Empty hai"); 

		}
		return this.data[this.top-1];  // ye btaga ki top pr konsa data hai, top -1 hokr(ek index peche akr)

	}
	public int size() {  // see in notebook(function) 
		return this.top;  //top ke index no se pta chl jaega ki kitna size h stack ka 
	}
	public void Display() { 
		for (int i = 0; i < top; i++) { //i < top; means if top is 5 then it print 5 times elements
			System.out.println(this.data[i]+" "); //index no. one se print hona start hoga and top wale index tk print hoga
		}
		System.out.println();
	}

}

//This code is for How to imlement STACK // STACK kese banana hai se below ye code me hm stack bna rhe hai

//Stack -> Stack is the data structure means way to store the data and isme data ko "last in and first out"(LIFO) manner RKHTE HAI
//Array-> me contigius manner me data store krte hai jo ki homoginious type ka hota hai, homoginius mean integer,string,float type ka data
 