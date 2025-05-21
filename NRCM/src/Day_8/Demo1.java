package Day_8;


public class Demo1 extends Thread {
	public void run() {
		System.out.println("hii");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d1=new Demo1();
		System.out.println("heloo");
		d1.start();

	}

}
