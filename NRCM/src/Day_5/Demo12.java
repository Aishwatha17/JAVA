package Day_5;
interface I11{
	void add();
	}
interface I21{
	void sub();
}

public class Demo12 implements I11,I21{
	public void add() {
		System.out.println("hi");
	}
	public void sub() {
		System.out.println("helloooo");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo12 d1=new Demo12();
		d1.add();
		d1.sub();
	}
	}

