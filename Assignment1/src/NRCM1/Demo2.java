package NRCM1;
interface Campus{
	void mrec();
}
interface Department extends Campus{
	void cse();
}

 class Csc implements Department {
	public void mrec() {
		System.out.println("MREC1");
	}
	public void cse() {
		System.out.println("CSE1");
}
	public void batch1() {
		System.out.println("Batch1");
	}
}
	class It  implements Campus,Department{
		public void mrec() {
			System.out.println("MREC2");
		}
		public void cse() {
			System.out.println("CSE2");
	}
		public void batch2() {
			System.out.println("Batch2");
		}
		
public class Demo2 extends Csc{	
public static void main(String[] args) {
	Csc c=new Csc();
	It t=new It();
	c.mrec();
	c.cse();
	c.batch1();
	t.mrec();
	t.cse();
	t.batch2();
}
}
	}

