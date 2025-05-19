package Day_6;
class Test1{
	// final void show(){
	void show() {
		System.out.println("hi");
	}
}
public class Demo3 extends Test1 {
	void show() {
		int a=34;
		System.out.println(a);
		a=23;
		System.out.println(a);
	}
	public static void main(String[] args) {
		Demo3 d1=new Demo3();
		d1.show();
			
		
	}

}
