package Day_8;
class Test5 extends Thread {
	public void run() {
		System.out.println("hello");
	}
}
	class Test6 extends Test5 {
		public void run() {
			System.out.println("good morning");
		}
	}
	class Test7 implements Runnable {
		public void run() {
			System.out.println("good afternoon");
		}
	}
	class Test8 extends Test7 {
		public void run() {
			System.out.println("good evening");
		}
	}
	public class Demo7{
	public static void main(String[] args) {
		Test6 t6=new Test6();
		Test5 t5=new Test5();
		Test7 t7=new Test7();
		Test8 t8=new Test8();
	
		t6.start();
		t5.start();
		Thread t1=new Thread(t7);
		t1.start();
		Thread t2=new Thread(t8);
		t2.start();

	}
	}
