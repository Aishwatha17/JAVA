package Day_8;

public class Demo11 implements Runnable {
	public void run() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Thread t1=new Thread(new Demo11());
        t1.start();
	}

}
