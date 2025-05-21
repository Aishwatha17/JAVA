package NRCM1;
interface I1{
	void add();
}
interface I2{
	void sub();
}

interface I3 extends I1,I2 {
	void mul();

}
public class Demo1 implements I3{
	public void add() {
		System.out.println("hi");
	}
   public void sub() {
	   System.out.println("hello");
    }
   public void mul() {
	   System.out.println("madam");
   }
public static void main(String[] args) {
	Demo1 d1=new Demo1();
	d1.add();
	d1.sub();
	d1.mul();
}
}
