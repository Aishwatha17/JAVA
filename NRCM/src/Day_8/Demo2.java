package Day_8;
public class Demo2 implements Runnable {
	public void run() {
		System.out.println("hii");
	}

	public static void main(String[] args) {
		Demo2 d1=new Demo2();
		Thread t2=new Thread(d1);
		System.out.println("heloo");
		t2.start();

	}

}
