package Day_8;

public class Demo10 extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			if(i==5) {
				try {
					Thread.sleep(2000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
	

	public static void main(String[] args) {
		Demo10 d1=new Demo10();
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
		d1.start();

	}

}
