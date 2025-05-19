package cdc1;
class Sample21{
		public void add() {
			System.out.println("public");
		}
	}
    public class Sample2 extends Sample21{
	public static void main(String[] args) {
		Sample2 s1=new Sample2();
		s1.add();
	}
}
