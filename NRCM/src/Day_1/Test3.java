package Day_1;

public class Test3 {
	int x=45,y=78;
	static int p=56,q=23;
	 
	void div() {
		int a=9,b=10;
		System.out.println(x+y);
		System.out.println(p+q);
		System.out.println(a+b);
	}
	static void show() {
		int a=8,b=6;
		System.out.println(p+q);
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Test3 t3=new Test3();
		t3.div();
		show();
	}

}
