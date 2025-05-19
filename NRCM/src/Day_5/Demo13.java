package Day_5;
interface I31{
	void add();
}
class Test1{
	void sub() {
		System.out.println("helloo");
	}
}

public class Demo13 extends Test1 implements I31 {
	public void add() {
		System.out.println("hi");
	}

public static void main(String[] args) {
	Demo13 d1=new Demo13();
	d1.add();
	d1.sub();
}
}
