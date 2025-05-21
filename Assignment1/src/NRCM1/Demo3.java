package NRCM1;
interface Icecream{
	void chocobar();
}
class Cone {
	void chocobyte() {
		System.out.println("chocobyte");
	}
}
class Mango extends Cone implements Icecream{
	public void minibyte() {
		System.out.println("minibyte is mini");
	}
	public void chocobar() {
		System.out.println("Chocobar icecream");
	}
}
class Demo3 extends Mango{
	public void oreoice() {
		System.out.println("Oreo icecream");
	}
	public static void main(String[] args) {
		Demo3 d1=new Demo3();
		d1.minibyte();
		d1.chocobar();
		d1.chocobyte();
		d1.oreoice();
	}
}



