 package Lec37;

public class Queue_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	//	Queue ka size by default 5 rhega bcoz hmne koi size nhi diya and 'queue class' me made by us wala size 5 h
		Queue qq = new Queue();
		qq.Enqueue(10);
		qq.Enqueue(20);
		qq.Enqueue(30);
		qq.Enqueue(40);
		qq.Enqueue(50);
		
		qq.Display(); //upr wale 4ro elements print honge
		
		System.out.println(qq.Dequeue());//10 nikl jayega
		System.out.println(qq.Dequeue());//20 nikl jayega
		
		qq.Display(); //ab 30 , 40 bchenge
		
		qq.Enqueue(60); // 30 , 40 ke bd 60 add hoga
		qq.Enqueue(70); // 30 , 40 ,60 ke bd 70 add hoga
		qq.Enqueue(80); // 30 , 40 , 60, 70 ke bd 80 add hoga
		
		qq.Display();   // 30 40 60 70 80 print hoga

	}

}
