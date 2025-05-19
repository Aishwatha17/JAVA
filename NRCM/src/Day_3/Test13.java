package Day_3;
abstract class Demo1{
	abstract void add();
	abstract void sum();
}
 class Test13 extends Demo1 {
	 public void add() {
		 System.out.println("hi");
	 }
	 public void sum() {
		 System.out.println("hello");
	 }
	public static void main(String[] args) {
		Test13 t1=new Test13();
		t1.add();
		t1.sum();
	}

}
