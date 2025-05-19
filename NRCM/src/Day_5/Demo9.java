package Day_5;
class Test34{
	void add() {
		System.out.println("hi");
	}
}
public class Demo9 extends Test34 {
	void add() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		Demo9 d1=new Demo9();
		d1.add();
		
	}
	
}


	