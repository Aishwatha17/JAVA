package NRCM1;
interface Flowers{
	void rose();
}
interface Jasmine{
	void redrose();
}
interface Lilly{
	void pinkrose();
}
class Sunflower implements Flowers,Jasmine,Lilly{
	void orangerose() {
		System.out.println("Orange Rose");
	}
	public void rose() {
		System.out.println("Rose flower");
	}
	public void redrose() {
		System.out.println("red rose");
	}
	public void pinkrose() {
		System.out.println("pink rose");
	}
}
interface yellowrose {
public void yellowrose() ;
}	
public class Demo6 extends Sunflower implements yellowrose{
	public void yellowrose() {
		System.out.println("yellow rose");
	}

	public static void main(String[] args) {
		Demo6 d= new Demo6();
		d.pinkrose();
		d.rose();
		d.orangerose();
		d.yellowrose();
	}

}