package Lec38;

public class DynamicStack_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicStack ds = new DynamicStack();
		ds.push(10);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		ds.push(50);
		System.out.println(ds.peek()); //stack me peek pr 50 h yha tk
		ds.push(60);
		
		ds.Display();
		
		ds.push(100);
		ds.push(200);
		ds.push(300);
		ds.push(400);
		ds.push(500);
		
		ds.Display();


	}

}
// now ye stack dynamic h jisme elements ke according stack ka size increase ho rha hai