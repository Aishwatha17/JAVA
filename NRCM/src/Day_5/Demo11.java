package Day_5;
interface I1{
	abstract void add();
	void sub();
}
public class Demo11 implements I1 {
	public void add() {
		System.out.println("hi");
	}
	public void sub() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo11 d1=new Demo11();
		d1.add();
		d1.sub();

	}

}
