package Day_6;

public class Demo1 extends Object{
	int a=89;
	void add() {
		int a=89;
		System.out.println(a);
	}
	void sub() {
		System.out.println(this.a);
		this.add();
	}//local we cannot access by this kayword

public static void main(String[] args) {
	Demo1 d1=new Demo1();
	d1.sub();
}
}