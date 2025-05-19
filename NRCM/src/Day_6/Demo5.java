package Day_6;

public class Demo5 {
	void show() {
		System.out.println("hi");
	}
	class Test1{
		void print() {
			System.out.println("hello");
		}
	}
	public static void main(String[] args) {
		Demo5 d1=new Demo5();
		d1.show();
		Demo5.Test1 t1=new Demo5().new Test1();//nested inner class
		t1.print();
	}

}
