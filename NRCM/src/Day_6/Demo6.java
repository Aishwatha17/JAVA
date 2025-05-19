package Day_6;

public class Demo6 {
	void show() {
		System.out.println("Good Afternoon");
		class Test2{
			void print() {
				System.out.println("hello");
			}
		}
		Test2 t1=new Test2();
		t1.print();
	}

	public static void main(String[] args) {//method local inner class
		// TODO Auto-generated method stub
       Demo6 d1=new Demo6();
       d1.show();
	}

}
