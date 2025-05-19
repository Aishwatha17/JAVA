package cdc1;
class Sample20{
	private void add() {
		System.out.println("private");
	}
}
	public class Sample3 extends Sample20{
		public static void main(String[] args) {
			Sample3 s1=new Sample3();
			s1.add();
		}
	}


