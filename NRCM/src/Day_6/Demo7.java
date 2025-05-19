package Day_6;
class Demo80{
	private static void show() {
		System.out.println("hi");
	}
	static class Test1{
		static void print() {
			System.out.println("hello");
			show();
		}
	}// static inner class
}

public class Demo7 {
	public static void main(String[] args) {
		Demo80.Test1.print();
	}

}
