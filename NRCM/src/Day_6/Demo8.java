
package Day_6;
class Test34{
	void show() {
		System.out.println("hi");
	}
}

public class Demo8 {
	Test34 t=new Test34() {
		void show() {
			System.out.println("hello");
			super.show();
		}
	};

	public static void main(String[] args) {//anynomous inner class
		// TODO Auto-generated method stub
		Demo8 d1=new Demo8();
		d1.t.show();
		

	}

}
