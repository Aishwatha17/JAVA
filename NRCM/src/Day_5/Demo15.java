package Day_5;
class Sample46{
	int x=89;
	void print() {
		System.out.println("Hello");
	}
}
	
	public class Demo15 extends Sample46{

	void show() {
		int y=78;
		super.print();
		System.out.println(super.x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		Demo15 d1=new Demo15();
		d1.show();
	}
}

