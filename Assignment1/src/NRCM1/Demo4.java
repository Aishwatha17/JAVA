package NRCM1;
interface School{
	void student();
}
interface Name{
	void section();
}
class Playschool{
	void kids() {
		System.out.println("Kids school");
	}
}
class Demo4 extends Playschool{
	public void nursery() {
		System.out.println("Nursery students");
	
}
	public void student() {
		System.out.println("Studends are in school");
	}
	public void section() {
		System.out.println("section B students");
	}
	
public static void main(String[] args) {
	Demo4 d1=new Demo4();
	d1.student();
	d1.section();
	d1.nursery();
	d1.kids();
}
}