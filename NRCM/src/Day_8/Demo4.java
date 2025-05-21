package Day_8;
public class Demo4 implements Runnable {
	public void run() {
		System.out.println("hii");
	}

	public static void main(String[] args) {
		Demo4 d1=new Demo4();
		Demo4 d2=new Demo4();
		//Thread t1=new Thread(d1);
		//Thread t2=new Thread(d2);
		System.out.println("heloo");
		d1.run();
		d2.run();
		

	}

}


