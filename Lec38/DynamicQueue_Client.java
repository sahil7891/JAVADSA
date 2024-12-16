package Lec38;

public class DynamicQueue_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		DynamicQueue dq = new DynamicQueue();
		
		dq.Enqueue(10);
		dq.Enqueue(20);
		dq.Enqueue(30);
		dq.Enqueue(40);
		
		System.out.println(dq.Dequeue()); //10
		System.out.println(dq.Dequeue()); //20
		
		dq.Enqueue(50);
		dq.Enqueue(60);
		dq.Enqueue(70);
		
		dq.Display(); // Queue se 10 & 20 niklne ke bad 30 40 50 60 70 bchenge
		
		dq.Enqueue(80);
		dq.Enqueue(90);
		dq.Display(); //Queue me 80&90 add hone ke bad 30 40 50 60 70 80 90 Queue me ye data honge
		System.out.println(dq.getfont()); //Queue me sbse pehle 30 h
	
	}

}


//now ye Queue dynamic h jisme elements ke according Queue ka size increase ho rha hai
