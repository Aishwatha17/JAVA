package Day_8;

public class Demo3 implements Runnable {
	public void run() {
		System.out.println("hii");
	}

	public static void main(String[] args) {
		Demo3 d1=new Demo3();
		Demo3 d2=new Demo3();
		Thread t1=new Thread(d1);
		Thread t2=new Thread(d2);
		System.out.println("heloo");
		t1.start();
		t2.start();
		

	}

}

