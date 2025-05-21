package Day_8;
class Test3 extends Thread {
	public void run() {
		System.out.println("hi");
	}
}
	class Test4 implements Runnable {
		public void run() {
			System.out.println("good morning");
		}
	}
	public class Demo6{
	public static void main(String[] args) {
		Test3 t1=new Test3();
		Test4 t2=new Test4();
		//Thread t1=new Thread(d1);
		Thread t4=new Thread(t2);
		//System.out.println("heloo");
		t1.start();
		t4.start();
		

	}
	}
