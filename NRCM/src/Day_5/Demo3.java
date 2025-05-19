package Day_5;
class Fruits{
	void benefits() {
		System.out.println("healthy");
		
	}
}
class Apple extends Fruits{
	void color() {
		System.out.println("red");
		
	}
}
class Mango extends Fruits{
	void price() {
		System.out.println("100 kg");
	}
}
class Banana extends Fruits{
	void sweet() {
		System.out.println("yummy");
	}
}
public class Demo3 {
	public static void main(String[] args) {
		Apple a1=new Apple();
		Mango m1=new Mango();
		Banana b1=new Banana();
		a1.benefits();
		a1.color();
		//m1.benefits();
		m1.price();
		//b1.benefits();   //mutli path
		b1.sweet();
		
	}

}
