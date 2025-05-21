package NRCM1;
interface Color{
	void red();
}
interface Rainbow{
	void blue();
}
interface Colorfull extends Color,Rainbow{
	void yellow();
		
	}
class Watercolor{
	void green() {
		System.out.println("green color");
	}
}
class Demo5 extends Watercolor{
	public void orange() {
		System.out.println("orange color");
	}
	public void red() {
		System.out.println("red color");
	}
	public void blue() {
		System.out.println("blue color");
	}
	public void yellow() {
		System.out.println("yellow color");
	}
	

public static void main(String[]args) {
	Demo5 d1=new Demo5();
	d1.green();
	d1.orange();
	d1.red();
	d1.blue();
	d1.yellow();

}
}
