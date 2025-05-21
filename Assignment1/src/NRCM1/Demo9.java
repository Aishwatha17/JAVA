package NRCM1;
interface dog{
	void bark();
}
interface cat{
	void sleep();
}
interface fox{
	void eat();
}
interface Tiger extends dog,cat,fox{
	void talk(); 
	}

public class Demo9 implements Tiger{
	public void run() {
		System.out.println("Running");
	}
	public void bark() {
		System.out.println("Dog is barking");
	}
	public void sleep() {
		System.out.println("Cat is sleeping");
	}
	public void eat() {
		System.out.println("Fox is eating");
	}
	public void talk() {
		System.out.println("Tiger is talking");
	}
	public static void main(String[] args) {
		Demo9 d1=new Demo9();
		d1.run();
		d1.bark();
		d1.sleep();
		d1.eat();
		d1.talk();
	}

}
