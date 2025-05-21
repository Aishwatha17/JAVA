package Day_8;
 class Test1 extends Thread {
		public void run() {
			System.out.println("hi");
		}
 }
		class Test2 extends Thread {
			public void run() {
				System.out.println("good morning");
			}
		}
		public class Demo5{
		public static void main(String[] args) {
			Test1 t1=new Test1();
			Test2 t2=new Test2();
			//Thread t1=new Thread(d1);
			//Thread t2=new Thread(d2);
			//System.out.println("heloo");
			t1.start();
			t2.start();
			

		}
}
