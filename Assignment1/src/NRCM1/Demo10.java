package NRCM1;
interface Cars{
	void type();
}
class Thar{
	public void model() {
		System.out.println("Car model");
	}
}
class Innova extends Thar implements Cars{
	public void color() {
		System.out.println("Car color");
	}
	public void type() {
		System.out.println("5 seater");
	}
}
class Shift{
	public void brand() {
		System.out.println("Maruthi suzukhi");
	}
}
class Xuv extends Shift{
	public void name() {
		System.out.println("Car name");
	}
}
public class Demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thar t1=new Thar();
		Innova t2=new Innova();
		Shift t3=new Shift();
		Xuv t4=new Xuv();
		t1.model();
		t2.type();
		t2.color();
		t2.model();
		t3.brand();
		t4.name();

	}

}
