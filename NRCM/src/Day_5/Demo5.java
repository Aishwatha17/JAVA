package Day_5;
class Chocolate{
	void eat() {
		System.out.println("Eat Chocolate");
	}
}
class Dark extends Chocolate{
	void taste1() {
		System.out.println("dark chocolate yummy");
	}
}
class Sweet extends Chocolate{
	void taste2() {
		System.out.println("Chocolate is sweet");
	}
}
class Bournvilla extends Dark{
	void cost1() {
		System.out.println("Bourvilla cost is 100");
	}
}
class Amul extends Dark{
	void cost2() {
		System.out.println("Amul cost is 200");
	}
}
class Dairymilk extends Sweet{
	void weight1() {
		System.out.println("Dairymilk weight is 100g");
	}
}
class Kitkat extends Sweet{
	void weight2() {
		System.out.println("Kitkat weight is 50g");
	}
}
public class Demo5 {
	public static void main(String[] args) {
		Bournvilla b1=new Bournvilla();
		Amul a1=new Amul();
		Dairymilk d1=new Dairymilk();
		Kitkat k1=new Kitkat();
		b1.eat();
		b1.taste1();
		b1.cost1();
		a1.eat();
		a1.taste1();
		a1.cost2();
		d1.eat();
		d1.taste2();
		d1.weight1();
		k1.eat();
		k1.taste2();
		k1.weight2();
	}

}
