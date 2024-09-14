package oops;

public class Client_Q {
	public static void main(String[] args) {
		Queue Q=new Queue();
//		System.out.println(Q.poll()); empty poll
		Q.add(10);
		Q.add(20);
		Q.add(30);
		Q.add(40);
		Q.add(50);
//		Q.add(60); full q add
		System.out.println(Q.poll());	
		System.out.println();
		Q.display();
	}

}
