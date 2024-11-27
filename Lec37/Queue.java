package Lec37;

public class Queue {
	private int [] data;   // yha array ko private bnaya h taki queueclient access na kr ske and client ko pta na chle ki hm queue banane ke liye array ka use kr rhe hai
	private int front = 0; //front is pointer in this//get front(in notebook) ke liye liye pointer le liya and ye point krega ki queue me front me konsa element h // front class data member hai
	private int size = 0;  //size pta krne ke liye size name ka variable liye h and initially queue ka size 0 hoga isliye 0 liya h
	
	public Queue() {  // queue ka constructor bnaya hai
		this.data = new int [5]; // 5 size array made by us 
	}
	
	public Queue(int cap) {
		this.data = new int [cap]; //size of array given by user // user and us wale me se koi ek ka hi size hoga
		
	}
	public boolean isEmpty() { // see in notebook
		
		return this.size == 0; // if size 0 hai then queue empty hai
	}
    public boolean isfull() { // see in notebook
		
		return this.size == this.data.length; // if queue ka length equal to queue ka size hai then queue full hai
	}
    public int size() {  // see in notebook
    	return this.size; //starting me size name ka variable liiya h jo queue ka size bta rha hai
    	
    }
    public void Enqueue(int item) throws Exception {  // see in notebook //see in stack class 'push wali line'
    	
    	if(isfull()) {
    		throw new Exception ("sun pgl h ?? Queue full Tune Enqueue krke jada element daldiye unhe km kr hai");
    	}
    	int i = (this.size+this.front)% this.data.length; //see in notebook
    	this.data[i] = item;         //item client ka dala hua data yafir element hoga eg-10,20,30 then
    	this.size++;                 // size 1 se increase ho jayega and next size wale index pr another data client class ke through enter hoga isi trh size 1,2,3,4 se increase hoga
    
    }
    
    public int Dequeue() throws Exception{ //see in notebook
    	
    	if(isEmpty()) {
    		throw new Exception ("sun pgl h ?? Queue full hai");
    	}
    	
    	int rv = this.data[this.front];  //eg- queue me 10,20,30,40,50 and 10 ko nikalna hai then front 0th index means 10 pr hoga and where rv=10 and client class ke throuth jb 10 ko nikaldenge then 
    	this.front = (this.front+1) % this.data.length;       // fornt +1 hokr front 20 ko point krga //starting me front name ka pointer liiya h
    	this.size--; //element delet hone pr size bhi reduse hoga
    	return rv;   //rv full form = remove value
    }
	
	public int getfont() throws Exception { //see in notebook
		if(isEmpty()) {
    		throw new Exception ("sun pgl h ?? Queue full hai");
    	}
		return this.data[this.front];  // ya dequeue ka data return kr diya
		
	}
	public void Display() {
		
		for (int i = 0; i < this.size; i++) {  //jitan Queue me element(queue ka "size") hoga utni br print hoga
			int idx = (this.front+i)% this.data.length; // data input dene ke bd jha se "front" point kr rha hoga wha se print hona start hoga
			                                            // this.data.length; isse isliye use kiya eg- agar front index no. 2pr h and wha se o/p print hona start hua then index no. 0 and 1 ko print krwane ke liye % krna pdega see in notebook
			System.out.print(this.data[idx]+" "); // array ke data me is is index ko print krde
		}
		System.out.println();

	}
}
   















