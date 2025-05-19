package Day_5;
class Sample45{
	public Sample45() {
		System.out.println("Good Evening");
	}
	int x=99;
void print() {
	System.out.println("Hello");
}
}

public class Demo14 extends Sample45 {
	public Demo14() {
		super();
	}
	void show() {
		int y=45;
		super.print();
		System.out.println(super.x);
		System.out.println(y);
	}
	public static void main(String[] args) {
	Demo14 d1=new Demo14();
	d1.show();
	d1.print();
	}
}
