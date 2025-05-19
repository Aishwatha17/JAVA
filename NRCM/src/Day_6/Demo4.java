package Day_6;
 //final class Test2t{
class Test2{
	// final void show(){
	void show() {
		System.out.println("hi");
	}
}
public class Demo4 extends Test2 {
	 void show() {
		int a=34;
		System.out.println(a);
		a=23;
		System.out.println(a);
	}
	public static void main(String[] args) {
		Demo4 d1=new Demo4();
		d1.show();
			
		
	}


}
