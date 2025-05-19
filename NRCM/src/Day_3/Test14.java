package Day_3;

abstract class Demo2{
	abstract void display();
	abstract void show();
}
  class Test14 extends Demo2 {
	 public void display() {
		 System.out.println("hi how are you");
	 }
	 public void show() {
		 System.out.println("yes i am fine");
	 }
	public static void main(String[] args) {
		Test14 t1=new Test14();
		t1.display();
		t1.show();
	}

}

