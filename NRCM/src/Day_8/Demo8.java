package Day_8;

public class Demo8 extends Thread {
	String s;
	public Demo8(String name) {
		s=name;
	}
    public void run() {
    	if(Thread.currentThread().isDaemon()) {
    		System.out.println(s + " is Daemon Thread");
    	}
    	else {
    		System.out.println(s + " is User Thread");
    	}
    }
	public static void main(String[] args) {
		Demo8 thread1= new Demo8("thread1");
		Demo8 thread2= new Demo8("thread2");
		Demo8 thread3= new Demo8("thread3");
		
      thread1.setDaemon(true);//set user thread1 to Daemon
      thread1.start();//starting thread1
      thread2.start();//starting thread2
      thread3.setDaemon(false);//set user thread1 to Daemon
      thread3.start();//starting thread3
      
	}

}
