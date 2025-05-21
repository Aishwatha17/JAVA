package Day_7;

public class Demo11 extends Thread {

	public static void main(String[] args) { //throws InterruptedException {
		Demo11 d1=new Demo11();
		Thread t1=new Thread(d1);
		t1.start();
		System.out.println("hi");
		try {
		t1.sleep(20000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
			System.out.println("hello");

	}

}
