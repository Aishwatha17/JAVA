package Day_5;
public class Demo6 {
	void add() {
		System.out.println("hi");
	}
	void add(int a) {
		System.out.println(a);
	}
	void add(int a,int b) {
		System.out.println(a+b);
	}
	void add(int a,int b,double d1) {
		System.out.println(a+b-d1);
	}
	public static void main(String[] args) {
		Demo6 d1=new Demo6();
		d1.add();
		d1.add(34);
		d1.add(2,7);
		d1.add(4,6,8.8);
	}

}
